public class Mahasiswa {
    private String nama;
    private String nim;

    // Constructor: mengisi data mahasiswa
    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    // Method login: memverifikasi nama dan NIM
    public boolean login(String inputNama, String inputNim) {
        return this.nama.equalsIgnoreCase(inputNama) && this.nim.equals(inputNim);
    }

    // Method menampilkan data mahasiswa
    public void displayInfo() {
        System.out.println("=== Informasi Mahasiswa ===");
        System.out.println("Nama : " + this.nama);
        System.out.println("NIM  : " + this.nim);
    }
}