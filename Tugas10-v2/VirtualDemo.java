public class VirtualDemo {
    public static void main(String[] args) {
        Gaji tes1 = new Gaji("Agif", "Pauh", 9, 999999);
        Pegawai tesPoly = new Gaji("Raihan", "Jawa Pusat", 8, 888888);
        Pegawai tes2 = new Pegawai("Alghifari", "Sumatra Timur", 7);

        System.out.println("Memanggil mailCheck Berdasarkan Referensi Gaji");
        tes1.mailCheck();
        System.out.println(tes1.Kelas);

        System.out.println("\n_____________________________________________\n");

        System.out.println("\nMemanggil mailCheck Berdasarkan Referensi Pegawai");
        tesPoly.mailCheck();
        System.out.println(tesPoly.Kelas);

        System.out.println("\n_____________________________________________\n");

        System.out.println("\nMemanggil mailCheck Berdasarkan Referensi Pegawai");
        tes2.mailCheck();
        System.out.println(tes2.Kelas);
    }
}