import kotlin.js.Json

external val Game: GameClass

external class GameClass {
    val spawns: Json
}

external class StructureSpawn {
    val energy: Number
    val name: String
}
