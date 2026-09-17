package TugasPraktikum;

public class Smartphone extends PerangkatElektronik {
    private int kapasitasBaterai;
    private String sistemOperasi;

    public void setKapasitasBaterai(int kapasitas) {
        kapasitasBaterai = kapasitas;
    }

    public void setSistemOperasi(String sistemOperasi) {
        this.sistemOperasi = sistemOperasi;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Baterai : " + kapasitasBaterai + " mAh");
        System.out.println("Sistem Operasi : " + sistemOperasi);
    }
}