package PBO1UAS;

import java.util.Scanner;

public class MobilBerjalan {
    public static void main(String[] args) {
        //Mobil mobil = new Mobil("Pajero", "V, Tipe Termahal", "Manual");
        //System.out.println(mobil.displayInfo());
        //System.out.println(mobil.displayInfo("Toyota"));
        
        //IO Sederhana
        Scanner scanner = new Scanner(System.in);
        
        //Array
        MobilDetail[] mobilArray = new MobilDetail[2];
        
        //Perulangan
         for (int i = 0; i < mobilArray.length; i++) {
            System.out.println("Input data mobil ke-" + (i + 1));

            System.out.print("Masukkan Nama Mobil: ");
            String namaMobil = scanner.nextLine();

            System.out.print("Masukkan Tipe Mobil (J/E/V/G): ");
            String tipe = scanner.nextLine();

         String gear;
            while (true) {
                System.out.print("Masukkan Gear Mobil (Manual/Automatic): ");
                gear = scanner.nextLine();
                if (gear.equalsIgnoreCase("Manual") || gear.equalsIgnoreCase("Automatic")) {
                    break; // Valid input
                } else {
                    System.out.println("Gear tidak valid. Silakan masukkan 'Manual' atau 'Automatic'.");
                }
            }

            System.out.print("Masukkan Tahun Pembuatan: ");
            String tahunPembuatan = scanner.nextLine();

            System.out.print("Masukkan CC: ");
            String cc = scanner.nextLine();

            System.out.print("Masukkan Kode Daerah: ");
            String kodeDaerah = scanner.nextLine();

            // Gabungkan data menjadi satu string
            String data = tahunPembuatan + "/" + cc + "/" + kodeDaerah;

            mobilArray[i] = new MobilDetail(namaMobil, tipe, gear, data);

            System.out.println();
        }

        System.out.println("Detail Mobil:");
        for (MobilDetail mobilDetail : mobilArray) {
            mobilDetail.displayDetails();
            System.out.println();
        }

        scanner.close();
    }
}
