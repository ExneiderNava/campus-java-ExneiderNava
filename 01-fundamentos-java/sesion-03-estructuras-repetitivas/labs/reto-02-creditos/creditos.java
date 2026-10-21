import java.util.Scanner;

public class creditos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int evaluada = 0;
        int aprobadas = 0;
        int revisionManual = 0;
        int rechazadas = 0;

        int opcion;

        do {
            System.out.println("===================================");
            System.out.println("Simulador de aprobación de creditos");
            System.out.println("Escriba la opción del menú");
            System.out.println("1. Nueva Solicitud");
            System.out.println("0. Finalizar");
            while (!sc.hasNextInt()) {
                System.out.println("Ingrese el numero de la opcion");
                sc.next();
            }
            opcion = sc.nextInt();

            if ( opcion != 0 && opcion != 1) {
                System.out.println("Opcion invalida, intentelo de nuevo");
                continue;
            }

            if (opcion == 1) {
                System.out.println("Ingrese la edad");
                while (!sc.hasNextLong()) {
                    System.out.println("Por favor ingrese una edad valida");
                    sc.next();
                }
                long edad = sc.nextLong();
                while (edad < 0 || edad > 100) {
                    System.out.println("Por favor ingrese una edad valida y realista");
                    while (!sc.hasNextLong()) {
                        System.out.println("Por favor ingrese una edad valida");
                        sc.next();
                    }
                    edad = sc.nextLong();
                }

                System.out.println("Ingresos mensuales");
                while (!sc.hasNextLong()) {
                    System.out.println("Solo se permiten numeros enteros");
                    sc.next();
                }

                long ingresos = sc.nextLong();
                while (ingresos < 0 || ingresos > 1_000_000_000L) {
                    System.out.println("Los ingresos deben estar entre 0 y 1.000.000.000");
                    while (!sc.hasNextLong()) {
                        System.out.println("Ingrese un numero entero");
                        sc.next();
                    }
                    ingresos = sc.nextLong();
                }

                System.out.println("Gastos mensuales");
                while (!sc.hasNextLong()) {
                    System.out.println("Ingrese un numero entero");
                    sc.next();
                }
                long gastos = sc.nextLong();
                while (gastos < 0 || gastos > 1_000_000_000L) {
                    System.out.println("Los gastos deben estar entre 0 y 1.000.000.000");
                    while (!sc.hasNextLong()) {
                        System.out.println("Ingrese un numero entero");
                        sc.next();
                    }
                    gastos = sc.nextLong();
                }

                System.out.print("Crédito solicitado: ");
                while (!sc.hasNextLong()) {
                    System.out.println("Error: debe ingresar un número entero.");
                    sc.next();
                }
                long credito = sc.nextLong();
                while (credito < 1 || credito > 1_000_000_000L) {
                    System.out.println("El crédito debe estar entre 1 y 1000000000.");
                    while (!sc.hasNextLong()) {
                        System.out.println("Error: debe ingresar un número entero.");
                        sc.next();
                    }
                    credito = sc.nextLong();
                }

                System.out.print("Meses: ");
                while (!sc.hasNextLong()) {
                    System.out.println("Error: debe ingresar un número entero.");
                    sc.next();
                }
                long meses = sc.nextLong();
                while (meses < 1 || meses > 360) {
                    System.out.println("Los meses deben estar entre 1 y 360.");
                    while (!sc.hasNextLong()) {
                        System.out.println("Error: debe ingresar un número entero.");
                        sc.next();
                    }
                    meses = sc.nextLong();
                }

                String clasificacion;
                System.out.println("--- Resultado de la solicitud ---");

                if (edad < 18 || edad > 70) {
                    clasificacion = "RECHAZADA";
                    System.out.println("Motivo: la edad debe estar entre 18 y 70 años.");
                } else if (ingresos <= gastos) {
                    clasificacion = "RECHAZADA";
                    System.out.println("Motivo: los gastos son iguales o mayores que los ingresos.");
                } else {
                    long disponible = ingresos - gastos;
                    long creditoPorCien = credito * 100;
                    long limite35 = disponible * meses * 35;
                    long limite45 = disponible * meses * 45;
                    long cuotaAproximada = credito / meses;
                    double endeudamiento = credito * 100.0 / (disponible * meses);

                    System.out.println("Dinero disponible: " + disponible);
                    System.out.println("Cuota estimada (aproximada, sin intereses): " + cuotaAproximada);
                    System.out.printf("Endeudamiento: ", endeudamiento);

                    if (creditoPorCien <= limite35) {
                        clasificacion = "APROBADA";
                    } else if (creditoPorCien <= limite45) {
                        clasificacion = "REVISIÓN MANUAL";
                    } else {
                        clasificacion = "RECHAZADA";
                    }
                }

                System.out.println("Clasificación: " + clasificacion);

                // --- Contadores ---
                evaluada++;
                if (clasificacion.equals("APROBADA")) {
                    aprobadas++;
                } else if (clasificacion.equals("REVISIÓN MANUAL")) {
                    revisionManual++;
                } else {
                    rechazadas++;
                }
            }
        } while (opcion != 0);

        System.out.println();
        System.out.println("=== Resumen ===");
        System.out.println("Solicitudes evaluadas: " + evaluada);
        System.out.println("Aprobadas: " + aprobadas);
        System.out.println("Revisión manual: " + revisionManual);
        System.out.println("Rechazadas: " + rechazadas);

        sc.close();
    }
}
