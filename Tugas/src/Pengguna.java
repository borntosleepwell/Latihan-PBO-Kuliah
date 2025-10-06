interface Notifikasi{
    void kirimPesan(String pesan);
}
// Interface adalah kontrak yang mengharuskan class yang mengimplementasikan interface tersebut untuk menyediakan implementasi dari method-method yang didefinisikan dalam interface.
// Interface Notifikasi dipakai agar semua class (Mahasiswa, Dosen, Admin) punya kewajiban mengimplementasikan method kirimPesan().


public abstract class Pengguna{
    protected String nama;
    protected String email;

    public Pengguna (String nama, String email){
        this.nama = nama;
        this.email = email;
    }
    public void login(){
        System.out.println(nama + " Selamat anda berhasil login dengan email" + email);
    }
    public abstract void aksesFitur();
}

// Abstract class artinya class ini tidak bisa diinstansiasi secara langsung, tapi bisa dijadikan superclass
// Karena pengguna adalah abstract maka kita tidak bisa membuat objek langsung dari class Pengguna, tapi kita bisa membuat referensi bertipe Pengguna yang mengacu pada objek dari subclassnya (Mahasiswa, Dosen, Admin)
