/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author User
 */
public class BilGenap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Deret Bilangan Ganjil:");
        for (int i = 0; i <= 20; i++) {
            if (isGanjil(i)) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\n\nDeret Bilangan Genap:");
        for (int i = 0; i <= 20; i++) {
            if (isGenap(i)) {
                System.out.print(i + " ");
            }
        }
    }
    
    private static boolean isGanjil(int n) {
        return n % 2 != 0;
    }

    
    private static boolean isGenap(int n) {
        return n % 2 == 0;
    }
}
