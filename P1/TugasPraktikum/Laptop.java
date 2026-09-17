package TugasPraktikum;

public class Laptop extends PerangkatElektronik {
    private int ram;
    private String processor;

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("RAM : " + ram + " GB");
        System.out.println("Processor : " + processor);
    }
}