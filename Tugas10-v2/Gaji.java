public class Gaji extends Pegawai {

    private double salary; // gaji Tahunan
    String Kelas = "Ini dari kelas Gaji";

    public Gaji(String name, String address, int number, double salary) {
        super(name, address, number);
        setSalary(salary);
    }

    @Override // Polymorphisme
    public void mailCheck() {
        System.out.println("Memeriksa kelas gaji dalam surat ");
        System.out.println("Surat tertuju untuk " + getName() + " dengan gaji " + salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double newSalary) {
        if (newSalary >= 0.0) {
            salary = newSalary;
        }
    }

    public double computePay() {
        System.out.println("mnghitung pembayaran gaji untuk " + getName());
        return salary / 52;
    }
}