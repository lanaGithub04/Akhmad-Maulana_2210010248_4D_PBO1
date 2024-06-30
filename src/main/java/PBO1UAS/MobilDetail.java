package PBO1UAS;
//inheritance
public class MobilDetail extends Mobil {
    public MobilDetail(String mobil, String tipe, String gear, String data) {
        super(mobil, tipe, gear, data);
    }

    // Metode untuk mendapatkan tahun pembuatan dari data
    public int getTahunPembuatan() {
        String[] parts = getData().split("/");
        return Integer.parseInt(parts[0]);
    }

    // Metode untuk mendapatkan CC dari data
    public int getCC() {
        String[] parts = getData().split("/");
        return Integer.parseInt(parts[1]);
    }

    // Metode untuk mendapatkan kode daerah dari data
    public String getKodeDaerah() {
        String[] parts = getData().split("/");
        return parts[2];
    }

    // Metode untuk mendapatkan deskripsi tipe
    @Override
    public String getTipe() {
        String tipe = super.getTipe();
        switch (tipe.toUpperCase()) {
            case "J":
                return "J (Termurah)";
            case "E":
                return "E (Menengah)";
            case "V":
                return "V (Menengah Atas)";
            case "G":
                return "G (Termewah)";
            default:
                throw new IllegalArgumentException("Kesalahan dalam pengetikkan tipe: " + tipe);
        }
    }

     public void displayDetails() {
        try {
            System.out.println("Mobil: " + getMobil());
            System.out.println("Tipe: " + getTipe());
            System.out.println("Gear: " + getGear());
            System.out.println("Tahun Pembuatan: " + getTahunPembuatan());
            System.out.println("CC: " + getCC());
            System.out.println("Kode Daerah: " + getKodeDaerah());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
