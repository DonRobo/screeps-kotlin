import kotlin.js.Json

fun toMap(jsObject: Json): Map<String, Any?> {
    val map: MutableMap<String, Any?> = HashMap()
    for (key in js("Object").keys(jsObject)) {
        map.put(key, jsObject[key])
    }

    return map
}
