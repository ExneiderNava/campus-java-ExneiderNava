public class Lab02OrdenaLaSalida {
    public static void main(String[] args) {
        // TODO 1: Predecir la salida de estas tres instrucciones en un comentario.
        System.out.print("A");
        System.out.println("B");
        System.out.println("C");

        // TODO 2: Ejecutar y explicar cualquier diferencia con tu predicción.
        /*
            El programa mostró
            AB
            C
            Esto ocurre porque cuando usamos solo print ejecuta y el siguiente los muestra justo al lado en cambio println ejecuta y al final de lo que imprime da un salto de linea esto es como hacer "ENTER" quiero decir que se muestra debajo del otro.
         */
        // TODO 3: Modificar las instrucciones anteriores para obtener:
        // A - B - C
        System.out.println("===========");
        System.out.print("A - ");
        System.out.print("B - ");
        System.out.println("C");
        System.out.println("Fin del laboratorio");
        System.out.println("===========");
        // TODO 4: Agregar debajo una segunda línea que diga "Fin del laboratorio".
        // TODO 5: Explicar qué instrucción produce cada salto de línea.
        /*
            Añadi unas barras decorativas "===" solo para mejorar la visualizacion y me pedian que mostrara de la siguiente forma A - B - C entonces para ello habia que imprimir A sin el ln B sin el ln y esto causa que todos se vean en una misma linea, tambien se pudo haber hecho en un solo print pero el objetivo era mostrar el uso correcto del ln y adicionalmente como lo pedia el ejercicio agregue la ultima frase Fin del laboratorio
         */
    }
}
