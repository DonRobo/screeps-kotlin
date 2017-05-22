import com.donrobo.screeps.binding.CreepPart
import com.donrobo.screeps.binding.GameKt
import com.donrobo.screeps.binding.Status
import com.donrobo.screeps.binding.externals.Game

fun loop() {
    GameKt.spawns.values
            .filter { it.energy >= it.energyCapacity }
            .forEach { spawn ->
                if (spawn.canCreateCreep(listOf(CreepPart.MOVE, CreepPart.CARRY)) == Status.OK)
                    println("${spawn.name} could spawn something")
            }
    println("Still ${Game.cpu.bucket} CPU left in bucket")
    println("Used ${Game.cpu.getUsed()} CPU doing basically nothing")
}