package staffmember;

public class Commission extends Hourly {
    private double totalSales; // total penjualan karyawan
    private final double commissionRate; // persentase komisi

    // Konstruktor dengan parameter tambahan untuk komisi
    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double hourlyRate, double commissionRate) {
        super(eName, eAddress, ePhone, socSecNumber, hourlyRate); // memanggil konstruktor kelas Hourly
        this.totalSales = 0; // awalnya total penjualan adalah 0
        this.commissionRate = commissionRate; // menetapkan persentase komisi
    }

    // Menambahkan penjualan
    public void addSales(double sales) {
        totalSales += sales; // menambahkan penjualan ke total penjualan
    }

    // Override metode pay
    @Override
    public double pay() {
        // Menghitung gaji berdasarkan jam kerja ditambah komisi dari penjualan
        double payment = super.pay() + (totalSales * commissionRate);
        totalSales = 0; // Reset total penjualan setelah pembayaran
        return payment;
    }

    // Override metode toString
    @Override
    public String toString() {
        String result = super.toString();
        result += "\nTotal Sales: $" + totalSales;
        return result;
    }
}
