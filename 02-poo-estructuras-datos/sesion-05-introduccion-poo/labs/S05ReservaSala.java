public class S05ReservaSala {
    // TODO 1: Declarar cliente (String), horas (int) y tarifaPorHora (long) privados.
    private String cliente;
    private int horas;
    private long tarifaPorHora;

    public S05ReservaSala(String cliente, int horas, long tarifaPorHora) {
        // TODO 2: Inicializar los tres campos con los parametros.
        this.cliente = cliente;
        this.horas = horas;
        this.tarifaPorHora = tarifaPorHora;
    }

    public String obtenerCliente() {
        // TODO 3: Devolver el cliente.
        return this.cliente; // Retorno provisional: reemplazar.
    }

    public int obtenerHoras() {
        // TODO 4: Devolver las horas actuales.
        return this.horas; // Retorno provisional: reemplazar.
    }

    public long calcularCosto() {
        // TODO 5: Devolver horas por tarifaPorHora.
        return this.tarifaPorHora * this.horas; // Retorno provisional: reemplazar.
    }

    public boolean extender(int horasAdicionales) {
        // TODO 6: Aceptar solo de 1 a 8 - horas; actualizar si acepta y devolver el resultado.
        if (horasAdicionales >= 1 && horasAdicionales <= (8 - this.horas)){
            this.horas += horasAdicionales;
            return true;
        } else {
            return false;
        }
    }
}
