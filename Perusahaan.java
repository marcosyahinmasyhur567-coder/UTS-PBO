package pewarisanMultilevel;

class Pegawai {
    String nama;

    void bekerja() {
        System.out.println(nama + " sedang bekerja.");
    }
}

class Manajer extends Pegawai {
    void memimpin() {
        System.out.println(nama + " sedang memimpin rapat.");
    }
}

class Direktur extends Manajer {
    void membuatKeputusan() {
        System.out.println(nama + " sedang membuat keputusan strategis.");
    }
}

public class Perusahaan {
    public static void main(String[] args) {
        Direktur direkturUtama = new Direktur();
        direkturUtama.nama = "Marco Syahin Masyhur";

        System.out.println("Aktivitas " + direkturUtama.nama + ":");
        
        direkturUtama.bekerja();
        direkturUtama.memimpin();
        
        direkturUtama.membuatKeputusan();
    }
}