public class S02Lab01CalculaYPredice {
    public static void main(String[] args) {
        int unidades = 7;
        int capacidad = 2;
        int contador = 3;

        // TODO 1: Predecir los resultados en un comentario antes de ejecutar.
        /*
            1. mostrara 3.5
            2. mostrara true
            3. mostrara 4 y 2
         */
        // TODO 2: Calcular y mostrar suma, resta, producto, división entera y resto.
        // TODO 3: Mostrar 7.0 / capacidad y explicar por qué conserva decimales.
        System.out.println(7.0 / capacidad);
        /*
         Conserva decimales porque se prioriza el tipo de dato double.
         */
        // TODO 4: Comparar 2 + 3 * 4 con (2 + 3) * 4.
        System.out.println(2+3*4 == (2+3) * 4);
        // TODO 5: Incrementar contador en una sentencia, mostrarlo; decrementar y mostrarlo.
        System.out.println("Incrementar" + ++contador);
        System.out.println("Decrementar" + --contador);
        // TODO 6 (opcional): Probar unidades = 8 y explicar qué cambia. Mantener capacidad = 2.
        // TODO 7: Registrar predicción, resultado y causa de cualquier diferencia.
        /*
        1. correcto
        2. mi prediccion no fue correcta da como resultado false
        3. mi prediccion no fue correcta da como resultado 4 y 3 porque la variable cambio en la primera operacion
         */
    }
}
