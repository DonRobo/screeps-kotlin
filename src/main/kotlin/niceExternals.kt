class GameKt {
    companion object {
        val spawns: Map<String, StructureSpawn>
            get() = toMap(Game.spawns) as Map<String, StructureSpawn>
    }
}