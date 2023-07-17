/*
Guatemala, julio 16 de 2023
Universidad del Valle de Guatemala
Programacion de plataformas moviles, seccion 10
Emilio Jose Solano Orozco, carne 21212

Lab. 1
ItemData.kt
 */

class ItemData(val originalValue: Any?) {

    //En menos espacio que en Java, se realiza la funcion getType gracias al When Statement.
    fun getType(): String? {
        return when (originalValue) {
            is String -> "cadena"
            is Int -> "entero"
            is Boolean -> "booleano"
            else -> null
        }
    }

    //En menos espacio que en Java, se realiza la funcion getInfo gracias al When Statement.
    fun getInfo(): String? {
        return when (originalValue) {
            is String -> "L${originalValue.length}"

            /*
            When dentro del When para delimitar las condiciones y conocer los multiplos y
            los strings a devolver segun el caso.
             */
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
