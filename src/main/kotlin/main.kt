import com.donrobo.screeps.binding.MemoryAccess

fun loop() {
    println(MemoryAccess.instance().keys.asSequence().joinToString())
}