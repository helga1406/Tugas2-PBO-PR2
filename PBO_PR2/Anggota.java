import java.util.ArrayList;

public class Anggota {
    private String nama;
    private String id;
    private double saldo;
    private ArrayList<Produk> daftarBeli;

    public Anggota(String nama, String id, double saldo) {
        this.nama = nama;
        this.id = id;
        this.saldo = saldo;
        this.daftarBeli = new ArrayList<>();
    }

    // getter dan setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public ArrayList<Produk> getDaftarBeli() {
        return daftarBeli;
    }

    // method beliProduk dan tampilkanStruk tetap sama
    public boolean beliProduk(Produk p) {
        if (saldo >= p.getHarga()) {
            saldo -= p.getHarga();
            daftarBeli.add(p);
            System.out.println(p.getNamaProduk() + " - Rp" + p.getHarga() + " → Berhasil dibeli");
            return true;
        } else {
            System.out.println(p.getNamaProduk() + " - Rp" + p.getHarga() + " → Saldo tidak cukup");
            return false;
        }
    }

    public void tampilkanStruk() {
        System.out.println("\n==================================");
        System.out.println("           KOPERASI XYZ           ");
        System.out.println("==================================");
        System.out.println("Nama Anggota : " + nama);
        System.out.println("ID Anggota   : " + id);
        System.out.println("----------------------------------");
        System.out.println("Daftar Produk Dibeli:");
        double total = 0;
        for (Produk p : daftarBeli) {
            System.out.printf("%-15s : Rp%.2f\n", p.getNamaProduk(), p.getHarga());
            total += p.getHarga();
        }
        System.out.println("----------------------------------");
        System.out.printf("Total Belanja : Rp%.2f\n", total);
        System.out.printf("Sisa Saldo   : Rp%.2f\n", saldo);
        System.out.println("==================================\n");
    }
}
