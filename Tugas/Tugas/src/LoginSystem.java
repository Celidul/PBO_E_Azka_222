import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Objek Admin tunggal
        Admin admin1 = new Admin("Admin222", "Pass222");
        Admin admin2 = new Admin("Admin180", "Pass180");

        // Objek Mahasiswa tunggal
        Mahasiswa mahasiswa1 = new Mahasiswa("Azka Hafiyan", "202410370110222");
        Mahasiswa mahasiswa2 = new Mahasiswa("Habibi Dzakki", "202410370110180");

        boolean ulang = true;

        while (ulang) {
            System.out.println("\n=== SISTEM LOGIN ===");
            System.out.println("1. Login sebagai Admin");
            System.out.println("2. Login sebagai Mahasiswa");
            System.out.print("Pilih menu (1/2): ");
            String pilihan = input.nextLine().trim();

            if (pilihan.equals("1")) {
                System.out.print("Masukkan Username Admin: ");
                String username = input.nextLine().trim();

                System.out.print("Masukkan Password Admin: ");
                String password = input.nextLine().trim();

                if (admin1.login(username, password) || admin2.login(username, password)) {
                    System.out.println("✅ Login Admin Berhasil!");
                } else {
                    System.out.println("❌ Username atau Password Admin salah!");
                }

            } else if (pilihan.equals("2")) {
                System.out.print("Masukkan Nama Mahasiswa: ");
                String nama = input.nextLine().trim();

                System.out.print("Masukkan NIM Mahasiswa: ");
                String nim = input.nextLine().trim();

                if (mahasiswa1.login(nama, nim)) {
                    System.out.println("✅ Login Mahasiswa Berhasil!");
                    mahasiswa1.displayInfo();
                } else if (mahasiswa2.login(nama, nim)) {
                    System.out.println("✅ Login Mahasiswa Berhasil!");
                    mahasiswa2.displayInfo();
                } else {
                    System.out.println("❌ Nama atau NIM Mahasiswa salah!");
                }

            } else {
                System.out.println("⚠ Pilihan tidak valid, silakan pilih 1 atau 2.");
            }

            System.out.print("\nApakah Anda ingin login lagi? (y/n): ");
            String ulangi = input.nextLine().trim();
            if (!ulangi.equalsIgnoreCase("y")) {
                ulang = false;
                System.out.println("👋 Program selesai. Terima kasih!");
            }
        }

        input.close();
    }
}