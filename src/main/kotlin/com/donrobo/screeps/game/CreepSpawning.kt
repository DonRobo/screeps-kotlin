package com.donrobo.screeps.game

import com.donrobo.screeps.binding.*
import com.donrobo.screeps.binding.externals.Game

enum class CreepType {
    WORKER,
    TRANSPORTER,
    MINER,
    SOLDIER,
    UNDEFINED
}

enum class Priority(val value: Int) {
    NONE(-1), //don't build
    LOW(0), //jo wenn sons nix is
    MEDIUM(1), //normal
    HIGH(2)//HOLY SHIT THEY ARE ATTACKING MY FACE
}

fun creepSpawning() {
    val creepCounts: MutableMap<CreepType, Int> = CreepType.values().asSequence().associate { Pair(it, 0) }.toMutableMap()

    Game.creepsKt.forEach { (_, creep) ->
        val creepType = CreepType.valueOf(creep.memory.getString("type") ?: CreepType.UNDEFINED.name)
        val count: Int = creepCounts[creepType] ?: 0
        creepCounts.put(creepType, count + 1)
    }

    val requiredPriorities: List<Pair<CreepType, Priority>> =
            creepCounts.asSequence().map { (type, count) -> Pair(type, calculatePriority(type, count)) }.sortedBy { -it.second.value }.toList()
//    println(requiredPriorities.size)
    if (requiredPriorities.isNotEmpty() && requiredPriorities[0].second != Priority.NONE) {
//        println("trying to spawn something")
        spawnCreep(requiredPriorities[0].first)
    }
}

fun spawnCreep(creepType: CreepType) {
    Game.spawnsKt.values.first().createCreepKt(body = getBodyFor(creepType), memory = mapOf(Pair("type", creepType.name)))
}

fun getBodyFor(creepType: CreepType): List<CreepPart> {
    when (creepType) {
        CreepType.WORKER -> return listOf(CreepPart.WORK, CreepPart.MOVE, CreepPart.CARRY)
        else -> TODO("$creepType's body is not supported yet")
    }
}

fun calculatePriority(type: CreepType, count: Int): Priority {
    when (type) {
        CreepType.WORKER -> if (count == 0) return Priority.MEDIUM else Priority.NONE
        else -> return Priority.NONE
    }
    return Priority.NONE
}
