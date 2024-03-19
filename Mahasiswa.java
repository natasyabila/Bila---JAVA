public class Mahasiswa {
    private String nama;
    private String nim;
    private String jurusan;

    public Mahasiswa(String nama, String nim, String jurusan) {
        this.nama = nama;
        setNim(nim);
        this.jurusan = jurusan;
    }

    public void setNim(String nim) {
        // Memastikan panjang nim tidak kurang dan tidak lebih dari 15 angka
        if (nim.length() == 15) {
            this.nim = nim;
        } else {
            System.out.println("Panjang NIM harus 15 angka.");
            System.exit(0); // Keluar dari program jika panjang NIM tidak sesuai
        }
    }

    public void tampilDataMahasiswa() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Jurusan: " + jurusan);
    }

    public static void tampilUniversitas() {
        System.out.println("Selamat datang di Universitas ABC");
    }
}
