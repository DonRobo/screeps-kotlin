external class JsObject {
    val keys: Array<String>
    fun get(key: String): Any
}

fun toMap(jsObject: JsObject): Map<String, Any> {
    val map: MutableMap<String, Any> = HashMap()
    for (key in jsObject.keys) {
        map.put(key, jsObject.get(key))
    }

    return map
}

fun asJsObject(container: dynamic): JsObject {
    //language=JavaScript
    return js("var hashMap = {\n    keys: Object.keys(container),\n    get: function(key){\n        return container[key]\n    }\n}\nreturn hashMap")
}