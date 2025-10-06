public class Main {
    public static void main(String[] args) {

        // Mahasiswa, Dosen, dan Admin semuanya mewarisi class Pengguna, yang mana objek objek ini otomatis memiliki atribut dan method dari class Pengguna
        Mahasiswa mhs1 = new Mahasiswa("Aqsha", "aqsha@student.com", "230511000");
        Dosen dosen1 = new Dosen("Pak Budi", "budi@kampus.ac.id", "19876543");
        Admin admin1 = new Admin("Bu Sari", "sari@kampus.ac.id", "Super Admin");

        // Array dibawah ini adalah contoh polymorphism, dimana array bertipe Pengguna bisa menampung objek dari berbagai subclassnya (Mahasiswa, Dosen, Admin)
        Pengguna[] daftarPengguna = new Pengguna[3];
        daftarPengguna[0] = mhs1;
        daftarPengguna[1] = dosen1;
        daftarPengguna[2] = admin1;

        System.out.println("=== Daftar Pengguna Sistem Akademik ===\n");

        for (int i = 0; i < daftarPengguna.length; i++) {
            Pengguna p = daftarPengguna[i];
            p.login();           
            p.aksesFitur(); // memanggil abstract method yang di override di subclass, agar abstract method bisa digunakan.

            if (p instanceof Notifikasi) {
                ((Notifikasi)p).kirimPesan("Selamat datang di sistem akademik!"); // Penggunaan interface Notifikasi untuk mengirim pesan ke semua jenis pengguna
            }

            System.out.println("-----------------------------------\n");
        }

        // Array di bawah ini adalah array khusus untuk Mahasiswa
        Mahasiswa[] daftarMahasiswa = {
            new Mahasiswa("Rafi", "rafi@student.com", "230511001"),
            new Mahasiswa("Surya", "surya@student.com", "230511002"),
            new Mahasiswa("Luna", "luna@student.com", "230511003")
        };

        System.out.println("=== Daftar Mahasiswa ===");
        for (Mahasiswa m : daftarMahasiswa) {
            m.login();
            m.aksesFitur();
            m.kirimPesan("Sudah isi KRS belum?");
            System.out.println();
        }
    }
}
