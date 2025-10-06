public class Admin extends Pengguna implements Notifikasi {
    private String role;

    public Admin(String nama, String email, String role){
        super(nama, email);
        this.role = role;
    }
    @Override
    public void aksesFitur(){
        System.out.println("Admin " + nama + " mengelola sistem.");
    }
    @Override
    public void kirimPesan(String pesan){
        System.out.println("Pesan untuk Admin " + nama + ": " + pesan);
    }
}

// Setiap kali ada proses @override, itu artinya method di subclass (Mahasiswa, Dosen, Admin) menggantikan method di superclass (Pengguna).
