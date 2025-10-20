public class Main {
    public static void main(String[] args) {
        Perpustakaan perpustakaan = new Perpustakaan();

        Buku buku1 = new BukuElektronik(
            "The Catcher in the Rye",
            "J.D. Salinger",
            "PDF"
        );

        Buku buku2 = new BukuAudio(
            "1984",
            "George Orwell",
            "MP3"
        );

        perpustakaan.tambahBuku(buku1);
        perpustakaan.tambahBuku(buku2);

        System.out.println("Koleksi Perpustakaan: ");
        perpustakaan.tampilkanKoleksi();
    }
}