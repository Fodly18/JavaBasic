public class TipeVariabel {
    public static void main(String[] args) {

        String nama;
        nama = "eki";

        int age = 19;

        String address = "Banyuwangi";

        System.out.println(nama);
        System.out.println(age);
        System.out.println(address);

        // menggunakan var ( lebih disarankan karena tidak perlu menulis tipe data
        // java mampu mendeteksi tipe data secara otomatis
        var nama1 = "eki";
        var age1 = 19;
        var address1 = "Banyuwangi";

        System.out.println(nama1);
        System.out.println(age1);
        System.out.println(address1);

        // kita juga bisa mengubah value tipe data
        nama = "eki2";
        System.out.println(nama);

        // kita juga bisa mengatur tipe data agar tidak bisa diubah value nya dengan final
        final String mouse = "cepat";
        System.out.println(mouse);

        // menggunakan var dan final
        final var jumlahsemut = 1000;
        System.out.println(jumlahsemut);

        // mouse = "lambat";
        // System.out.println(mouse);



    }
}
