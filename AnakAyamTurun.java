/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author User
 */
public class AnakAyamTurun {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("==================================");
        System.out.println("Nama    : Ghaida Putri Yunisa");
        System.out.println("Kelas   : 3C - Informatika");
        System.out.println("NPM     : 2210631170022");
        System.out.println("==================================\n");
        int totalAnakAyam = 5;

        System.out.println("Lagu Anak Ayam Turun N:");

        for (int i = totalAnakAyam; i >= 1; i--) {
            System.out.println("Anak ayam turun " + i);
            System.out.println("Mati satu tinggal " + (i - 1));
            System.out.println("Matilah satu tinggal lah satu\n");
        }
    }
}
