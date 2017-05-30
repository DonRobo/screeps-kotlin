package com.donrobo.screeps.binding

import com.donrobo.screeps.binding.externals.*
import kotlin.js.Json

val Creep.memory: MemoryAccess
    get() {
        return MemoryAccess.instance()["creeps"][this.name]
    }

@Suppress("UNCHECKED_CAST")
val InternalGameClass.spawnsKt: Map<String, StructureSpawn>
    get() {
        return (toMap(this.spawns) as Map<String, StructureSpawn>)
    }

@Suppress("UNCHECKED_CAST")
val InternalGameClass.structuresKt: Map<String, Structure>
    get() {
        return toMap(this.structures) as Map<String, Structure>

    }

@Suppress("UNCHECKED_CAST")
val InternalGameClass.constructionSitesKt: Map<String, ConstructionSite>
    get() {
        return toMap(this.constructionSites) as Map<String, ConstructionSite>
    }

@Suppress("UNCHECKED_CAST")
val InternalGameClass.creepsKt: Map<String, Creep>
    get() {
        return toMap(this.creeps) as Map<String, Creep>
    }

fun StructureSpawn.canCreateCreepKt(body: List<CreepPart>, name: String? = null): Status {
    val status = this.canCreateCreep(body.asSequence().map { it.value }.toJsArray(), name)

    return Status.fromValue(status)
}

fun StructureSpawn.createCreepKt(body: List<CreepPart>, name: String? = null, memory: Map<String, Any?>? = null): CreepCreationStatus {
    val result = this.createCreep(body.asSequence().map { it.value }.toJsArray(), name, toJson(memory))

    val status: Status
    val resultName: String?
    if (result is String) {
        status = Status.OK
        resultName = result
    } else if (result is Int) {
        status = Status.fromValue(result)
        resultName = null
    } else {
        throw RuntimeException("Unexpected result type")
    }

    return CreepCreationStatus(status, resultName)
}

data class CreepCreationStatus(val status: Status, val name: String?)

enum class Status(val value: Int) {
    OK(com.donrobo.screeps.binding.externals.OK),
    ERR_NOT_OWNER(com.donrobo.screeps.binding.externals.ERR_NOT_OWNER),
    ERR_NO_PATH(com.donrobo.screeps.binding.externals.ERR_NO_PATH),
    ERR_NAME_EXISTS(com.donrobo.screeps.binding.externals.ERR_NAME_EXISTS),
    ERR_BUSY(com.donrobo.screeps.binding.externals.ERR_BUSY),
    ERR_NOT_FOUND(com.donrobo.screeps.binding.externals.ERR_NOT_FOUND),
    ERR_NOT_ENOUGH_RESOURCES(com.donrobo.screeps.binding.externals.ERR_NOT_ENOUGH_RESOURCES),
    ERR_NOT_ENOUGH_ENERGY(com.donrobo.screeps.binding.externals.ERR_NOT_ENOUGH_ENERGY),
    ERR_INVALID_TARGET(com.donrobo.screeps.binding.externals.ERR_INVALID_TARGET),
    ERR_FULL(com.donrobo.screeps.binding.externals.ERR_FULL),
    ERR_NOT_IN_RANGE(com.donrobo.screeps.binding.externals.ERR_NOT_IN_RANGE),
    ERR_INVALID_ARGS(com.donrobo.screeps.binding.externals.ERR_INVALID_ARGS),
    ERR_TIRED(com.donrobo.screeps.binding.externals.ERR_TIRED),
    ERR_NO_BODYPART(com.donrobo.screeps.binding.externals.ERR_NO_BODYPART),
    ERR_NOT_ENOUGH_EXTENSIONS(com.donrobo.screeps.binding.externals.ERR_NOT_ENOUGH_EXTENSIONS),
    ERR_RCL_NOT_ENOUGH(com.donrobo.screeps.binding.externals.ERR_RCL_NOT_ENOUGH),
    ERR_GCL_NOT_ENOUGH(com.donrobo.screeps.binding.externals.ERR_GCL_NOT_ENOUGH);

    companion object {
        fun fromValue(value: Int): Status {
            for (status in values()) {
                if (status.value == value)
                    return status
            }

            throw RuntimeException("$value not a valid error code!")
        }
    }
}

enum class CreepPart(val value: String) {
    MOVE(com.donrobo.screeps.binding.externals.MOVE),
    WORK(com.donrobo.screeps.binding.externals.WORK),
    CARRY(com.donrobo.screeps.binding.externals.CARRY),
    ATTACK(com.donrobo.screeps.binding.externals.ATTACK),
    RANGED_ATTACK(com.donrobo.screeps.binding.externals.RANGED_ATTACK),
    HEAL(com.donrobo.screeps.binding.externals.HEAL),
    TOUGH(com.donrobo.screeps.binding.externals.TOUGH),
    CLAIM(com.donrobo.screeps.binding.externals.CLAIM)
}

class MemoryAccess private constructor(private val rawMemory: Json) {

    @Suppress("UNCHECKED_CAST_TO_NATIVE_INTERFACE")
    operator fun get(key: String): MemoryAccess {
        var prop: dynamic = rawMemory[key]

        if (prop == null) {
            prop = js("new Object()")
            rawMemory[key] = prop
        }

        if (prop is String || prop is Number)
            throw RuntimeException("Expected object")

        return MemoryAccess(prop)
    }

    fun getString(key: String): String? {
        val string: dynamic = rawMemory[key]
        return string
    }

    fun getInt(key: String): Int? {
        val integer: dynamic = rawMemory[key]
        return integer
    }

    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    fun delete(key: String) {
        val rawMemory = this.rawMemory
        js("delete rawMemory[key]")
    }

    @Suppress("UNUSED_VARIABLE")
    val keys: Array<String> get() {
        val rawMemory = this.rawMemory
        return js("Object.keys(rawMemory)")
    }

    operator fun set(key: String, value: Any) {
        rawMemory[key] = value
    }

    companion object {
        private var instance: MemoryAccess? = null

        fun instance(): MemoryAccess {
            if (instance == null) {
                instance = MemoryAccess(Memory)
            }
            return instance as MemoryAccess
        }
    }
}