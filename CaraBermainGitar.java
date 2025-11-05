package pewarisansederhana;

class AlatMusik {
    String nama;

    void bunyi() {
        System.out.println(nama + " mengeluarkan bunyi...");
    }
}

class Gitar extends AlatMusik {
    
    public Gitar(String nama) {
        this.nama = nama;
    }

    @Override
    void bunyi() {
        System.out.println(nama + " berbunyi: Jreng... Jreng...");
    }

    void petik() {
        System.out.println(nama + " sedang dipetik.");
    }
}

public class CaraBermainGitar {
    public static void main(String[] args) {
        Gitar gitarAkustik = new Gitar("Gitar Akustik");
        
        gitarAkustik.bunyi(); 
        
        gitarAkustik.petik(); 
    }
}