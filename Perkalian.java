import java.util.Scanner;
public class Perkalian {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai n: ");
        int n = input.nextInt();
        
        // Membuat header tabel
        System.out.print("|      ");
        for (int i = 1; i <= n; i++) {
            System.out.printf("|%5d", i);
        }
        System.out.println("|");
        
        // Membuat garis pembatas
        System.out.print("|------");
        for (int i = 1; i <= n; i++) {
            System.out.print("|-----");
        }
        System.out.println("|");
        
        // Membuat isi tabel
        for (int i = 1; i <= n; i++) {
            System.out.printf("|%5d ", i);
            for (int j = 1; j <= n; j++) {
                System.out.printf("|%5d", i * j);
            }
            System.out.println("|");
        }
    }
    
}