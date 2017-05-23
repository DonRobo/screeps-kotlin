package com.donrobo.screeps.binding

import kotlin.js.Json

fun toMap(jsObject: Json): Map<String, Any?> {
    val map: MutableMap<String, Any?> = HashMap()
    for (key in js("Object").keys(jsObject)) {
        map.put(key, jsObject[key])
    }

    return map
}

fun <T> Sequence<T>.toJsArray(): Array<T> {
    val array = js("[]")
    this.forEach { array.push(it) }
    return array
}