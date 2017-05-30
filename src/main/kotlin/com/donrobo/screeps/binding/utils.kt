package com.donrobo.screeps.binding

import kotlin.js.Json

fun toJson(map: Map<String, Any?>?): Json? {
    if (map != null) {
        val json: Json = js("new Object()")

        map.forEach { (k, v) ->
            if (v is Map<*, *>) {
                TODO("support multi-level-maps")
            } else {
                json[k] = v
            }
        }

        return json
    } else {
        return null
    }
}

fun toMap(jsObject: Json): MutableMap<String, Any?> {
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