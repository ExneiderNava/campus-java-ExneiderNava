public class Lab03DatosConSentido {
    public static void main(String[] args) {
        // TODO 1: Elegir y justificar los tipos para nombre, edad, temperatura,
        // inicial y activo. Usa String, int, double, char y boolean.
        /*
        Elijire string para nombre porque es texto
        int para edad porque es un numero
        double para temperatura porque es un numero decimal
        char para iniciarl porque creo que se refiere a la inicial de un nombre asi que es una sola letra
        y boolean para activo porque nos permite almacenar true o false.
         */
        // TODO 2: Declarar e inicializar las cinco variables con nombres claros.
        String nombre = "Exneider";
        int edad = 22;
        double temperatura = 12.5;
        char inicial = 'E';
        boolean activo = true;

        // TODO 3: Mostrar cada dato en su propia línea, con una etiqueta.

        System.out.println("====================");
        System.out.println(" String -> " + nombre);
        System.out.println(" int -> " + edad);
        System.out.println(" double -> " + temperatura);
        System.out.println(" char -> " + inicial);
        System.out.println(" boolean -> " + activo);
        System.out.println("====================");

        // TODO 4: Probar el caso A del README; el caso B es opcional.


        nombre = "Ana";
        edad = 20;
        temperatura = 23.5;
        inicial = 'A';
        activo = true;

        System.out.println("====================");
        System.out.println(" Nombre : " + nombre);
        System.out.println(" Edad : " + edad);
        System.out.println(" Temperatura : " + temperatura);
        System.out.println(" Inicial : " + inicial);
        System.out.println(" Activo : " + activo);
        System.out.println("====================");

        // TODO 5: Explicar por qué String no es un tipo primitivo.
        /*
            Un string es una clase de java podemos ver que java lo interpreta de forma diferente a los otros datos primitivos internamente almacena un objeto de char para almacenar la palabra, al ser un objeto le permite a string acceder a funciones propias de ese objeto e internasde java.
         */
    }
}
