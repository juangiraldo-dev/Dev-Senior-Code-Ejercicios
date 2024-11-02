package EjerciciosClase1;
import java.util.Scanner;

public class PedirPalabras {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        String palabra1, palabra2, palabra3;

        System.out.println("Introduzca palabra 1: ");
        palabra1 = scanner.nextLine();

        System.out.println("Introduzca palabra 2: ");
        palabra2 = scanner.nextLine();

        System.out.println("Introduzca palabra 3: ");
        palabra3 = scanner.nextLine();

        System.out.printf("%s %s %s",palabra1,palabra2,palabra3);

        scanner.close();

    } 
}
