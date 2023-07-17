class ItemData(val originalValue: Any?) {
    fun getType(): String? {
        return when (originalValue) {
            is String -> "cadena"
            is Int -> "entero"
            is Boolean -> "booleano"
            else -> null
        }
    }

    fun getInfo(): String? {
        return when (originalValue) {
            is String -> "L${originalValue.length}"
            is Int -> when {
                originalValue % 10 == 0 -> "M10"
                originalValue % 5 == 0 -> "M5"
                originalValue % 2 == 0 -> "M2"
                else -> null
            }
            is Boolean -> if (originalValue) "Verdadero"
                else "Falso"
            else -> null
        }
    }
}
