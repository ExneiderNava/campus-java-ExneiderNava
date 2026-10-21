
public class S05Lab01PrestamoLibro {


    public static void main(String[] args) {
        // TODO 7: Crear primerLibro con El principito y segundoLibro con Matilda.
        S05LibroPrestamo ElPrincipito = new S05LibroPrestamo("El Principito");
        S05LibroPrestamo Matilda = new S05LibroPrestamo("Matilda");

        // TODO 8: Mostrar titulo, dos intentos de prestamo y estado del primer libro.
        System.out.println("============");
        System.out.println("Titulo: " + ElPrincipito.obtenerTitulo());
        System.out.println("Resultado de prestar el libro: " + ElPrincipito.prestar());
        System.out.println("Esta prestado : " + ElPrincipito.estaPrestado());
        System.out.println("============");

        System.out.println("============");
        System.out.println("Titulo: " + Matilda.obtenerTitulo());
        System.out.println("Resultado de prestar el libro: " + Matilda.prestar());
        System.out.println("Esta prestado : " + Matilda.estaPrestado());
        System.out.println("============");

        // TODO 9: Devolver el primer libro y mostrar el estado de ambos libros.

        ElPrincipito.devolver();
        System.out.println("El pricipito esta prestado : " + ElPrincipito.estaPrestado());
        System.out.println("Matilda esta prestado : " + Matilda.estaPrestado());
    }
}
