class BukuElektronik extends Buku {
    private String format;

    public BukuElektronik(String judul, String penulis, String format) {
        super(judul, penulis);
        this.format = format;
    }

    public void tampilkanKonten() {
        System.out.println(
            "Buku Elektronik: " + getJudul() +
            " oleh " + getPenulis() +
            ", Format: " + format
        );
    }
}