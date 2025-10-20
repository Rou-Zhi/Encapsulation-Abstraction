public class Main {
    public static void main(String[] args) {
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

        buku1.tampilkanKonten();
        buku2.tampilkanKonten();
    }
}