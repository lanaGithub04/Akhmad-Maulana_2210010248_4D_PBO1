package PBO1UAS;
public class Mobil {
    // Atribut dengan enkapsulasi
    private String mobil; // Nama mobil
    private String tipe; // Array tipe mobil (mungkin memiliki beberapa tipe)
    private String gear; // Jenis gigi (Manual atau Otomatis)
    private String data;
    
    //construktor
    public Mobil(String mobil, String tipe, String gear, String data) {
        this.mobil = mobil;
        this.tipe = tipe;
        this.gear = gear;
        this.data = data;
    }
    
    //Motator(Setter)
    public void setMobil(String mobil) {
        this.mobil = mobil;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public void setGear(String gear) {
        this.gear = gear;
    }
    
     public void setData(String data) {
        this.data = data;
    }

    //accesor(Getter)
    public String getMobil() {
        return mobil;
    }

    public String getTipe() {
        return tipe;
    }

    public String getGear() {
        return gear;
    }
    
     public String getData() {
        return data;
    }
    
    public String displayInfo(){
        return "Mobil\t: "+getMobil()+" \nTipe\t: "+getTipe()+" \nGear\t: "+getGear();
    }
    
    //polymorphism (Overloading)
    public String displayInfo(String merk){
        return displayInfo() + "\nMerk\t: "+merk;
    }
}
