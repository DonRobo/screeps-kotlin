package com.donrobo.screeps.binding.externals

import kotlin.js.Json

//TODO implement

external class Room
external class RoomPosition
external class StructureController : Structure
external class Resource
external class Mineral
external class Source
external class PathStep
external class MoveToOpts

// Singletons
external val Game: InternalGameClass
external val Memory: Json

// Classes

external class Creep : RoomObject {
    val body: Array<CreepPartValue>
    val carry: Json
    val carryCapacity: Int
    val fatigue: Int
    val hits: Int
    val hitsMax: Int
    val id: String
    val my: Boolean
    val name: String
    val owner: Owner
    val saying: String
    val spawning: Boolean
    val ticksToLive: Int
    fun attack(creep: Creep): Int
    fun attack(target: Structure): Int
    fun attackController(target: StructureController): Int
    fun build(target: ConstructionSite): Int
    fun cancelOrder(methodName: String): Int
    fun claimController(target: StructureController): Int
    fun dismantle(target: Structure): Int
    fun drop(resourceType: String, amount: Int? = definedExternally): Int
    fun generateSafeMode(target: StructureController): Int
    fun getActiveBodyparts(type: String): Int
    fun harvest(target: Source): Int
    fun harvest(target: Mineral): Int
    fun heal(target: Creep): Int
    fun move(direction: Int): Int
    fun moveByPath(path: Array<PathStep>): Int
    fun moveByPath(path: Array<RoomPosition>): Int
    fun moveByPath(path: String): Int
    fun moveTo(x: Int, y: Int, opts: MoveToOpts? = definedExternally): Int
    fun moveTo(target: RoomPosition, opts: MoveToOpts? = definedExternally): Int
    fun notifyWhenAttacked(enabled: Boolean): Int
    fun pickup(target: Resource): Int
    fun rangedAttack(target: Creep): Int
    fun rangedAttack(target: Structure): Int
    fun rangedHeal(target: Creep): Int
    fun rangedMassAttack(): Int
    fun repair(target: Structure): Int
    fun reserveController(target: StructureController): Int
    fun say(message: String, toPublic: Boolean? = definedExternally): Int
    fun signController(target: StructureController, text: String): Int
    fun suicide(): Int
    fun transfer(target: Creep, resourceType: String, amount: Int? = definedExternally): Int
    fun transfer(target: Structure, resourceType: String, amount: Int? = definedExternally): Int
    fun upgradeController(target: StructureController): Int
    fun withdraw(target: Structure, resourceType: String, amount: Int? = definedExternally): Int
}


external class CreepPartValue {
    val boost: String?
    val type: String
    val hits: Int
}


external class InternalGameClass {
    val spawns: Json
    val cpu: CpuValue
    val structures: Json
    val constructionSites: Json
    val creeps: Json
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
    val hits: Int
    val hitsMax: Int
    val id: String
    val structureType: String
    fun destroy(): Int
    fun isActive(): Boolean
    fun notifyWhenAttacked(enabled: Boolean): Int
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
    fun createCreep(body: Array<String>, name: String? = definedExternally, memory: Any? = definedExternally): dynamic /* Int | String */
    fun renewCreep(target: Creep): Int
    fun recycleCreep(target: Creep): Int
    fun transferEnergy(target: Creep, amount: Int? = definedExternally): Int
}

external class SpawningValue {
    val name: String
    val needTime: Int
    val remainingTime: Int
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
