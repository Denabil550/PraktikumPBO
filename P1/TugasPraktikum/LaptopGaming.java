package TugasPraktikum;

public class LaptopGaming extends Laptop {
    private String gpu;
    private int refreshRate;

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public void setRefreshRate(int refreshRate) {
        this.refreshRate = refreshRate;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("GPU : " + gpu);
        System.out.println("Refresh Rate : " + refreshRate + " Hz");
    }
}