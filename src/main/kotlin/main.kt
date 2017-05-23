import com.donrobo.screeps.binding.CreepPart
import com.donrobo.screeps.binding.GameKt
import com.donrobo.screeps.binding.Status
import com.donrobo.screeps.binding.externals.Game
import com.donrobo.screeps.binding.externals.StructureSpawn

fun loop() {
    println("Still ${Game.cpu.bucket} CPU left in bucket")
    println("CPU: ${Game.cpu.getUsed()}")
    GameKt.spawns.values.asSequence()
            .filter { it.energy >= it.energyCapacity }
            .forEach { spawn ->
                if (spawn.canCreateCreep(listOf(CreepPart.MOVE, CreepPart.CARRY)) == Status.OK)
                    println("${spawn.name} could spawn something")
            }
    println("CPU: ${Game.cpu.getUsed()}")
    GameKt.structures.values.forEach { structure ->
        if (structure is StructureSpawn) {
            println("Found spawner: ${structure.name}")
        } else {
            println("Found other structure: ${structure.id}")
        }
    }
    GameKt.constructionSites.values.forEach { constructionSite ->
        //        println("${constructionSite.structureType} being built")
        constructionSite.id
    }
    println("CPU: ${Game.cpu.getUsed()}")
}