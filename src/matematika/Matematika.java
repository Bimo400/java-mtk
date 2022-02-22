
package matematika;

import java.util.Scanner;

public class Matematika {

    
     
    public static void main(String[] args) {
        // Tugas 1
        System.out.println("Mencetak Bilangan dari 0 - 4");
        for (int i = 0; i <= 4; i++) {
            System.out.println(i);
        }

        // Tugas 2
        int a = 3;
        int n = 2;
        int result = a;
        System.out.println("\nMencetak Hasil dari 3^2");
        for (int i = 1; i < n; i++) {
            result *= a;
        }
        System.out.println("Hasil 3^2 = " +result);


        // Tugas 3
        Scanner input = new Scanner(System.in);
        int pokok, pangkat, hasil;

        System.out.println("\nMencetak Bil. Pangkat");
        System.out.print("Masukkan Bil. pokok = ");
        pokok = input.nextInt();
        hasil = pokok;
        System.out.print("Masukkan Bil. pangkat = ");
        pangkat = input.nextInt();
        if (pangkat == 0) {
            hasil = 1;
        } else {
            for (int i = 1; i < pangkat; i++) {
                hasil *= pokok;
            }
        }
        System.out.println("Hasil = " +hasil);
    }
}
    
    

