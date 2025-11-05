package PengaruhAccessModifier;

class AkunBank {
    public String namaPemilik;
    protected double saldoProtected;
    private double saldoPrivat;

    public AkunBank(String nama, double saldoAwal) {
        this.namaPemilik = nama;
        this.saldoProtected = saldoAwal;
        this.saldoPrivat = saldoAwal;
    }

    public double getSaldoPrivat() {
        return this.saldoPrivat;
    }
}

class RekeningTabungan extends AkunBank {

    public RekeningTabungan(String nama, double saldoAwal) {
        super(nama, saldoAwal);
    }

    public void tampilkanInfo() {
       
        System.out.println("===============================");
        System.out.println("Nama: Marco Syahin Masyhur");
        System.out.println("NIM : 32602400014");
        System.out.println("===============================");
        System.out.println("Saldo (Protected): " + saldoProtected);
        System.out.println("Saldo (Private via Getter): " + getSaldoPrivat());
    }
}

// Kelas utama untuk menjalankan program
public class AccessModifier {
    public static void main(String[] args) {
        RekeningTabungan tabungan = new RekeningTabungan("Marco", 1000000);
        
        tabungan.tampilkanInfo();
        
        
        System.out.println("Akses public: " + tabungan.namaPemilik);

    }
}