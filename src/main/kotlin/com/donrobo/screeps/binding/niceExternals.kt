package com.donrobo.screeps.binding

import com.donrobo.screeps.binding.externals.*
import kotlin.js.Json

class GameKt {
    companion object {
        val spawns: Map<String, StructureSpawn>
            get() {
                return (toMap(Game.spawns) as Map<String, StructureSpawn>)
            }

        val structures: Map<String, Structure>
            get() {
                return toMap(Game.structures) as Map<String, Structure>
            }
        val constructionSites: Map<String, ConstructionSite>
            get() {
                return toMap(Game.constructionSites) as Map<String, ConstructionSite>
            }
    }
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

fun StructureSpawn.canCreateCreepKt(body: List<CreepPart>, name: String? = null): Status {
    val status = this.canCreateCreep(body.asSequence().map { it.value }.toJsArray(), name)

    return Status.fromValue(status)
}

fun StructureSpawn.createCreepKt(body: List<CreepPart>, name: String? = null, memory: Any? = null): CreepCreationStatus {
    val result = this.createCreep(body.asSequence().map { it.value }.toJsArray(), name, memory)

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
    ERR_NAME_EXISTS(com.donrobo.screeps.binding.externals.ERR_NAME_EXISTS),
    ERR_BUSY(com.donrobo.screeps.binding.externals.ERR_BUSY),
    ERR_NOT_ENOUGH_ENERGY(com.donrobo.screeps.binding.externals.ERR_NOT_ENOUGH_ENERGY),
    ERR_INVALID_ARGS(com.donrobo.screeps.binding.externals.ERR_INVALID_ARGS),
    ERR_RCL_NOT_ENOUGH(com.donrobo.screeps.binding.externals.ERR_RCL_NOT_ENOUGH);

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
    CARRY(com.donrobo.screeps.binding.externals.CARRY),
    ATTACK(com.donrobo.screeps.binding.externals.ATTACK),
    RANGED_ATTACK(com.donrobo.screeps.binding.externals.RANGED_ATTACK),
    HEAL(com.donrobo.screeps.binding.externals.HEAL),
    TOUGH(com.donrobo.screeps.binding.externals.TOUGH),
    CLAIM(com.donrobo.screeps.binding.externals.CLAIM)
}
