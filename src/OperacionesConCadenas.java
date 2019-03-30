public class OperacionesConCadenas {
    public static void main(String[] args) {

        // Contar tamaño cadena
        String nombre = "Carlos";
        System.out.println("El nombre tiene " + nombre.length() + " letras");

        // Obtener parte de una cadena
        System.out.println("Letras entre las posiciones 0 y 3: " + nombre.substring(0,3));

        // Quitar espacios al principio y al final
        String cadenaConEspacios = "  Sin  espacios   ";
        System.out.println(cadenaConEspacios.trim());

        // A mayusculas o minusculas
        System.out.println(nombre.toUpperCase());
        System.out.println(nombre.toLowerCase());

        // Separar elementos de una cadena a partir de un caracter
        String prueba = "1;2;3;4;5";
        String[] elementos = prueba.split(";");

        // Comparacion cadenas
        System.out.println(nombre.equals(cadenaConEspacios));

       for(String elemento: elementos) {
           System.out.println(elemento);
        }

       // Unir en una cadena con un delimitador varios elementos separados
       String[] letrasSueltas = {"A","B","C","D"};
       String cadenaUnida = String.join("-",letrasSueltas);
       System.out.println(cadenaUnida);
    }
}
