package TugasPraktikum;

public class PerangkatDemo {
    public static void main(String[] args) {

        PerangkatElektronik perangkat = new PerangkatElektronik();
        Laptop laptop = new Laptop();
        LaptopGaming laptopGaming = new LaptopGaming();
        Smartphone smartphone = new Smartphone();

        perangkat.setMerk("Sony");
        perangkat.setTahunProduksi(2022);
        perangkat.printInfo();

        System.out.println();

        laptop.setMerk("ASUS");
        laptop.setTahunProduksi(2023);
        laptop.setRam(16);
        laptop.setProcessor("Intel Core i7");
        laptop.printInfo();

        System.out.println();

        laptopGaming.setMerk("Lenovo");
        laptopGaming.setTahunProduksi(2024);
        laptopGaming.setRam(32);
        laptopGaming.setProcessor("Intel Core i9");
        laptopGaming.setGpu("RTX 4060");
        laptopGaming.setRefreshRate(165);
        laptopGaming.printInfo();

        System.out.println();

        smartphone.setMerk("Samsung");
        smartphone.setTahunProduksi(2024);
        smartphone.setKapasitasBaterai(5000);
        smartphone.setSistemOperasi("Android");
        smartphone.printInfo();
    }
}