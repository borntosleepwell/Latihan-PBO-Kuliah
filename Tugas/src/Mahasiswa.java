public class Mahasiswa extends Pengguna implements Notifikasi  {
    private String nim;

    public Mahasiswa(String nama, String email, String nim){
        super(nama, email);
        this.nim = nim;
    }
    @Override
    public void aksesFitur(){
        System.out.println("Mahasiswa " + nama + " mengakses materi kuliah");
    }
    @Override
    public void kirimPesan(String pesan){
        System.out.println("Pesan untuk Mahasiswa " + nama + ": " + pesan);
    }
}
