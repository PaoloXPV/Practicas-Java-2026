import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        // 1. Variables y simulador de una base de datos falsa
        String usuarioCorrecto = "Paolo";
        String passwordCorrecta = "Java2026";

        Scanner entrada = new Scanner(System.in);

        System.out.println("--- BIENVENIDO AL SISTEMA DE SEGURIDAD ---");
        System.out.print("Ingrese Usuario: ");
        String usuarioIngresado = entrada.next();
        System.out.print("Ingrese Contraseña: ");
        String passwordIngresada = entrada.next();

        if (usuarioIngresado.equals(usuarioCorrecto) && passwordIngresada.equals(passwordCorrecta)) {
            // Si las DOS cosas son verdad (&&)
            System.out.println(" ACCESO CONCEDIDO. Bienvenido, Ingeniero " + usuarioIngresado);
        } else {
            // Si falla alguna
            System.out.println(" ACCESO DENEGADO. Usuario o clave incorrectos.");
        }
    }
}