package P9.id.ac.polinema; // Menetapkan package yang sama untuk semua kelas aplikasi.

public class Customer {
    private String name;
    private String phone;

    public Customer(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }
}