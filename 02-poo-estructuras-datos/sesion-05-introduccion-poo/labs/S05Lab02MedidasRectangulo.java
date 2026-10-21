public class S05Lab02MedidasRectangulo {
    public static void main(String[] args) {
        // TODO 6: Crear primeraFigura de 5 por 3 y segundaFigura de 4 por 4.
        S05Rectangulo primeraFigura = new S05Rectangulo(5,3);
        S05Rectangulo segundaFigura = new S05Rectangulo(4,4);

        // TODO 7: Mostrar area, perimetro y esCuadrado de cada figura.

        System.out.println("==================");
        System.out.println("Primera Figura");
        System.out.println("Area : " + primeraFigura.calcularArea() + " m2");
        System.out.println("Perimetro : " + primeraFigura.calcularPerimetro() + " m");
        System.out.println("La figura es cuadrada : " + primeraFigura.esCuadrado());
        System.out.println("==================");
        System.out.println("==================");
        System.out.println("Segunda Figura");
        System.out.println("Area : " + segundaFigura.calcularArea() + " m2");
        System.out.println("Perimetro : " + segundaFigura.calcularPerimetro() + " m");
        System.out.println("La figura es cuadrada : " + segundaFigura.esCuadrado());
        System.out.println("==================");
    }
}
