package Perpustakaan;

import Perpustakaan.*;

public class Main {
    public static void main(String[] args) {
        Buku buku1 = new NonFiksi("Harry Potter", "Joane Rowling", "Fantasi");
        Buku buku2 = new Fiksi("Tere Liye", "Andrea Hirata", "Romance.");

        buku1.displayInfo();
        buku2.displayInfo();

        Anggota anggota1 = new Anggota("Azka Hafiyan Kahfi Ahshoni", "E222");
        Anggota anggota2 = new Anggota("Aulia Rahmi", "E216");

        anggota1.display();
        anggota2.display();

        anggota1.pinjamBuku("Harry Potter");
        anggota2.pinjamBuku("Tere Liye", 7);

        anggota1.kembalikanBuku("Harry Potter");
        anggota2.kembalikanBuku("Tere Liye");
    }
}
