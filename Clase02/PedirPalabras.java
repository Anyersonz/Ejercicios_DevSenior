import java.util.Scanner;

public class PedirPalabras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduzca palabra 1: ");
        var palabra1 = scanner.nextLine();
        
        System.out.print("Introduzca palabra 2: ");
        var palabra2 = scanner.nextLine();
        
        System.out.print("Introduzca palabra 3: ");
        var palabra3 = scanner.nextLine();
        
        System.out.println(palabra1 + " " + palabra2 + " " + palabra3);
        
        scanner.close();
    }
}
