public class Lab04DiagnosticaYCorrige {
    public static void main(String[] args) {
        // En tu copia personal, activa un caso por vez, lee el error y repáralo.
        // Los casos están comentados para que esta plantilla pueda compilar.

        // Caso 1: String nombre = 'Ana';
        // TODO 1: Corregir las comillas, mostrar el nombre y explicar la causa.
        String nombre = "Ana";
        System.out.println("============");
        System.out.println("Nombre : " + nombre);
        System.out.println("La causa del error eran las comillas simples");
        System.out.println("Las comillas simples son para caracteres no para string");
        System.out.println("============");

        // Caso 2: int temperatura = 23.5;
        // TODO 2: Conservar el valor decimal usando un tipo adecuado y mostrarlo.
        double temperatura = 23.5;
        System.out.println("===========");
        System.out.println("Temperatura :" + temperatura);
        System.out.println("===========");

        // Caso 3:
        // int edad;
        // System.out.println(edad);
        // TODO 3: Inicializar edad antes de mostrarla y explicar por qué es necesario.
        System.out.println("==========");
        int edad = 22;
        System.out.println("Edad :" + edad);
        System.out.println("Es necesario inciarla primero porque declararla \n sin inicializarla trae un error de java \n si la intencion es dejarla vacia es mejor inicializarla en 0");
        System.out.println("==========");

        // Caso 4:
        // final String CURSO = "Java";
        // CURSO = "Python";
        // TODO 4: Conservar CURSO como final y mostrar "Java", sin reasignarlo.

        final String curso = "Java";
        System.out.println("Curso :" + curso);

        // TODO 5: Registrar los cuatro mensajes del compilador en tu README personal,
        // junto con la causa y la corrección aplicada a cada caso.
    }
}
