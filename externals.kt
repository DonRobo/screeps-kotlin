import kotlin.js.*
import kotlin.js.Json
import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.dom.events.*
import org.w3c.dom.parsing.*
import org.w3c.dom.svg.*
import org.w3c.dom.url.*
import org.w3c.fetch.*
import org.w3c.files.*
import org.w3c.notifications.*
import org.w3c.performance.*
import org.w3c.workers.*
import org.w3c.xhr.*

external var OK: Any /* "0" */ = definedExternally
external var ERR_NOT_OWNER: Any /* "null" */ = definedExternally
external var ERR_NO_PATH: Any /* "null" */ = definedExternally
external var ERR_NAME_EXISTS: Any /* "null" */ = definedExternally
external var ERR_BUSY: Any /* "null" */ = definedExternally
external var ERR_NOT_FOUND: Any /* "null" */ = definedExternally
external var ERR_NOT_ENOUGH_RESOURCES: Any /* "null" */ = definedExternally
external var ERR_NOT_ENOUGH_ENERGY: Any /* "null" */ = definedExternally
external var ERR_INVALID_TARGET: Any /* "null" */ = definedExternally
external var ERR_FULL: Any /* "null" */ = definedExternally
external var ERR_NOT_IN_RANGE: Any /* "null" */ = definedExternally
external var ERR_INVALID_ARGS: Any /* "null" */ = definedExternally
external var ERR_TIRED: Any /* "null" */ = definedExternally
external var ERR_NO_BODYPART: Any /* "null" */ = definedExternally
external var ERR_NOT_ENOUGH_EXTENSIONS: Any /* "null" */ = definedExternally
external var ERR_RCL_NOT_ENOUGH: Any /* "null" */ = definedExternally
external var ERR_GCL_NOT_ENOUGH: Any /* "null" */ = definedExternally
external var FIND_EXIT_TOP: Any /* "1" */ = definedExternally
external var FIND_EXIT_RIGHT: Any /* "3" */ = definedExternally
external var FIND_EXIT_BOTTOM: Any /* "5" */ = definedExternally
external var FIND_EXIT_LEFT: Any /* "7" */ = definedExternally
external var FIND_EXIT: Any /* "10" */ = definedExternally
external var FIND_CREEPS: Any /* "101" */ = definedExternally
external var FIND_MY_CREEPS: Any /* "102" */ = definedExternally
external var FIND_HOSTILE_CREEPS: Any /* "103" */ = definedExternally
external var FIND_SOURCES_ACTIVE: Any /* "104" */ = definedExternally
external var FIND_SOURCES: Any /* "105" */ = definedExternally
external var FIND_DROPPED_RESOURCES: Any /* "106" */ = definedExternally
external var FIND_DROPPED_ENERGY: Any /* "106" */ = definedExternally
external var FIND_STRUCTURES: Any /* "107" */ = definedExternally
external var FIND_MY_STRUCTURES: Any /* "108" */ = definedExternally
external var FIND_HOSTILE_STRUCTURES: Any /* "109" */ = definedExternally
external var FIND_FLAGS: Any /* "110" */ = definedExternally
external var FIND_CONSTRUCTION_SITES: Any /* "111" */ = definedExternally
external var FIND_MY_SPAWNS: Any /* "112" */ = definedExternally
external var FIND_HOSTILE_SPAWNS: Any /* "113" */ = definedExternally
external var FIND_MY_CONSTRUCTION_SITES: Any /* "114" */ = definedExternally
external var FIND_HOSTILE_CONSTRUCTION_SITES: Any /* "115" */ = definedExternally
external var FIND_MINERALS: Any /* "116" */ = definedExternally
external var FIND_NUKES: Any /* "117" */ = definedExternally
external var TOP: Any /* "1" */ = definedExternally
external var TOP_RIGHT: Any /* "2" */ = definedExternally
external var RIGHT: Any /* "3" */ = definedExternally
external var BOTTOM_RIGHT: Any /* "4" */ = definedExternally
external var BOTTOM: Any /* "5" */ = definedExternally
external var BOTTOM_LEFT: Any /* "6" */ = definedExternally
external var LEFT: Any /* "7" */ = definedExternally
external var TOP_LEFT: Any /* "8" */ = definedExternally
external var COLOR_RED: Any /* "1" */ = definedExternally
external var COLOR_PURPLE: Any /* "2" */ = definedExternally
external var COLOR_BLUE: Any /* "3" */ = definedExternally
external var COLOR_CYAN: Any /* "4" */ = definedExternally
external var COLOR_GREEN: Any /* "5" */ = definedExternally
external var COLOR_YELLOW: Any /* "6" */ = definedExternally
external var COLOR_ORANGE: Any /* "7" */ = definedExternally
external var COLOR_BROWN: Any /* "8" */ = definedExternally
external var COLOR_GREY: Any /* "9" */ = definedExternally
external var COLOR_WHITE: Any /* "10" */ = definedExternally
external var COLORS_ALL: Array<Number> = definedExternally
external var CREEP_SPAWN_TIME: Any /* "3" */ = definedExternally
external var CREEP_LIFE_TIME: Any /* "1500" */ = definedExternally
external var CREEP_CLAIM_LIFE_TIME: Any /* "500" */ = definedExternally
external var CREEP_CORPSE_RATE: Any /* "0.2" */ = definedExternally
external var OBSTACLE_OBJECT_TYPES: Array<String> = definedExternally
external var ENERGY_REGEN_TIME: Any /* "300" */ = definedExternally
external var ENERGY_DECAY: Any /* "1000" */ = definedExternally
external var REPAIR_COST: Any /* "0.01" */ = definedExternally
external var RAMPART_DECAY_AMOUNT: Any /* "300" */ = definedExternally
external var RAMPART_DECAY_TIME: Any /* "100" */ = definedExternally
external var RAMPART_HITS: Any /* "1" */ = definedExternally
external var RAMPART_HITS_MAX: Any = definedExternally
external var SPAWN_HITS: Any /* "5000" */ = definedExternally
external var SPAWN_ENERGY_START: Any /* "300" */ = definedExternally
external var SPAWN_ENERGY_CAPACITY: Any /* "300" */ = definedExternally
external var SOURCE_ENERGY_CAPACITY: Any /* "3000" */ = definedExternally
external var SOURCE_ENERGY_NEUTRAL_CAPACITY: Any /* "1500" */ = definedExternally
external var SOURCE_ENERGY_KEEPER_CAPACITY: Any /* "4000" */ = definedExternally
external var WALL_HITS: Any /* "1" */ = definedExternally
external var WALL_HITS_MAX: Any /* "300000000" */ = definedExternally
external var EXTENSION_HITS: Any /* "1000" */ = definedExternally
external var EXTENSION_ENERGY_CAPACITY: Any = definedExternally
external var ROAD_HITS: Any /* "5000" */ = definedExternally
external var ROAD_WEAROUT: Any /* "1" */ = definedExternally
external var ROAD_DECAY_AMOUNT: Any /* "100" */ = definedExternally
external var ROAD_DECAY_TIME: Any /* "1000" */ = definedExternally
external var LINK_HITS: Any /* "1000" */ = definedExternally
external var LINK_HITS_MAX: Any /* "1000" */ = definedExternally
external var LINK_CAPACITY: Any /* "800" */ = definedExternally
external var LINK_COOLDOWN: Any /* "1" */ = definedExternally
external var LINK_LOSS_RATIO: Any /* "0.03" */ = definedExternally
external var STORAGE_CAPACITY: Any /* "1000000" */ = definedExternally
external var STORAGE_HITS: Any /* "10000" */ = definedExternally

external interface `T$2` {
    @nativeGetter
    operator fun get(part: String): Number?

    @nativeSetter
    operator fun set(part: String, value: Number)

    var move: Any /* "50" */
    var work: Any /* "100" */
    var attack: Any /* "80" */
    var carry: Any /* "50" */
    var heal: Any /* "250" */
    var ranged_attack: Any /* "150" */
    var tough: Any /* "10" */
    var claim: Any /* "600" */
}

external var BODYPART_COST: `T$2` = definedExternally
external var BODYPARTS_ALL: Array<String> = definedExternally
external var CARRY_CAPACITY: Any /* "50" */ = definedExternally
external var HARVEST_POWER: Any /* "2" */ = definedExternally
external var HARVEST_MINERAL_POWER: Any /* "1" */ = definedExternally
external var REPAIR_POWER: Any /* "100" */ = definedExternally
external var DISMANTLE_POWER: Any /* "50" */ = definedExternally
external var BUILD_POWER: Any /* "5" */ = definedExternally
external var ATTACK_POWER: Any /* "30" */ = definedExternally
external var UPGRADE_CONTROLLER_POWER: Any /* "1" */ = definedExternally
external var RANGED_ATTACK_POWER: Any /* "10" */ = definedExternally
external var HEAL_POWER: Any /* "12" */ = definedExternally
external var RANGED_HEAL_POWER: Any /* "4" */ = definedExternally
external var DISMANTLE_COST: Any /* "0.005" */ = definedExternally
external var MOVE: Any /* "move" */ = definedExternally
external var WORK: Any /* "work" */ = definedExternally
external var CARRY: Any /* "carry" */ = definedExternally
external var ATTACK: Any /* "attack" */ = definedExternally
external var RANGED_ATTACK: Any /* "ranged_attack" */ = definedExternally
external var TOUGH: Any /* "tough" */ = definedExternally
external var HEAL: Any /* "heal" */ = definedExternally
external var CLAIM: Any /* "claim" */ = definedExternally

external interface `T$3` {
    var spawn: Any /* "15000" */
    var extension: Any /* "3000" */
    var road: Any /* "300" */
    var constructedWall: Any /* "1" */
    var rampart: Any /* "1" */
    var link: Any /* "5000" */
    var storage: Any /* "30000" */
    var tower: Any /* "5000" */
    var observer: Any /* "8000" */
    var powerSpawn: Any /* "100000" */
    var extractor: Any /* "5000" */
    var lab: Any /* "50000" */
    var terminal: Any /* "100000" */
    var container: Any /* "5000" */
    var nuker: Any /* "100000" */
}

external var CONSTRUCTION_COST: `T$3` = definedExternally
external var CONSTRUCTION_COST_ROAD_SWAMP_RATIO: Any /* "5" */ = definedExternally
external var STRUCTURE_EXTENSION: Any /* "extension" */ = definedExternally
external var STRUCTURE_RAMPART: Any /* "rampart" */ = definedExternally
external var STRUCTURE_ROAD: Any /* "road" */ = definedExternally
external var STRUCTURE_SPAWN: Any /* "spawn" */ = definedExternally
external var STRUCTURE_LINK: Any /* "link" */ = definedExternally
external var STRUCTURE_WALL: Any /* "wall" */ = definedExternally
external var STRUCTURE_KEEPER_LAIR: Any /* "keeperLair" */ = definedExternally
external var STRUCTURE_CONTROLLER: Any /* "controller" */ = definedExternally
external var STRUCTURE_STORAGE: Any /* "storage" */ = definedExternally
external var STRUCTURE_TOWER: Any /* "tower" */ = definedExternally
external var STRUCTURE_OBSERVER: Any /* "observer" */ = definedExternally
external var STRUCTURE_POWER_BANK: Any /* "powerBank" */ = definedExternally
external var STRUCTURE_POWER_SPAWN: Any /* "powerSpawn" */ = definedExternally
external var STRUCTURE_EXTRACTOR: Any /* "extractor" */ = definedExternally
external var STRUCTURE_LAB: Any /* "lab" */ = definedExternally
external var STRUCTURE_TERMINAL: Any /* "terminal" */ = definedExternally
external var STRUCTURE_CONTAINER: Any /* "container" */ = definedExternally
external var STRUCTURE_NUKER: Any /* "nuker" */ = definedExternally
external var STRUCTURE_PORTAL: Any /* "portal" */ = definedExternally
external var RESOURCE_ENERGY: Any /* "energy" */ = definedExternally
external var RESOURCE_POWER: Any /* "power" */ = definedExternally
external var RESOURCE_UTRIUM: Any /* "U" */ = definedExternally
external var RESOURCE_LEMERGIUM: Any /* "L" */ = definedExternally
external var RESOURCE_KEANIUM: Any /* "K" */ = definedExternally
external var RESOURCE_GHODIUM: Any /* "G" */ = definedExternally
external var RESOURCE_ZYNTHIUM: Any /* "Z" */ = definedExternally
external var RESOURCE_OXYGEN: Any /* "O" */ = definedExternally
external var RESOURCE_HYDROGEN: Any /* "H" */ = definedExternally
external var RESOURCE_CATALYST: Any /* "X" */ = definedExternally
external var RESOURCE_HYDROXIDE: Any /* "OH" */ = definedExternally
external var RESOURCE_ZYNTHIUM_KEANITE: Any /* "ZK" */ = definedExternally
external var RESOURCE_UTRIUM_LEMERGITE: Any /* "UL" */ = definedExternally
external var RESOURCE_UTRIUM_HYDRIDE: Any /* "UH" */ = definedExternally
external var RESOURCE_UTRIUM_OXIDE: Any /* "UO" */ = definedExternally
external var RESOURCE_KEANIUM_HYDRIDE: Any /* "KH" */ = definedExternally
external var RESOURCE_KEANIUM_OXIDE: Any /* "KO" */ = definedExternally
external var RESOURCE_LEMERGIUM_HYDRIDE: Any /* "LH" */ = definedExternally
external var RESOURCE_LEMERGIUM_OXIDE: Any /* "LO" */ = definedExternally
external var RESOURCE_ZYNTHIUM_HYDRIDE: Any /* "ZH" */ = definedExternally
external var RESOURCE_ZYNTHIUM_OXIDE: Any /* "ZO" */ = definedExternally
external var RESOURCE_GHODIUM_HYDRIDE: Any /* "GH" */ = definedExternally
external var RESOURCE_GHODIUM_OXIDE: Any /* "GO" */ = definedExternally
external var RESOURCE_UTRIUM_ACID: Any /* "UH2O" */ = definedExternally
external var RESOURCE_UTRIUM_ALKALIDE: Any /* "UHO2" */ = definedExternally
external var RESOURCE_KEANIUM_ACID: Any /* "KH2O" */ = definedExternally
external var RESOURCE_KEANIUM_ALKALIDE: Any /* "KHO2" */ = definedExternally
external var RESOURCE_LEMERGIUM_ACID: Any /* "LH2O" */ = definedExternally
external var RESOURCE_LEMERGIUM_ALKALIDE: Any /* "LHO2" */ = definedExternally
external var RESOURCE_ZYNTHIUM_ACID: Any /* "ZH2O" */ = definedExternally
external var RESOURCE_ZYNTHIUM_ALKALIDE: Any /* "ZHO2" */ = definedExternally
external var RESOURCE_GHODIUM_ACID: Any /* "GH2O" */ = definedExternally
external var RESOURCE_GHODIUM_ALKALIDE: Any /* "GHO2" */ = definedExternally
external var RESOURCE_CATALYZED_UTRIUM_ACID: Any /* "XUH2O" */ = definedExternally
external var RESOURCE_CATALYZED_UTRIUM_ALKALIDE: Any /* "XUHO2" */ = definedExternally
external var RESOURCE_CATALYZED_KEANIUM_ACID: Any /* "XKH2O" */ = definedExternally
external var RESOURCE_CATALYZED_KEANIUM_ALKALIDE: Any /* "XKHO2" */ = definedExternally
external var RESOURCE_CATALYZED_LEMERGIUM_ACID: Any /* "XLH2O" */ = definedExternally
external var RESOURCE_CATALYZED_LEMERGIUM_ALKALIDE: Any /* "XLHO2" */ = definedExternally
external var RESOURCE_CATALYZED_ZYNTHIUM_ACID: Any /* "XZH2O" */ = definedExternally
external var RESOURCE_CATALYZED_ZYNTHIUM_ALKALIDE: Any /* "ZXHO2" */ = definedExternally
external var RESOURCE_CATALYZED_GHODIUM_ACID: Any /* "XGH2O" */ = definedExternally
external var RESOURCE_CATALYZED_GHODIUM_ALKALIDE: Any /* "XGHO2" */ = definedExternally
external var RESOURCES_ALL: Array<String> = definedExternally
external var SUBSCRIPTION_TOKEN: String = definedExternally

external interface `T$4` {
    @nativeGetter
    operator fun get(level: Number): Number?

    @nativeSetter
    operator fun set(level: Number, value: Number)
}

external var CONTROLLER_LEVELS: `T$4` = definedExternally

external interface `T$5` {
    @nativeGetter
    operator fun get(structure: String): `T$4`?

    @nativeSetter
    operator fun set(structure: String, value: `T$4`)
}

external var CONTROLLER_STRUCTURES: `T$5` = definedExternally
external var CONTROLLER_DOWNGRADE: `T$4` = definedExternally
external var CONTROLLER_CLAIM_DOWNGRADE: Number = definedExternally
external var CONTROLLER_RESERVE: Number = definedExternally
external var CONTROLLER_RESERVE_MAX: Number = definedExternally
external var CONTROLLER_MAX_UPGRADE_PER_TICK: Number = definedExternally
external var CONTROLLER_ATTACK_BLOCKED_UPGRADE: Number = definedExternally
external var TOWER_HITS: Number = definedExternally
external var TOWER_CAPACITY: Number = definedExternally
external var TOWER_ENERGY_COST: Number = definedExternally
external var TOWER_POWER_ATTACK: Number = definedExternally
external var TOWER_POWER_HEAL: Number = definedExternally
external var TOWER_POWER_REPAIR: Number = definedExternally
external var TOWER_OPTIMAL_RANGE: Number = definedExternally
external var TOWER_FALLOFF_RANGE: Number = definedExternally
external var TOWER_FALLOFF: Number = definedExternally
external var OBSERVER_HITS: Number = definedExternally
external var OBSERVER_RANGE: Number = definedExternally
external var POWER_BANK_HITS: Number = definedExternally
external var POWER_BANK_CAPACITY_MAX: Number = definedExternally
external var POWER_BANK_CAPACITY_MIN: Number = definedExternally
external var POWER_BANK_CAPACITY_CRIT: Number = definedExternally
external var POWER_BANK_DECAY: Number = definedExternally
external var POWER_BANK_HIT_BACK: Number = definedExternally
external var POWER_SPAWN_HITS: Number = definedExternally
external var POWER_SPAWN_ENERGY_CAPACITY: Number = definedExternally
external var POWER_SPAWN_POWER_CAPACITY: Number = definedExternally
external var POWER_SPAWN_ENERGY_RATIO: Number = definedExternally
external var EXTRACTOR_HITS: Number = definedExternally
external var LAB_HITS: Number = definedExternally
external var LAB_MINERAL_CAPACITY: Number = definedExternally
external var LAB_ENERGY_CAPACITY: Number = definedExternally
external var LAB_BOOST_ENERGY: Number = definedExternally
external var LAB_BOOST_MINERAL: Number = definedExternally
external var LAB_COOLDOWN: Number = definedExternally
external var GCL_POW: Number = definedExternally
external var GCL_MULTIPLY: Number = definedExternally
external var GCL_NOVICE: Number = definedExternally
external var MODE_SIMULATION: String = definedExternally
external var MODE_SURVIVAL: String = definedExternally
external var MODE_WORLD: String = definedExternally
external var MODE_ARENA: String = definedExternally
external var TERRAIN_MASK_WALL: Number = definedExternally
external var TERRAIN_MASK_SWAMP: Number = definedExternally
external var TERRAIN_MASK_LAVA: Number = definedExternally
external var MAX_CONSTRUCTION_SITES: Number = definedExternally
external var MAX_CREEP_SIZE: Number = definedExternally
external var MINERAL_REGEN_TIME: Number = definedExternally
external var MINERAL_MIN_AMOUNT: Any = definedExternally
external var MINERAL_RANDOM_FACTOR: Number = definedExternally
external var MINERAL_DENSITY: Any = definedExternally
external var MINERAL_DENSITY_PROBABILITY: Any = definedExternally
external var MINERAL_DENSITY_CHANGE: Number = definedExternally
external var DENSITY_LOW: Number = definedExternally
external var DENSITY_MODERATE: Number = definedExternally
external var DENSITY_HIGH: Number = definedExternally
external var DENSITY_ULTRA: Number = definedExternally
external var TERMINAL_CAPACITY: Number = definedExternally
external var TERMINAL_HITS: Number = definedExternally
external var TERMINAL_SEND_COST: Number = definedExternally
external var TERMINAL_MIN_SEND: Number = definedExternally
external var CONTAINER_HITS: Number = definedExternally
external var CONTAINER_CAPACITY: Number = definedExternally
external var CONTAINER_DECAY: Number = definedExternally
external var CONTAINER_DECAY_TIME: Number = definedExternally
external var CONTAINER_DECAY_TIME_OWNED: Number = definedExternally
external var NUKER_HITS: Number = definedExternally
external var NUKER_COOLDOWN: Number = definedExternally
external var NUKER_ENERGY_CAPACITY: Number = definedExternally
external var NUKER_GHODIUM_CAPACITY: Number = definedExternally
external var NUKE_LAND_TIME: Number = definedExternally
external var NUKE_RANGE: Number = definedExternally

external interface `T$8` {
    var 0: Number
    var 1: Number
    var 4: Number
}

external var NUKE_DAMAGE: `T$8` = definedExternally

external interface `T$9` {
    @nativeGetter
    operator fun get(reagent: String): String?

    @nativeSetter
    operator fun set(reagent: String, value: String)
}

external interface `T$10` {
    @nativeGetter
    operator fun get(reagent: String): `T$9`?

    @nativeSetter
    operator fun set(reagent: String, value: `T$9`)
}

external var REACTIONS: `T$10` = definedExternally

external interface `T$11` {
    @nativeGetter
    operator fun get(action: String): Number?

    @nativeSetter
    operator fun set(action: String, value: Number)
}

external interface `T$12` {
    @nativeGetter
    operator fun get(boost: String): `T$11`?

    @nativeSetter
    operator fun set(boost: String, value: `T$11`)
}

external interface `T$13` {
    @nativeGetter
    operator fun get(part: String): `T$12`?

    @nativeSetter
    operator fun set(part: String, value: `T$12`)
}

external var BOOSTS: `T$13` = definedExternally
external var LOOK_CREEPS: Any /* "creep" */ = definedExternally
external var LOOK_ENERGY: Any /* "energy" */ = definedExternally
external var LOOK_RESOURCES: Any /* "resource" */ = definedExternally
external var LOOK_SOURCES: Any /* "source" */ = definedExternally
external var LOOK_MINERALS: Any /* "mineral" */ = definedExternally
external var LOOK_STRUCTURES: Any /* "structure" */ = definedExternally
external var LOOK_FLAGS: Any /* "flag" */ = definedExternally
external var LOOK_CONSTRUCTION_SITES: Any /* "constructionSite" */ = definedExternally
external var LOOK_NUKES: Any /* "nuke" */ = definedExternally
external var LOOK_TERRAIN: Any /* "terrain" */ = definedExternally
external var ORDER_SELL: Any /* "sell" */ = definedExternally
external var ORDER_BUY: Any /* "buy" */ = definedExternally

external interface ConstructionSite : RoomObject {
    override var prototype: ConstructionSite
    var id: String
    var my: Boolean
    var owner: Owner
    var progress: Number
    var progressTotal: Number
    var structureType: String
    fun remove(): Number

    companion object : ConstructionSiteConstructor by definedExternally: ConstructionSiteConstructor
    {
    }
}

external interface ConstructionSiteConstructor : _Constructor<ConstructionSite>, _ConstructorById<ConstructionSite>

external var Memory: Memory = definedExternally
external var RawMemory: RawMemory = definedExternally
external var Game: Game = definedExternally
external var PathFinder: PathFinder = definedExternally
external var Spawn: StructureSpawnConstructor = definedExternally

external interface `T$14` {
    var pos: RoomPosition
}

external interface Creep : RoomObject {
    var body: Array<BodyPartDefinition>
    var carry: StoreDefinition
    var carryCapacity: Number
    var fatigue: Number
    var hits: Number
    var hitsMax: Number
    var id: String
    var memory: Any
    var my: Boolean
    var name: String
    var owner: Owner
    var spawning: Boolean
    var saying: String
    var ticksToLive: Number
    fun attack(target: Creep): Number
    fun attack(target: Structure): Number
    fun attackController(target: StructureController): Number
    fun build(target: ConstructionSite): Number
    fun cancelOrder(methodName: String): Number
    fun claimController(target: StructureController): Number
    fun dismantle(target: Structure): Number
    fun drop(resourceType: String, amount: Number? = definedExternally /* null */): Number
    fun generateSafeMode(target: StructureController): Number
    fun getActiveBodyparts(type: String): Number
    fun harvest(target: Source): Number
    fun harvest(target: Mineral): Number
    fun heal(target: Creep): Number
    fun move(direction: Number): Number
    fun moveByPath(path: Array<PathStep>): Number
    fun moveByPath(path: Array<RoomPosition>): Number
    fun moveByPath(path: String): Number
    fun moveTo(x: Number, y: Number, opts: MoveToOpts? = definedExternally /* null */): Number
    fun moveTo(target: RoomPosition, opts: MoveToOpts? = definedExternally /* null */): Number
    fun moveTo(target: `T$14`, opts: MoveToOpts? = definedExternally /* null */): Number
    fun notifyWhenAttacked(enabled: Boolean): Number
    fun pickup(target: Resource): Number
    fun rangedAttack(target: Creep): Number
    fun rangedAttack(target: Structure): Number
    fun rangedHeal(target: Creep): Number
    fun rangedMassAttack(): Number
    fun repair(target: Structure): Number
    fun reserveController(target: StructureController): Number
    fun say(message: String, toPublic: Boolean? = definedExternally /* null */): Number
    fun signController(target: StructureController, text: String): Number
    fun suicide(): Number
    fun transfer(target: Creep, resourceType: String, amount: Number? = definedExternally /* null */): Number
    fun transfer(target: Structure, resourceType: String, amount: Number? = definedExternally /* null */): Number
    fun upgradeController(target: StructureController): Number
    fun withdraw(target: Structure, resourceType: String, amount: Number? = definedExternally /* null */): Number
}

external interface CreepConstructor : _Constructor<Creep>, _ConstructorById<Creep>
external interface `T$15` {
    var pos: RoomPosition
}

external interface Flag : RoomObject {
    override var prototype: Flag
    var color: Number
    var memory: Any
    var name: String
    var secondaryColor: Number
    fun remove(): Number
    fun setColor(color: Number, secondaryColor: Number? = definedExternally /* null */): Number
    fun setPosition(x: Number, y: Number): Number
    fun setPosition(pos: RoomPosition): Number
    fun setPosition(pos: `T$15`): Number

    companion object : FlagConstructor by definedExternally: FlagConstructor
    {
    }
}

external interface FlagConstructor : _Constructor<Flag> {
    @nativeInvoke
    operator fun invoke(name: String, color: Number, secondaryColor: Number, roomName: String, x: Number, y: Number): Flag
}

external interface `T$16` {
    @nativeGetter
    operator fun get(creepName: String): Creep?

    @nativeSetter
    operator fun set(creepName: String, value: Creep)
}

external interface `T$17` {
    @nativeGetter
    operator fun get(flagName: String): Flag?

    @nativeSetter
    operator fun set(flagName: String, value: Flag)
}

external interface `T$18` {
    @nativeGetter
    operator fun get(roomName: String): Room?

    @nativeSetter
    operator fun set(roomName: String, value: Room)
}

external interface `T$19` {
    @nativeGetter
    operator fun get(spawnName: String): StructureSpawn?

    @nativeSetter
    operator fun set(spawnName: String, value: StructureSpawn)
}

external interface `T$20` {
    @nativeGetter
    operator fun get(structureId: String): Structure?

    @nativeSetter
    operator fun set(structureId: String, value: Structure)
}

external interface `T$21` {
    @nativeGetter
    operator fun get(constructionSiteId: String): ConstructionSite?

    @nativeSetter
    operator fun set(constructionSiteId: String, value: ConstructionSite)
}

external interface GlobalControlLevel {
    var level: Number
    var progress: Number
    var progressTotal: Number
}

external interface CPU {
    var limit: Number
    var tickLimit: Number
    var bucket: Number
    fun getUsed(): Number
}

external interface BodyPartDefinition {
    var boost: String
    var type: String
    var hits: Number
}

external interface Owner {
    var username: String
}

external interface ReservationDefinition {
    var username: String
    var ticksToEnd: Number
}

external interface SignDefinition {
    var username: String
    var text: String
    var time: Number
    var datetime: Date
}

external interface StoreDefinition {
    @nativeGetter
    operator fun get(resource: String): Number?

    @nativeSetter
    operator fun set(resource: String, value: Number?)

    var energy: Number? get() = definedExternally; set(value) = definedExternally
    var power: Number? get() = definedExternally; set(value) = definedExternally
}

external interface LookAtResultWithPos {
    var x: Number
    var y: Number
    var type: String
    var constructionSite: ConstructionSite? get() = definedExternally; set(value) = definedExternally
    var creep: Creep? get() = definedExternally; set(value) = definedExternally
    var terrain: String? get() = definedExternally; set(value) = definedExternally
    var structure: Structure? get() = definedExternally; set(value) = definedExternally
    var flag: Flag? get() = definedExternally; set(value) = definedExternally
    var energy: Resource? get() = definedExternally; set(value) = definedExternally
    var exit: Any? get() = definedExternally; set(value) = definedExternally
    var source: Source? get() = definedExternally; set(value) = definedExternally
    var mineral: Mineral? get() = definedExternally; set(value) = definedExternally
    var resource: Resource? get() = definedExternally; set(value) = definedExternally
}

external interface LookAtResult {
    var type: String
    var constructionSite: ConstructionSite? get() = definedExternally; set(value) = definedExternally
    var creep: Creep? get() = definedExternally; set(value) = definedExternally
    var energy: Resource? get() = definedExternally; set(value) = definedExternally
    var exit: Any? get() = definedExternally; set(value) = definedExternally
    var flag: Flag? get() = definedExternally; set(value) = definedExternally
    var source: Source? get() = definedExternally; set(value) = definedExternally
    var structure: Structure? get() = definedExternally; set(value) = definedExternally
    var terrain: String? get() = definedExternally; set(value) = definedExternally
    var mineral: Mineral? get() = definedExternally; set(value) = definedExternally
    var resource: Resource? get() = definedExternally; set(value) = definedExternally
}

external interface LookAtResultMatrix {
    @nativeGetter
    operator fun get(coord: Number): dynamic /* LookAtResultMatrix | Array<LookAtResult> */

    @nativeSetter
    operator fun set(coord: Number, value: LookAtResultMatrix)

    @nativeSetter
    operator fun set(coord: Number, value: Array<LookAtResult>)
}

external interface FindPathOpts {
    var ignoreCreeps: Boolean? get() = definedExternally; set(value) = definedExternally
    var ignoreDestructibleStructures: Boolean? get() = definedExternally; set(value) = definedExternally
    var ignoreRoads: Boolean? get() = definedExternally; set(value) = definedExternally
    val costCallback: ((roomName: String, costMatrix: CostMatrix) -> dynamic /* Boolean | CostMatrix */)? get() = definedExternally
    var ignore: dynamic /* Array<Any> | Array<RoomPosition> */ get() = definedExternally; set(value) = definedExternally
    var avoid: dynamic /* Array<Any> | Array<RoomPosition> */ get() = definedExternally; set(value) = definedExternally
    var maxOps: Number? get() = definedExternally; set(value) = definedExternally
    var heuristicWeight: Number? get() = definedExternally; set(value) = definedExternally
    var serialize: Boolean? get() = definedExternally; set(value) = definedExternally
    var maxRooms: Number? get() = definedExternally; set(value) = definedExternally
    var range: Number? get() = definedExternally; set(value) = definedExternally
}

external interface MoveToOpts : FindPathOpts {
    var reusePath: Number? get() = definedExternally; set(value) = definedExternally
    var serializeMemory: Boolean? get() = definedExternally; set(value) = definedExternally
    var noPathFinding: Boolean? get() = definedExternally; set(value) = definedExternally
    var visualizePathStyle: PolyStyle? get() = definedExternally; set(value) = definedExternally
}

external interface PathStep {
    var x: Number
    var dx: Number
    var y: Number
    var dy: Number
    var direction: Number
}

external interface SurvivalGameInfo {
    var score: Number
    var timeToWave: Number
    var wave: Number
}

external interface _Constructor<T> {
    var prototype: T
}

external interface _ConstructorById<T> : _Constructor<T> {
    @nativeInvoke
    operator fun invoke(id: String): T
}

external interface `T$22` {
    @nativeInvoke
    operator fun invoke(roomName: String, fromRoomName: String): Any
}

external interface RouteOptions {
    var routeCallback: `T$22`
}

external interface `T$23` {
    var 1: String? get() = definedExternally; set(value) = definedExternally
    var 3: String? get() = definedExternally; set(value) = definedExternally
    var 5: String? get() = definedExternally; set(value) = definedExternally
    var 7: String? get() = definedExternally; set(value) = definedExternally
}

external interface `T$24` {
    var exit: Number
    var room: String
}

external interface GameMap {
    fun describeExits(roomName: String): `T$23`
    fun findExit(fromRoom: String, toRoom: String, opts: RouteOptions? = definedExternally /* null */): Number
    fun findExit(fromRoom: String, toRoom: Room, opts: RouteOptions? = definedExternally /* null */): Number
    fun findExit(fromRoom: Room, toRoom: String, opts: RouteOptions? = definedExternally /* null */): Number
    fun findExit(fromRoom: Room, toRoom: Room, opts: RouteOptions? = definedExternally /* null */): Number
    fun findRoute(fromRoom: String, toRoom: String, opts: RouteOptions? = definedExternally /* null */): dynamic /* Array<`T$24`> | Number */
    fun findRoute(fromRoom: String, toRoom: Room, opts: RouteOptions? = definedExternally /* null */): dynamic /* Array<`T$24`> | Number */
    fun findRoute(fromRoom: Room, toRoom: String, opts: RouteOptions? = definedExternally /* null */): dynamic /* Array<`T$24`> | Number */
    fun findRoute(fromRoom: Room, toRoom: Room, opts: RouteOptions? = definedExternally /* null */): dynamic /* Array<`T$24`> | Number */
    fun getRoomLinearDistance(roomName1: String, roomName2: String, continuous: Boolean? = definedExternally /* null */): Number
    fun getTerrainAt(x: Number, y: Number, roomName: String): String
    fun getTerrainAt(pos: RoomPosition): String
    fun isRoomAvailable(roomName: String): Boolean
}

external interface `T$25` {
    @nativeGetter
    operator fun get(key: String): Order?

    @nativeSetter
    operator fun set(key: String, value: Order)
}

external interface Market {
    var credits: Number
    var incomingTransactions: Array<Transaction>
    var orders: `T$25`
    var outgoingTransactions: Array<Transaction>
    fun calcTransactionCost(amount: Number, roomName1: String, roomName2: String): Number
    fun cancelOrder(orderId: String): Number
    fun changeOrderPrice(orderId: String, newPrice: Number): Number
    fun createOrder(type: String, resourceType: String, price: Number, totalAmount: Number, roomName: String? = definedExternally /* null */): Number
    fun deal(orderId: String, amount: Number, targetRoomName: String? = definedExternally /* null */): Number
    fun extendOrder(orderId: String, addAmount: Number): Number
    fun getAllOrders(filter: OrderFilter? = definedExternally /* null */): Array<Order>
    fun getAllOrders(filter: (o: Order) -> Boolean? = definedExternally /* null */): Array<Order>
    fun getOrderById(id: String): Order?
}

external interface `T$26` {
    var username: String
}

external interface Transaction {
    var transactionId: String
    var time: Number
    var sender: `T$26`? get() = definedExternally; set(value) = definedExternally
    var recipient: `T$26`? get() = definedExternally; set(value) = definedExternally
    var resourceType: String
    var amount: Number
    var from: String
    var to: String
    var description: String
}

external interface Order {
    var id: String
    var created: Number
    var active: Boolean? get() = definedExternally; set(value) = definedExternally
    var type: String
    var resourceType: String
    var roomName: String? get() = definedExternally; set(value) = definedExternally
    var amount: Number
    var remainingAmount: Number
    var totalAmount: Number? get() = definedExternally; set(value) = definedExternally
    var price: Number
}

external interface OrderFilter {
    var id: String? get() = definedExternally; set(value) = definedExternally
    var created: Number? get() = definedExternally; set(value) = definedExternally
    var type: String? get() = definedExternally; set(value) = definedExternally
    var resourceType: String? get() = definedExternally; set(value) = definedExternally
    var roomName: String? get() = definedExternally; set(value) = definedExternally
    var amount: Number? get() = definedExternally; set(value) = definedExternally
    var remainingAmount: Number? get() = definedExternally; set(value) = definedExternally
    var price: Number? get() = definedExternally; set(value) = definedExternally
}

external interface Mineral : RoomObject {
    override var prototype: Mineral
    var density: Number
    var mineralAmount: Number
    var mineralType: String
    var id: String
    var ticksToRegeneration: Number

    companion object : MineralConstructor by definedExternally: MineralConstructor
    {
    }
}

external interface MineralConstructor : _Constructor<Mineral>, _ConstructorById<Mineral>
external interface Nuke : RoomObject {
    override var prototype: Nuke
    var id: String
    var launchRoomName: String
    var timeToLand: Number

    companion object : NukeConstructor by definedExternally: NukeConstructor
    {
    }
}

external interface NukeConstructor
external interface `T$27` {
    var pos: RoomPosition
    var range: Number
}

external interface `T$28` {
    var pos: RoomPosition
    var range: Number
}

external interface PathFinderPath {
    var path: Array<RoomPosition>
    var ops: Number
    var cost: Number
    var incomplete: Boolean
}

external interface PathFinderOpts {
    var plainCost: Number? get() = definedExternally; set(value) = definedExternally
    var swampCost: Number? get() = definedExternally; set(value) = definedExternally
    var flee: Boolean? get() = definedExternally; set(value) = definedExternally
    var maxOps: Number? get() = definedExternally; set(value) = definedExternally
    var maxRooms: Number? get() = definedExternally; set(value) = definedExternally
    var heuristicWeight: Number? get() = definedExternally; set(value) = definedExternally
    val roomCallback: ((roomName: String) -> dynamic /* Boolean | CostMatrix */)? get() = definedExternally
}

external interface CostMatrix {
    fun set(x: Number, y: Number, cost: Number)
    fun get(x: Number, y: Number): Number
    fun clone(): CostMatrix
    fun serialize(): Array<Number>
    fun deserialize(`val`: Array<Number>): CostMatrix
}

external interface Resource : RoomObject {
    override var prototype: Resource
    var amount: Number
    var id: String
    var resourceType: String

    companion object : ResourceConstructor by definedExternally: ResourceConstructor
    {
    }
}

external interface ResourceConstructor
external interface RoomObject {
    var prototype: RoomObject
    var pos: RoomPosition
    var room: Room?

    companion object : RoomObjectConstructor by definedExternally: RoomObjectConstructor
    {
    }
}

external interface RoomObjectConstructor : _Constructor<RoomObject> {
    @nativeInvoke
    operator fun invoke(x: Number, y: Number, roomName: String): RoomObject
}

external interface `T$29` {
    var filter: dynamic /* Any | String */ get() = definedExternally; set(value) = definedExternally
    var algorithm: String? get() = definedExternally; set(value) = definedExternally
}

external interface `T$30` {
    var filter: dynamic /* Any | String */ get() = definedExternally; set(value) = definedExternally
    var algorithm: String? get() = definedExternally; set(value) = definedExternally
}

external interface `T$31` {
    var filter: dynamic /* Any | String */
}

external interface `T$32` {
    var filter: dynamic /* Any | String */
}

external interface `T$33` {
    var filter: dynamic /* Any | String */ get() = definedExternally; set(value) = definedExternally
}

external interface `T$34` {
    var filter: dynamic /* Any | String */ get() = definedExternally; set(value) = definedExternally
}

external interface `T$35` {
    var pos: RoomPosition
}

external interface `T$36` {
    var pos: RoomPosition
}

external interface `T$37` {
    var pos: RoomPosition
}

external interface `T$38` {
    var pos: RoomPosition
}

external interface `T$39` {
    var pos: RoomPosition
}

external interface `T$40` {
    var pos: RoomPosition
}

external interface RoomPosition {
    var prototype: RoomPosition
    var roomName: String
    var x: Number
    var y: Number
    fun createConstructionSite(structureType: String): Number
    fun createFlag(name: String? = definedExternally /* null */, color: Number? = definedExternally /* null */, secondaryColor: Number? = definedExternally /* null */): Number
    fun <T> findClosestByPath(type: Number, opts: FindPathOpts? /* FindPathOpts & `T$29` */ = definedExternally /* null */): T
    fun <T> findClosestByPath(objects: Array<T>, opts: FindPathOpts? /* FindPathOpts & `T$30` */ = definedExternally /* null */): T
    fun <T> findClosestByPath(objects: Array<RoomPosition>, opts: FindPathOpts? /* FindPathOpts & `T$30` */ = definedExternally /* null */): T
    fun <T> findClosestByRange(type: Number, opts: `T$31`? = definedExternally /* null */): T
    fun <T> findClosestByRange(objects: Array<T>, opts: `T$32`? = definedExternally /* null */): T
    fun <T> findClosestByRange(objects: Array<RoomPosition>, opts: `T$32`? = definedExternally /* null */): T
    fun <T> findInRange(type: Number, range: Number, opts: `T$33`? = definedExternally /* null */): Array<T>
    fun <T> findInRange(objects: Array<T>, range: Number, opts: `T$34`? = definedExternally /* null */): Array<T>
    fun <T> findInRange(objects: Array<RoomPosition>, range: Number, opts: `T$34`? = definedExternally /* null */): Array<T>
    fun findPathTo(x: Number, y: Number, opts: FindPathOpts? = definedExternally /* null */): Array<PathStep>
    fun findPathTo(target: RoomPosition, opts: FindPathOpts? = definedExternally /* null */): Array<PathStep>
    fun findPathTo(target: `T$35`, opts: FindPathOpts? = definedExternally /* null */): Array<PathStep>
    fun getDirectionTo(x: Number, y: Number): Number
    fun getDirectionTo(target: RoomPosition): Number
    fun getDirectionTo(target: `T$36`): Number
    fun getRangeTo(x: Number, y: Number): Number
    fun getRangeTo(target: RoomPosition): Number
    fun getRangeTo(target: `T$37`): Number
    fun inRangeTo(target: RoomPosition, range: Number): Boolean
    fun inRangeTo(target: `T$38`, range: Number): Boolean
    fun isEqualTo(x: Number, y: Number): Boolean
    fun isEqualTo(target: RoomPosition): Boolean
    fun isEqualTo(target: `T$39`): Boolean
    fun isNearTo(x: Number, y: Number): Boolean
    fun isNearTo(target: RoomPosition): Boolean
    fun isNearTo(target: `T$40`): Boolean
    fun look(): Array<LookAtResult>
    fun <T> lookFor(type: String): Array<T>

    companion object : RoomPositionConstructor by definedExternally: RoomPositionConstructor
    {
    }
}

external interface RoomPositionConstructor : _Constructor<RoomPosition> {
    @nativeInvoke
    operator fun invoke(x: Number, y: Number, roomName: String): RoomPosition
}

external open class RoomVisual(roomName: String) {
    open var roomName: String = definedExternally
    open fun line(x1: Number, y1: Number, x2: Number, y2: Number, style: LineStyle? = definedExternally /* null */): RoomVisual = definedExternally
    open fun circle(x: Number, y: Number, style: CircleStyle? = definedExternally /* null */): RoomVisual = definedExternally
    open fun rect(x: Number, y: Number, w: Number, h: Number, style: PolyStyle? = definedExternally /* null */): RoomVisual = definedExternally
    open fun poly(points: Array<dynamic /* "TupleType" kind unsupported yet here! (screeps.d.ts:1641:17 to 1641:34) */>, style: PolyStyle? = definedExternally /* null */): RoomVisual = definedExternally
    open fun text(text: String, x: Number, y: Number, style: TextStyle? = definedExternally /* null */): RoomVisual = definedExternally
    open fun clear(): RoomVisual = definedExternally
    open fun getSize(): Number = definedExternally
}

external interface LineStyle {
    var width: Number? get() = definedExternally; set(value) = definedExternally
    var color: String? get() = definedExternally; set(value) = definedExternally
    var opacity: Number? get() = definedExternally; set(value) = definedExternally
    var lineStyle: dynamic /* Any /* "dashed" */ | Any /* "dotted" */ */ get() = definedExternally; set(value) = definedExternally
}

external interface PolyStyle {
    var fill: String? get() = definedExternally; set(value) = definedExternally
    var opacity: Number? get() = definedExternally; set(value) = definedExternally
    var stroke: String? get() = definedExternally; set(value) = definedExternally
    var strokeWidth: Number? get() = definedExternally; set(value) = definedExternally
    var lineStyle: dynamic /* Any /* "dashed" */ | Any /* "dotted" */ */ get() = definedExternally; set(value) = definedExternally
}

external interface CircleStyle : PolyStyle {
    var radius: Number? get() = definedExternally; set(value) = definedExternally
}

external interface TextStyle {
    var color: String? get() = definedExternally; set(value) = definedExternally
    var size: Number? get() = definedExternally; set(value) = definedExternally
    var align: dynamic /* Any /* "center" */ | Any /* "left" */ | Any /* "right" */ */ get() = definedExternally; set(value) = definedExternally
    var opacity: Number? get() = definedExternally; set(value) = definedExternally
}

external interface `T$41` {
    var pos: RoomPosition
}

external interface `T$42` {
    var pos: RoomPosition
}

external interface `T$43` {
    var filter: dynamic /* Any | Function<*> | String */
}

external interface `T$44` {
    var pos: RoomPosition
}

external interface `T$45` {
    var pos: RoomPosition
}

external interface Room {
    var prototype: Room
    var controller: StructureController?
    var energyAvailable: Number
    var energyCapacityAvailable: Number
    var memory: Any
    var mode: String
    var name: String
    var storage: StructureStorage?
    var terminal: StructureTerminal?
    var visual: RoomVisual
    fun createConstructionSite(x: Number, y: Number, structureType: String): Number
    fun createConstructionSite(pos: RoomPosition, structureType: String): Number
    fun createConstructionSite(pos: `T$41`, structureType: String): Number
    fun createFlag(x: Number, y: Number, name: String? = definedExternally /* null */, color: Number? = definedExternally /* null */, secondaryColor: Number? = definedExternally /* null */): Number
    fun createFlag(pos: RoomPosition, name: String? = definedExternally /* null */, color: Number? = definedExternally /* null */, secondaryColor: Number? = definedExternally /* null */): Number
    fun createFlag(pos: `T$42`, name: String? = definedExternally /* null */, color: Number? = definedExternally /* null */, secondaryColor: Number? = definedExternally /* null */): Number
    fun <T> find(type: Number, opts: `T$43`? = definedExternally /* null */): Array<T>
    fun findExitTo(room: String): Number
    fun findExitTo(room: Room): Number
    fun findPath(fromPos: RoomPosition, toPos: RoomPosition, opts: FindPathOpts? = definedExternally /* null */): Array<PathStep>
    fun getPositionAt(x: Number, y: Number): RoomPosition?
    fun lookAt(x: Number, y: Number): Array<LookAtResult>
    fun lookAt(target: RoomPosition): Array<LookAtResult>
    fun lookAt(target: `T$44`): Array<LookAtResult>
    fun lookAtArea(top: Number, left: Number, bottom: Number, right: Number, asArray: Boolean? = definedExternally /* null */): dynamic /* LookAtResultMatrix | Array<LookAtResultWithPos> */
    fun <T> lookForAt(type: String, x: Number, y: Number): Array<T>
    fun <T> lookForAt(type: String, target: RoomPosition): Array<T>
    fun <T> lookForAt(type: String, target: `T$45`): Array<T>
    fun lookForAtArea(type: String, top: Number, left: Number, bottom: Number, right: Number, asArray: Boolean? = definedExternally /* null */): dynamic /* LookAtResultMatrix | Array<LookAtResultWithPos> */
}

external interface RoomConstructor {
    fun serializePath(path: Array<PathStep>): String
    fun deserializePath(path: String): Array<PathStep>
}

external interface Source : RoomObject {
    override var prototype: Source
    var energy: Number
    var energyCapacity: Number
    var id: String
    override var room: Room
    var ticksToRegeneration: Number

    companion object : SourceConstructor by definedExternally: SourceConstructor
    {
    }
}

external interface SourceConstructor : _Constructor<Source>, _ConstructorById<Source>
external interface `T$46` {
    var name: String
    var needTime: Number
    var remainingTime: Number
}

external interface StructureSpawn : OwnedStructure {
    override var prototype: StructureSpawn
    var energy: Number
    var energyCapacity: Number
    var memory: Any
    var name: String
    var spawning: `T$46`
    fun canCreateCreep(body: Array<String>, name: String? = definedExternally /* null */): Number
    fun createCreep(body: Array<String>, name: String? = definedExternally /* null */, memory: Any? = definedExternally /* null */): dynamic /* Number | String */
    override fun destroy(): Number
    override fun isActive(): Boolean
    override fun notifyWhenAttacked(enabled: Boolean): Number
    fun renewCreep(target: Creep): Number
    fun recycleCreep(target: Creep): Number
    fun transferEnergy(target: Creep, amount: Number? = definedExternally /* null */): Number

    companion object : StructureSpawnConstructor by definedExternally: StructureSpawnConstructor
    {
    }
}

external interface StructureSpawnConstructor : _Constructor<StructureSpawn>, _ConstructorById<StructureSpawn>
external interface Structure : RoomObject {
    override var prototype: Structure
    var hits: Number
    var hitsMax: Number
    var id: String
    override var room: Room
    var structureType: String
    fun destroy(): Number
    fun isActive(): Boolean
    fun notifyWhenAttacked(enabled: Boolean): Number

    companion object : StructureConstructor by definedExternally: StructureConstructor
    {
    }
}

external interface StructureConstructor : _Constructor<Structure>, _ConstructorById<Structure>
external interface OwnedStructure : Structure {
    override var prototype: OwnedStructure
    var my: Boolean
    var owner: Owner
    override var room: Room

    companion object : OwnedStructureConstructor by definedExternally: OwnedStructureConstructor
    {
    }
}

external interface OwnedStructureConstructor : _Constructor<OwnedStructure>, _ConstructorById<OwnedStructure>
external interface StructureController : OwnedStructure {
    override var prototype: StructureController
    var level: Number
    var progress: Number
    var progressTotal: Number
    var reservation: ReservationDefinition
    var safeMode: Number?
    var safeModeAvailable: Number
    var safeModeCooldown: Number?
    var sign: SignDefinition
    var ticksToDowngrade: Number
    var upgradeBlocked: Number
    fun activateSafeMode(): Number
    fun unclaim(): Number

    companion object : StructureControllerConstructor by definedExternally: StructureControllerConstructor
    {
    }
}

external interface StructureControllerConstructor : _Constructor<StructureController>, _ConstructorById<StructureController>
external interface StructureExtension : OwnedStructure {
    override var prototype: StructureExtension
    var energy: Number
    var energyCapacity: Number
    fun transferEnergy(target: Creep, amount: Number? = definedExternally /* null */): Number

    companion object : StructureExtensionConstructor by definedExternally: StructureExtensionConstructor
    {
    }
}

external interface StructureExtensionConstructor : _Constructor<StructureExtension>, _ConstructorById<StructureExtension>
external interface StructureLink : OwnedStructure {
    override var prototype: StructureLink
    var cooldown: Number
    var energy: Number
    var energyCapacity: Number
    fun transferEnergy(target: Creep, amount: Number? = definedExternally /* null */): Number
    fun transferEnergy(target: StructureLink, amount: Number? = definedExternally /* null */): Number

    companion object : StructureLinkConstructor by definedExternally: StructureLinkConstructor
    {
    }
}

external interface StructureLinkConstructor : _Constructor<StructureLink>, _ConstructorById<StructureLink>
external interface StructureKeeperLair : OwnedStructure {
    override var prototype: StructureKeeperLair
    var ticksToSpawn: Number?

    companion object : StructureKeeperLairConstructor by definedExternally: StructureKeeperLairConstructor
    {
    }
}

external interface StructureKeeperLairConstructor : _Constructor<StructureKeeperLair>, _ConstructorById<StructureKeeperLair>
external interface StructureObserver : OwnedStructure {
    override var prototype: StructureObserver
    fun observeRoom(roomName: String): Number

    companion object : StructureObserverConstructor by definedExternally: StructureObserverConstructor
    {
    }
}

external interface StructureObserverConstructor : _Constructor<StructureObserver>, _ConstructorById<StructureObserver>
external interface StructurePowerBank : OwnedStructure {
    override var prototype: StructurePowerBank
    var power: Number
    var ticksToDecay: Number

    companion object : StructurePowerBankConstructor by definedExternally: StructurePowerBankConstructor
    {
    }
}

external interface StructurePowerBankConstructor : _Constructor<StructurePowerBank>, _ConstructorById<StructurePowerBank>
external interface StructurePowerSpawn : OwnedStructure {
    override var prototype: StructurePowerSpawn
    var energy: Number
    var energyCapacity: Number
    var power: Number
    var powerCapacity: Number
    fun createPowerCreep(name: String): Number
    fun processPower(): Number
    fun transferEnergy(target: Creep, amount: Number? = definedExternally /* null */): Number

    companion object : StructurePowerSpawnConstructor by definedExternally: StructurePowerSpawnConstructor
    {
    }
}

external interface StructurePowerSpawnConstructor : _Constructor<StructurePowerSpawn>, _ConstructorById<StructurePowerSpawn>
external interface StructureRampart : OwnedStructure {
    override var prototype: StructureRampart
    var ticksToDecay: Number
    var isPublic: Boolean
    fun setPublic(isPublic: Boolean)

    companion object : StructureRampartConstructor by definedExternally: StructureRampartConstructor
    {
    }
}

external interface StructureRampartConstructor : _Constructor<StructureRampart>, _ConstructorById<StructureRampart>
external interface StructureRoad : Structure {
    override var prototype: StructureRoad
    var ticksToDecay: Number

    companion object : StructureRoadConstructor by definedExternally: StructureRoadConstructor
    {
    }
}

external interface StructureRoadConstructor : _Constructor<StructureRoad>, _ConstructorById<StructureRoad>
external interface StructureStorage : OwnedStructure {
    override var prototype: StructureStorage
    var store: StoreDefinition
    var storeCapacity: Number
    fun transfer(target: Creep, resourceType: String, amount: Number? = definedExternally /* null */): Number
    fun transferEnergy(target: Creep, amount: Number? = definedExternally /* null */): Number

    companion object : StructureStorageConstructor by definedExternally: StructureStorageConstructor
    {
    }
}

external interface StructureStorageConstructor : _Constructor<StructureStorage>, _ConstructorById<StructureStorage>
external interface StructureTower : OwnedStructure {
    override var prototype: StructureTower
    var energy: Number
    var energyCapacity: Number
    fun attack(target: Creep): Number
    fun heal(target: Creep): Number
    fun repair(target: StructureSpawn): Number
    fun repair(target: Structure): Number
    fun transferEnergy(target: Creep, amount: Number? = definedExternally /* null */): Number

    companion object : StructureTowerConstructor by definedExternally: StructureTowerConstructor
    {
    }
}

external interface StructureTowerConstructor : _Constructor<StructureTower>, _ConstructorById<StructureTower>
external interface StructureWall : Structure {
    override var prototype: StructureWall
    var ticksToLive: Number

    companion object : StructureWallConstructor by definedExternally: StructureWallConstructor
    {
    }
}

external interface StructureWallConstructor : _Constructor<StructureWall>, _ConstructorById<StructureWall>
external interface StructureExtractor : OwnedStructure {
    override var prototype: StructureExtractor
    var cooldown: Number

    companion object : StructureExtractorConstructor by definedExternally: StructureExtractorConstructor
    {
    }
}

external interface StructureExtractorConstructor : _Constructor<StructureExtractor>, _ConstructorById<StructureExtractor>
external interface StructureLab : OwnedStructure {
    override var prototype: StructureLab
    var cooldown: Number
    var energy: Number
    var energyCapacity: Number
    var mineralAmount: Number
    var mineralType: String
    var mineralCapacity: Number
    fun boostCreep(creep: Creep, bodyPartsCount: Number? = definedExternally /* null */): Number
    fun runReaction(lab1: StructureLab, lab2: StructureLab): Number
    fun transfer(target: Creep, resourceType: String, amount: Number? = definedExternally /* null */): Number

    companion object : StructureLabConstructor by definedExternally: StructureLabConstructor
    {
    }
}

external interface StructureLabConstructor : _Constructor<StructureLab>, _ConstructorById<StructureLab>
external interface StructureTerminal : OwnedStructure {
    override var prototype: StructureTerminal
    var store: Any
    var storeCapacity: Number
    fun send(resourceType: String, amount: Number, destination: String, description: String? = definedExternally /* null */): Number
    fun transfer(target: Creep, resourceType: String, amount: Number? = definedExternally /* null */): Number

    companion object : StructureTerminalConstructor by definedExternally: StructureTerminalConstructor
    {
    }
}

external interface StructureTerminalConstructor : _Constructor<StructureTerminal>, _ConstructorById<StructureTerminal>
external interface StructureContainer : Structure {
    override var prototype: StructureContainer
    var store: Any
    var storeCapacity: Number
    var ticksToDecay: Number
    fun transfer(target: Creep, resourceType: String, amount: Number? = definedExternally /* null */): Number

    companion object : StructureContainerConstructor by definedExternally: StructureContainerConstructor
    {
    }
}

external interface StructureContainerConstructor : _Constructor<StructureContainer>, _ConstructorById<StructureContainer>
external interface StructureNuker : OwnedStructure {
    override var prototype: StructureNuker
    var energy: Number
    var energyCapacity: Number
    var ghodium: Number
    var ghodiumCapacity: Number
    var cooldown: Number
    fun launchNuke(pos: RoomPosition): Number

    companion object : StructureNukerConstructor by definedExternally: StructureNukerConstructor
    {
    }
}

external interface StructureNukerConstructor : _Constructor<StructureNuker>, _ConstructorById<StructureNuker>
external interface StructurePortal : Structure {
    override var prototype: StructurePortal
    var destination: RoomPosition
    var ticksToDecay: Number

    companion object : StructurePortalConstructor by definedExternally: StructurePortalConstructor
    {
    }
}

external interface StructurePortalConstructor : _Constructor<StructurePortal>, _ConstructorById<StructurePortal>