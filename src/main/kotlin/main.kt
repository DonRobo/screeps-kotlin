fun loop() {
    val spawnMap = toMap(asJsObject(Game.spawns))
    spawnMap.values.map { it as StructureSpawn }.forEach { it ->
        println("${it.name}: ${it.energy}")
    }
}