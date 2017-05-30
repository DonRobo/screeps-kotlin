package com.donrobo.screeps.game

import com.donrobo.screeps.binding.MemoryAccess
import com.donrobo.screeps.binding.creepsKt
import com.donrobo.screeps.binding.externals.Game

fun doHouseKeeping() {
    removeOldMemories()
}

fun removeOldMemories() {
    val creepMemories = MemoryAccess.instance()["creeps"].keys
    creepMemories
            .asSequence()
            .filterNot { Game.creepsKt.containsKey(it) }
            .forEach {
                MemoryAccess.instance()["creeps"].delete(it)
                println("Clearing non-existing creep memory: $it")
            }

}
