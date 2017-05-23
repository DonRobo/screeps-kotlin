package com.donrobo.screeps.binding.externals

import kotlin.js.Json

//TODO implement
external class Room

external class RoomPosition

external class Creep

// Singletons
external val Game: InternalGameClass

// Classes
external class InternalGameClass {

    val spawns: Json
    val cpu: CpuValue
    val structures: Json
    val constructionSites: Json
}

external class Owner {
    val username: String
}

external class CpuValue {
    val limit: Int
    val tickLimit: Int
    val bucket: Int
    fun getUsed(): Int
}

external open class RoomObject {
    val pos: RoomPosition
    val room: Room?
}

external open class ConstructionSite : RoomObject {
    val id: String
    val my: Boolean
    val owner: Owner
    val progress: Int
    val progresssTotal: Int
    val structureType: String
    fun remove(): Int
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
    fun canCreateCreep(body: Array<String>, name: String? = definedExternally): Int
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

//Constants
external var OK: Int = definedExternally
external var ERR_NOT_OWNER: Int = definedExternally
external var ERR_NO_PATH: Int = definedExternally
external var ERR_NAME_EXISTS: Int = definedExternally
external var ERR_BUSY: Int = definedExternally
external var ERR_NOT_FOUND: Int = definedExternally
external var ERR_NOT_ENOUGH_RESOURCES: Int = definedExternally
external var ERR_NOT_ENOUGH_ENERGY: Int = definedExternally
external var ERR_INVALID_TARGET: Int = definedExternally
external var ERR_FULL: Int = definedExternally
external var ERR_NOT_IN_RANGE: Int = definedExternally
external var ERR_INVALID_ARGS: Int = definedExternally
external var ERR_TIRED: Int = definedExternally
external var ERR_NO_BODYPART: Int = definedExternally
external var ERR_NOT_ENOUGH_EXTENSIONS: Int = definedExternally
external var ERR_RCL_NOT_ENOUGH: Int = definedExternally
external var ERR_GCL_NOT_ENOUGH: Int = definedExternally

external var MOVE: String = definedExternally
external var WORK: String = definedExternally
external var CARRY: String = definedExternally
external var ATTACK: String = definedExternally
external var RANGED_ATTACK: String = definedExternally
external var TOUGH: String = definedExternally
external var HEAL: String = definedExternally
external var CLAIM: String = definedExternally
