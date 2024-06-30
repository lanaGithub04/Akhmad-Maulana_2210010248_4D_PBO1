# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data mahasiswa menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama dan NPM mahasiswa, dan memberikan output berupa informasi detail dari NPM tersebut seperti tahun masuk, fakultas, program studi, dan nomor registrasi.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Mobil`, `MobilDetail`, dan `MobilBerjalan` adalah contoh dari class.

```bash
public class Mobil {
    ...
}

public class MobilDetail extends Mobil  {
    ...
}

public class MobilBerjalan {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `Mobil mobil = new Mobil("Pajero", "V, Tipe Termahal", "Manual");` adalah contoh pembuatan object.

```bash
Mobil mobil = new Mobil("Pajero", "V, Tipe Termahal", "Manual"););
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `mobil`, `tipe`, `gear` dan `data` adalah contoh atribut.

```bash
String mobil;
String tipe;
String gear;
String data;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Mobil` dan `MobilwaDetail`.

```bash
public Mobil(String mobil, String tipe, String gear, String data) {
        this.mobil = mobil;
        this.tipe = tipe;
        this.gear = gear;
        this.data = data;
}

 public MobilDetail(String mobil, String tipe, String gear, String data) {
        super(mobil, tipe, gear, data);
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setMobil`, `setTipe`, `setGear` dan `setData` adalah contoh method mutator.

```bash
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
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getMobil`, `getTipe`, `getGear`, dan `getData`,  adalah contoh method accessor.

```bash
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
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `mobil`, `tipe`, `gear` dan `data` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
 private String mobil; // Nama mobil
    private String tipe; // Array tipe mobil (mungkin memiliki beberapa tipe)
    private String gear; // Jenis gigi (Manual atau Otomatis)
    private String data; // Data Mobil
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `MahasiswaDetail` mewarisi `Mahasiswa` dengan sintaks `extends`.

```bash
public class MobilDetail extends Mobil {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `displayInfo(String)` di `Mobil` merupakan overloading method `displayInfo` dan `displayInfo` di `MobilDetail` merupakan override dari method `displayInfo` di `Mobil`.

```bash
public String displayInfo(String merk){
        return displayInfo() + "\nMerk\t: "+merk;
    }

@Override
public String displayInfo(){
        return "Mobil\t: "+getMobil()+" \nTipe\t: "+getTipe()+" \nGear\t: "+getGear();
    }
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `getGear` dan seleksi `switch` dalam method `getTipe`.

```bash
 String gear;
            while (true) {
                System.out.print("Masukkan Gear Mobil (Manual/Automatic): ");
                gear = scanner.nextLine();
                if (gear.equalsIgnoreCase("Manual") || gear.equalsIgnoreCase("Automatic")) {
                    break; // Valid input
                } else {
                    System.out.println("Gear tidak valid. Silakan masukkan 'Manual' atau 'Automatic'.");
                }
            }

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
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
 for (int i = 0; i < mobilArray.length; i++) {
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner scanner = new Scanner(System.in);
System.out.println("Input data mobil ke-" + (i + 1));
String namaMobil = scanner.nextLine();

```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `MahasiswaDetail[] mahasiswas = new MahasiswaDetail[2];` adalah contoh penggunaan array.

```bash
MobilDetail[] mobilArray = new MobilDetail[2];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
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
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Akhmad Maulana
NPM: 2210010248
