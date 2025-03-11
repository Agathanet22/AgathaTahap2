class Perusahaan {
    private final String namaPerusahaan;

    public Perusahaan(String namaPerusahaan) {
        this.namaPerusahaan = namaPerusahaan;
    }

    public String getNamaPerusahaan() {
        return namaPerusahaan;
    }
}

class Karyawan {
    private String nama;
    private double gajiPokok;
    private Perusahaan perusahaan;

    public Karyawan(String nama, double gajiPokok, Perusahaan perusahaan) {
        setNama(nama);
        this.gajiPokok = gajiPokok;
        this.perusahaan = perusahaan;
    }

    public void setNama(String nama) {
        if (nama.length() >= 4) {
            this.nama = nama;
        } else {
            throw new IllegalArgumentException("Nama harus minimal 4 karakter.");
        }
    }

    public String getNama() {
        return nama;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public Perusahaan getPerusahaan() {
        return perusahaan;
    }

    public double hitungGaji() {
        return gajiPokok;
    }

    public void infoGaji() {
        System.out.println("Nama: " + nama);
        System.out.println("Total Gaji: Rp" + hitungGaji());
        System.out.println("------------------------");
    }
}

class Programmer extends Karyawan {
    private double bonus;

    public Programmer(String nama, double gajiPokok, double bonus, Perusahaan perusahaan) {
        super(nama, gajiPokok, perusahaan);
        this.bonus = bonus;
    }

    public double hitungGaji() {
        return getGajiPokok() + bonus;
    }
}

class Manager extends Karyawan {
    private double insentif;
    private String divisi;

    public Manager(String nama, double gajiPokok, double insentif, String divisi, Perusahaan perusahaan) {
        super(nama, gajiPokok, perusahaan);
        this.insentif = insentif;
        this.divisi = divisi;
    }

    public double hitungGaji() {
        return getGajiPokok() + insentif;
    }

    public void infoDivisi() {
        System.out.println("Divisi: " + divisi);
    }
}

public class Main {
    public static void main(String[] args) {
        Perusahaan ptInovasi = new Perusahaan("PT. Inovasi Teknologi");

        Karyawan karyawan1 = new Karyawan("Andi", 5000000, ptInovasi);
        Programmer programmer1 = new Programmer("Budi", 6000000, 2000000, ptInovasi);
        Manager manager1 = new Manager("Citra", 8000000, 3000000, "IT", ptInovasi);

        karyawan1.infoGaji();
        programmer1.infoGaji();
        manager1.infoGaji();
        manager1.infoDivisi();
    }
}
