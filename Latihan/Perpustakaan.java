import java.util.ArrayList;

class Perpustakaan {
    private ArrayList<Buku> koleksiBuku = new ArrayList<>();

    public void tambahBuku(Buku buku) {
        koleksiBuku.add(buku);
    }

    public void tampilkanKoleksi() {
        for(Buku buku : koleksiBuku) {
            buku.tampilkanKonten();
        }
    }
}