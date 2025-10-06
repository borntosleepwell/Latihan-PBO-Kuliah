class Dosen extends Pengguna implements Notifikasi {
    private String nip;

    public Dosen(String nama, String email, String nip){
        super(nama, email);
        this.nip = nip;
    }
    @Override
    public void aksesFitur(){
        System.out.println("Dosen " + nama + " menggungah materi kuliah.");
    }
    @Override
    public void kirimPesan(String pesan){
        System.out.println("Pesan untuk Dosen " + nama + ": " + pesan);
    }  
}
