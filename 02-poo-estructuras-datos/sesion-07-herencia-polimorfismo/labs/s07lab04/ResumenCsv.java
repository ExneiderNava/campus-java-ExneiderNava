
// TODO 3: Implementar Exportable y completar exportar con @Override.
public class ResumenCsv implements Exportable{
    public String exportar(String titulo, int cantidad) {
        return titulo + "," + cantidad;

    }
}
