import java.util.Scanner;
import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            {
                // Meminta input dari pengguna
                System.out.print("Masukkan Nama: ");
                String nama = scanner.nextLine();

                // Validasi jenis kelamin
                char jenisKelamin;
                while (true) {
                    System.out.print("Masukkan Jenis Kelamin (P/L): ");
                    jenisKelamin = scanner.next().charAt(0);
                    if (jenisKelamin == 'L' || jenisKelamin == 'l' || jenisKelamin == 'P' || jenisKelamin == 'p') {
                        break;
                    }
                    System.out.println("Input tidak valid! Harap masukkan 'P' atau 'L'.");
                }

                // Validasi tahun lahir
                int tahunLahir;
                int tahunSekarang = LocalDate.now().getYear();
                while (true) {
                    System.out.print("Masukkan Tahun Lahir: ");
                    if (scanner.hasNextInt()) {
                        tahunLahir = scanner.nextInt();
                        if (tahunLahir > 1900 && tahunLahir <= tahunSekarang) {
                            break;
                        }
                    } else {
                        scanner.next(); // Menghapus input yang salah
                    }
                    System.out.println("Tahun lahir tidak valid! Masukkan angka antara 1900 hingga " + tahunSekarang);
                }

                // Menghitung umur
                int umur = tahunSekarang - tahunLahir;

                // Menentukan jenis kelamin
                String jenisKelaminString = (jenisKelamin == 'L' || jenisKelamin == 'l') ? "Laki-laki" : "Perempuan";

                // Menampilkan hasil
                System.out.println("\n=== Data Diri Pengguna ===");
                System.out.println("Nama: " + nama);
                System.out.println("Jenis Kelamin: " + jenisKelaminString);
                System.out.println("Umur: " + umur + " tahun");
            }
            // Menutup scanner
            scanner.close();
        }
    }
}