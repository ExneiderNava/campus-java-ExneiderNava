public class S02Lab04EligeLaEntrega {
    public static void main(String[] args) {
        String tipoEntrega = "EXPRESS";

        // TODO 1: Resolver ESTANDAR=500, EXPRESS=1200 y RECOGIDA=0 centavos con switch.
        // TODO 2: Manejar default como opción inválida; no mostrar un costo válido.
        // TODO 3: En opciones válidas mostrar "Costo (centavos): " con el valor.
        // TODO 4: Usar un ternario para elegir "Retiro en tienda" o "Entrega a domicilio".
        // TODO 5: Mostrar la etiqueta con "Etiqueta: "; para invalidos mostrar solo
        // "Tipo de entrega invalido".
        // TODO 6: Probar los tres tipos y DRON; opcionalmente comparar switch clásico y moderno
        // en tu copia personal. Entregar una versión y explicar break y las flechas.

        switch (tipoEntrega) {
            case "ESTANDAR":
                System.out.println("Costo : 500");
                break;
            case "EXPRESS":
                System.out.println("Costo : 1200");
                break;
            case "RECOGIDA":
                System.out.println("Costo : 0");
                break;
            default:
                System.out.println("opcion invalida");
                break;
        }
    }
}
