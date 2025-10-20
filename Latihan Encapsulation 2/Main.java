public class Main {
    public static void main(String[] args) {
        RekeningBank rekening1 = new RekeningBank("Gifel");
        rekening1.setoran(1000);
        rekening1.tarikSaldo(200);
        double saldo = rekening1.cekSaldo();
        System.out.println("Saldo saat ini: Rp " + saldo);
    }
}