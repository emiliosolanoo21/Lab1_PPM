/*
Guatemala, julio 16 de 2023
Universidad del Valle de Guatemala
Programacion de plataformas moviles, seccion 10
Emilio Jose Solano Orozco, carne 21212

Lab. 1
ItemDataJ.java
 */

public class ItemDataJ {
    private Object originalValue;

    public ItemDataJ(Object originalValue) {
        this.originalValue = originalValue;
    }

    public String getType() {

        //Si se identifica como String, devolvera el string de "cadena".
        if (originalValue instanceof String) {
            return "cadena";

        }

        //Si se identifica como Integer, devolvera el string de "entero".
        else if (originalValue instanceof Integer) {
            return "entero";

        }

        //Si se identifica como Boolean, devolvera el string de "booleano".
        else if (originalValue instanceof Boolean) {
            return "booleano";

        }

        //Si no se identifica ninguno de los anteriores, el valor retornado sera un valor nulo,
        //en vez de un string identificador.
        else {
            return null;
        }
    }

    public String getInfo() {

        //Se usara una variable diferente de acuerdo a lo que identifique originalValue.

        if (originalValue instanceof String) {

            //Variable por si originalValue es un String
            String palabra_recibida = (String) originalValue;
            return "L" + palabra_recibida.length();
        }

        else if (originalValue instanceof Integer) {

            //Variable por si originalValue es un Integer
            int n_recibido = (Integer) originalValue;

            /*
            Secuencia de condiciones para identificar si es multiplo de alguno de
            los valores indicados. Devolvera el primer valor identificado, en caso que
            originalValue sea multiplo de mas de uno de estos valores.
             */
            if (n_recibido % 10 == 0) {
                return "M10";
            }

            else if (n_recibido % 5 == 0) {
                return "M5";
            }

            else if (n_recibido % 2 == 0) {
                return "M2";
            }

            else {
                return null;
            }
        }

        else if (originalValue instanceof Boolean) {

            //Variable por si originalValue es un Boolean
            boolean bolean_recibido = (Boolean) originalValue;

            //Traduccion de True y False a Verdadero y Falso
            return bolean_recibido ? "Verdadero" : "Falso";
        }

        //Si nada de lo anterior cumple, se devolvera un valor nulo.
        else {
            return null;
        }
    }
}
