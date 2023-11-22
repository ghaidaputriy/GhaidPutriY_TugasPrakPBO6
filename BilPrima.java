/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author User
 */
public class BilPrima {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Deret Bilangan Prima:");
        for (int i = 0; i <= 20; i++) {
            if (isPrima(i)) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\n\nDeret Bilangan Bukan Prima:");
        for (int i = 0; i <= 20; i++) {
            if (!isPrima(i)) {
                System.out.print(i + " ");
            }
        }
    }
    
    private static boolean isPrima(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}