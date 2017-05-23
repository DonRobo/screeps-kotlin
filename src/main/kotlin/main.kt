import com.donrobo.screeps.binding.GameKt
import com.donrobo.screeps.binding.MemoryAccess

fun loop() {
    val creepMemories = MemoryAccess.instance()["creeps"].keys
    creepMemories
            .asSequence()
            .filterNot { GameKt.creeps.containsKey(it) }
            .forEach {
                MemoryAccess.instance()["creeps"].delete(it)
                println("Clearing non-existing creep memory: $it")
            }
}