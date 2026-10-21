public class Lab05PerfilEstudiante {
    public static void main(String[] args) {
        // TODO 1: Identificar los tipos de nombre, edad, ciudad, promedio y activo.
        /*
            nombre tipo string
            edad tipo int
            ciudad tipo string
            promedio tipo double
            activo tipo boolean
         */
        // TODO 2: Declarar e inicializar esos datos con nombres claros.
        String nombre = "Exneider";
        int edad = 22;
        String ciudad = "cucuta";
        double promedio = 5.0;
        boolean activo = true;

        // TODO 3: Declarar final String CURSO con el valor "Java".
        final String curso = "java";
        // TODO 4: Mostrar la ficha inicial con etiquetas legibles.
        System.out.println("==============");
        System.out.println("Nombre : " + nombre);
        System.out.println("Edad : " + edad);
        System.out.println("Ciudad : " + ciudad);
        System.out.println("Promedio : " + promedio);
        System.out.println("Esta Activo : " + activo);
        System.out.println("Curso : " + curso);
        System.out.println("==============");
        // TODO 5: Reasignar ciudad para representar un cambio de residencia y mostrar
        // "Ciudad actualizada: " con el nuevo valor, conservando el mismo tipo.
        ciudad = "Medellin";
        System.out.println("Ciudad actualizada: " + ciudad);
        // TODO 6: Probar el perfil A del README; el perfil B es opcional.
        nombre = "Ana";
        edad = 20;
        ciudad = "cucuta";
        promedio = 4.2;
        activo = true;

        System.out.println("==============");
        System.out.println("Nombre : " + nombre);
        System.out.println("Edad : " + edad);
        System.out.println("Ciudad : " + ciudad);
        System.out.println("Promedio : " + promedio);
        System.out.println("Esta Activo : " + activo);
        System.out.println("Curso : " + curso);
        ciudad = "Bogota";
        System.out.println("Ciudad actualizada: " + ciudad);
        System.out.println("==============");

        // TODO 7: Colocar un breakpoint antes de la reasignación; observar ciudad,
        // usar Step Over y registrar el valor anterior y el nuevo.
        // TODO 8: Explicar una elección de tipo y qué garantiza final en CURSO.
        /*
            La eleccion de tipo de dato se basa en el dato que queremos alamacenar por ejemplo si necesitamos operaciones matematicas necesitamos int o double para ejecutar operaciones matematicas y asi continuamos con el resto de datos.
            final ganarantiza que el dato alamacena sea inmutable una vez se defina con final no podra cambiar a lo largo del programa.
         */
    }
}
