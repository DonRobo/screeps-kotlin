import kotlin.js.Json

//TODO implement
external class Room

external class RoomPosition

external class Owner

class Creep

// Singletons
external val Game: InternalGameClass

// Classes
external class InternalGameClass {
    val spawns: Json
}

external open class RoomObject {
    val pos: RoomPosition
    val room: Room?
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
    val my: Boolean
    val owner: Owner
}

external class StructureSpawn : OwnedStructure {
    val energy: Int
    val energyCapacity: Int
    val memory: Any
    val name: String
    val spawning: SpawningValue
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
