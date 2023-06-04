public class CajaAutomatica {
    public static void main(String[] args) {
         imprimirLogin();
         imprimirMenuUsuario();
    }

    // Impresión de Login
    public static void imprimirLogin() {
        System.out.print("\033[H\033[2J");
        System.out.println("<<<<<<<< --- B I E N V E N I D O --- >>>>>>>>");
        System.out.println("                      A                      ");
        System.out.println("        C A J A   D E   A U T O C O B R O    ");
        System.out.println("╔═══════════════════════════════════════════╗");
        System.out.println("║                                           ║");
        System.out.println("║       1. Iniciar sesión                   ║");
        System.out.println("║       2. Registrarse                      ║");
        System.out.println("║       3. Salir                            ║");
        System.out.println("║                                           ║");
        System.out.println("╚═══════════════════════════════════════════╝");
    }

    // Impresión de menú de usuario
    public static void imprimirMenuUsuario() {
        System.out.print("\033[H\033[2J");
        // "hola user.name"
        System.out.println("╔═══════════════════════════════════════════╗");
        System.out.println("║                                           ║");
        System.out.println("║       1. Ver productos                    ║");
        System.out.println("║       2. Ver carrito                      ║");
        System.out.println("║       3. Salir                            ║");
        System.out.println("║                                           ║");
        System.out.println("╚═══════════════════════════════════════════╝");
        }
}
/*
 * 1. Crear un login: validar con un usuario y contraseña guardados en un archivo
 * 3. Crear un menu de usuario: Iniciar compra, ver carrito, finalizar compra
 * 4. Crear archivo JSON con los productos: nombre, precio, código
 * 5. Crear un archivo JSON con los usuarios: nombre, contraseña, tarjetas asociadas.
 * 6. Si se paga con efectivo, mostrar el vuelto (monedas y billetes válidos)
 * 7. Si se paga con tarjeta, mostrar cuánto se pagó y cuánto se debe pagar
 * 8. Mostrar ticket de compra
 */
