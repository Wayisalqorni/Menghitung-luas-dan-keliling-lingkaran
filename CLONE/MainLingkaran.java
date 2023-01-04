
package CLONE;

import java.util.Scanner;

public class MainLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lingkaran L = new Lingkaran();
        try (Scanner input = new Scanner(System.in)) {
            for (int i = 0; i <= 5; i++) {
                System.out.println("Nama   : Wayis Al Qorni TS");
                System.out.println("Nim    : 312010169");
                System.out.println("Kelas  : TI.20.A.1");
                System.out.println("_______________________________________________________");
                System.out.print("Masukkan nilai jari-jari  :");
                float r = input.nextFloat();
                L.setR(r);
                System.out.println("Nilai jari-jari           :" + L.getR());
                System.out.println("_______________________________________________________");
                System.out.println();
                System.out.println("Nilai Luas Lingkaran Adalah     :" + L.getLuasLingkaran());
                System.out.println("Nilai keliling Lingkaran Adalah :" + L.getKelilingligkaran());
                System.out.println("_______________________________________________________");
            }
        }
    }

}
