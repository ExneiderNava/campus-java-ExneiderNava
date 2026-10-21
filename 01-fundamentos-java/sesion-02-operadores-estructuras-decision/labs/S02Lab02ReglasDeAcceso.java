public class S02Lab02ReglasDeAcceso {
    public static void main(String[] args) {
        int edad = 18;
        boolean esMiembro = false;
        boolean tieneInvitacion = true;
        boolean bloqueado = false;

        // TODO 1: Escribir la regla de acceso en lenguaje natural.
        /*
         Si es mayor que 18 , es miembro tiene invitacion y no esta bloqueado
         */
        // TODO 2: Construir puedeEntrar combinando edad, membresía, invitación y bloqueo.
        // TODO 3: Mostrar "Acceso permitido" o "Acceso denegado" con if/else.
        // TODO 4: Probar los tres casos mínimos del README; las otras combinaciones son opcionales.
        // TODO 5: Explicar por qué el bloqueo impide siempre el acceso.
        // TODO 6 (opcional): Colocar un breakpoint en if y observar puedeEntrar antes de elegir la rama.

        if (edad >= 18 && esMiembro && tieneInvitacion && bloqueado == false) {
            System.out.println("Acceso permitido");
        } else {
            System.out.println("Acceso negado");
        }
    }
}
