public class ItemDataJ {
    private Object originalValue;

    public ItemDataJ(Object originalValue) {
        this.originalValue = originalValue;
    }

    public String getType() {
        if (originalValue instanceof String) {
            return "cadena";

        }

        else if (originalValue instanceof Integer) {
            return "entero";

        }

        else if (originalValue instanceof Boolean) {
            return "booleano";

        }

        else {
            return null;
        }
    }

    public String getInfo() {
        if (originalValue instanceof String) {
            String palabra_recibida = (String) originalValue;
            return "L" + palabra_recibida.length();
        }

        else if (originalValue instanceof Integer) {
            int n_recibido = (Integer) originalValue;
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
            boolean bolean_recibido = (Boolean) originalValue;
            return bolean_recibido ? "Verdadero" : "Falso";
        }

        else {
            return null;
        }
    }
}
