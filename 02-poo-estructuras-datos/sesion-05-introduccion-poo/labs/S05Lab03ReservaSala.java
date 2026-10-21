public class S05Lab03ReservaSala {
    public static void main(String[] args) {
        // TODO 7: Crear reservaAna (2 horas, 15000 pesos/hora) y reservaLuis (1, 20000).
        S05ReservaSala reservaAna = new S05ReservaSala("Ana", 2,15000L);
        S05ReservaSala reservaLuis = new S05ReservaSala("Luis", 1, 20000L);
        // TODO 8: Mostrar los resultados de extender la reserva de Ana en 1, 6 y 0 horas.
        System.out.println("======================");
        System.out.println("Resultados de extender la reserva de Ana");
        System.out.println(reservaAna.extender(1));
        System.out.println(reservaAna.extender(6));
        System.out.println(reservaAna.extender(0));
        System.out.println("======================");

        // TODO 9: Mostrar cliente, horas y costo final de ambas reservas.
        System.out.println("=======================");
        System.out.println("Reserva 1");
        System.out.println("Cliente : " + reservaAna.obtenerCliente());
        System.out.println("Horas reservadas : " + reservaAna.obtenerHoras());
        System.out.println("Costo Final : " + reservaAna.calcularCosto());
        System.out.println("=======================");
        System.out.println("=======================");
        System.out.println("Reserva 2");
        System.out.println("Cliente : " + reservaLuis.obtenerCliente());
        System.out.println("Horas reservadas : " + reservaLuis.obtenerHoras());
        System.out.println("Costo Final : " + reservaLuis.calcularCosto());
        System.out.println("=======================");
    }
}
