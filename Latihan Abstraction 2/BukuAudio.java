class BukuAudio extends Buku {
    private String jenis;

    public BukuAudio(String judul, String penulis, String jenis) {
        super(judul, penulis);
        this.jenis = jenis;
    }

    public void tampilkanKonten() {
        System.out.println(
            "Buku Audio: " + super.judul +
            " oleh " + super.penulis +
            ", Jenis: " + jenis
        );
    }
}