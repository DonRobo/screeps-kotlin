import com.donrobo.screeps.binding.MemoryAccess

fun loop() {
    MemoryAccess.instance()["debug"]["test"] = "Hello"
    println(MemoryAccess.instance()["debug"].getString("userTest"))
}