
package pkg2206789_eka.nurul_pertemuan.pkg6;


public class Segitiga {
private double alas;
    private double tinggi;
    private double sisi;

    // Constructor tanpa parameter
    public Segitiga() {
        alas = 0;
        tinggi = 0;
        sisi = 0;
    }

    // Constructor dengan parameter
    public Segitiga(double alasBaru, double tinggiBaru, double sisiBaru) {
        alas = alasBaru;
        tinggi = tinggiBaru;
        sisi = sisiBaru;
    }

    // Method untuk menghitung luas segitiga
    public double getLuas() {
        return 0.5 * alas * tinggi;
    }

    // Method untuk menghitung keliling segitiga
    public double getKeliling() {
        return 3 * sisi;
    }

    // Setter untuk alas
    public void setAlas(double alasBaru) {
        alas = alasBaru;
    }

    // Setter untuk tinggi
    public void setTinggi(double tinggiBaru) {
        tinggi = tinggiBaru;
    }

    // Setter untuk sisi
    public void setSisi(double sisiBaru) {
        sisi = sisiBaru;
    }
    public static void main(String[] args) {
        // Membuat objek segitiga
        Segitiga segitiga1 = new Segitiga(1, 1, 1);
        Segitiga segitiga2 = new Segitiga(30, 10, 90);
        Segitiga segitiga3 = new Segitiga(20, 30, 60);

        // Menampilkan luas dan keliling segitiga 1
        System.out.println("Segitiga 1:");
        System.out.println("Luas Segitiga: " + segitiga1.getLuas());
        System.out.println("Keliling Segitiga: " + segitiga1.getKeliling());
        System.out.println();

        // Menampilkan luas dan keliling segitiga 2
        System.out.println("Segitiga 2:");
        System.out.println("Luas Segitiga: " + segitiga2.getLuas());
        System.out.println("Keliling Segitiga: " + segitiga2.getKeliling());
        System.out.println();

        // Menampilkan luas dan keliling segitiga 3
        System.out.println("Segitiga 3:");
        System.out.println("Luas Segitiga: " + segitiga3.getLuas());
        System.out.println("Keliling Segitiga: " + segitiga3.getKeliling());
    }
    
}
