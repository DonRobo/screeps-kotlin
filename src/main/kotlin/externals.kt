import kotlin.js.Json

//TODO implement
external class Room

external class RoomPosition

external class Owner

class Creep

// Singletons
external val Game: GameClass

// Classes
external class GameClass {
    val spawns: Json
}

external open class RoomObject {
    var prototype: RoomObject
    var pos: RoomPosition
    var room: Room?
}

external open class Structure : RoomObject {
    val hits: Number
    val hitsMax: Number
    val id: String
    val structureType: String
    fun destroy(): Number
    fun isActive(): Boolean
    fun notifyWhenAttacked(enabled: Boolean): Number
}

external open class OwnedStructure : Structure {
    var my: Boolean
    var owner: Owner
}

external class StructureSpawn : OwnedStructure {
    var energy: Number
    var energyCapacity: Number
    var memory: Any
    var name: String
    var spawning: SpawningValue
    fun canCreateCreep(body: Array<String>, name: String? = definedExternally): Number
    fun createCreep(body: Array<String>, name: String? = definedExternally, memory: Any? = definedExternally): dynamic /* Number | String */
    fun renewCreep(target: Creep): Number
    fun recycleCreep(target: Creep): Number
    fun transferEnergy(target: Creep, amount: Number? = definedExternally): Number
}

external class SpawningValue {
    val name: String
    val needTime: Number
    val remainingTime: Number
}
