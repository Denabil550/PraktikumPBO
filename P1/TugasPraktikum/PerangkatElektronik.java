package TugasPraktikum;

public class PerangkatElektronik {
    private String merk;
    private int tahunProduksi;

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setTahunProduksi(int tahun) {
        tahunProduksi = tahun;
    }

    public void printInfo() {
        System.out.println("Merk : " + merk);
        System.out.println("Tahun Produksi : " + tahunProduksi);
    }
}