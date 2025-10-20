public class Main {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa();
        m1.setNama("Gifel");
        m1.setUmur(19);

        System.out.println(
            "Nama : " + m1.getNama() + 
            "\nUmur : " + m1.getUmur());
    }
}