public class S02Lab03ClasificaResultados {
    public static void main(String[] args) {
        int nota = 95;

        // TODO 1: Rechazar notas fuera de 0 a 100 antes de clasificarlas.
        // TODO 2: Clasificar con if/else if/else: A desde 90, B desde 80,
        // C desde 70, D desde 60 y E por debajo de 60.
        // TODO 3: Mostrar "Categoria X" o "Nota invalida" según corresponda.
        // TODO 4: Probar nota 85, 90 y 101; las demás entradas son opcionales.
        // TODO 5: Explicar con nota = 95 por qué el orden de las condiciones importa.

        if (nota < 0 && nota > 100) {
            System.out.println("Nota invalida");
        } else if (nota >= 90 && nota <= 100) {
            System.out.println("A");
        } else if (nota >=80 && nota < 90) {
            System.out.println("B");
        } else if (nota >= 70 && nota < 80) {
            System.out.println("C");
        } else if (nota >= 60 && nota < 70) {
            System.out.println("D");
        } else if (nota < 60) {
            System.out.println("E");
        }

        /*
            El orden de las condiciones importa porque si la condicion del 90 estuviera arriba de primera nunca caeria en nota invalida y esto es ilogico para lo que queremos lograr, hay que analizar bien la logica.
         */
    }
}
