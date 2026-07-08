import java.util.Scanner;

public class salsabila {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String nama;
        double gajiPokok, bonus, totalGaji;
        String ulang;

        do {
            System.out.println("===== APLIKASI PENGHITUNG TOTAL GAJI =====");

            // Input
            System.out.print("Nama Karyawan : ");
            nama = input.nextLine();

            System.out.print("Gaji Pokok    : Rp");
            gajiPokok = input.nextDouble();

            // Percabangan
            if (gajiPokok >= 6000000) {
                bonus = 1200000;
            } else {
                bonus = 600000;
            }

            // Perhitungan
            totalGaji = gajiPokok + bonus;

            // Output
            System.out.println("\n===== HASIL PERHITUNGAN =====");
            System.out.println("Nama Karyawan : " + nama);
            System.out.println("Gaji Pokok    : Rp" + gajiPokok);
            System.out.println("Bonus         : Rp" + bonus);
            System.out.println("Total Gaji    : Rp" + totalGaji);

            // Membersihkan buffer
            input.nextLine();

            // Perulangan
            System.out.print("\nHitung gaji karyawan lain? (Y/T): ");
            ulang = input.nextLine();

            System.out.println();

        } while (ulang.equalsIgnoreCase("Y"));

        System.out.println("Program selesai.");

        input.close();
    }
}