public class RekeningBank {
    private String namaPemilik;
    private double saldo;

    public RekeningBank(String namaPemilik) {
        this.namaPemilik = namaPemilik;
        saldo = 0;
    }

    public void setoran(double jumlah) {
        if(jumlah > 0) {
            saldo += jumlah;
            System.out.println("Setoran berhasil: Rp " + jumlah);
        } else {
            System.out.println("Setoran gagal. Jumlah harus lebih dari nol.");
        }
    }

    public void tarikSaldo(double jumlah) {
        if(saldo >= jumlah && jumlah > 0) {
            saldo -= jumlah;
            System.out.println("Penarikan berhasil: Rp " + jumlah);
        } else {
            System.out.println("Penarikan gagal. Saldo tidak mencukupi.");
        }
    }

    public double cekSaldo() {
        return saldo;
    }
}