public class OperasiMatematika {
    public static void main(String[] args) {

        int a = 90;
        int b = 50;

        System.out.println(a + b); // pertambahan
        System.out.println(a - b); // pergurangan
        System.out.println(a * b); // perkalian
        System.out.println(a / b); // pembagian
        System.out.println(a % b); // sisa pembagian

        String nama = "Pembatas";
        System.out.println(nama);

        // augmented Assigment atau penambahan value pada operasi matematika
        // sistem ini mentotal operasi matematika secara berurutan
        int c = 100;
        System.out.println(c += 10);
        System.out.println(c -= 10);
        System.out.println(c *= 10);
        System.out.println(c /= 10);
        System.out.println(c %= 10);

        // Unary operator atau penambahan operator pada variabel
        // penempatan operator diperbolehkan dibelakang atau didepan variabel
        // diantaranya ada 5 operator yaitu :
        // ++ untuk menambah satu angka ke variabel
        int d = 100;
        System.out.println(++d);
        // -- untuk menambah satu angka ke variabel
        System.out.println(--d);
        // - untuk mengubah variabel menjadi negatif
        System.out.println(-d);
        // + untuk mengubah variabel menjadi positif
        System.out.println(+d);
        // ! untuk menambah boolean pada variabel atau true/false akan menjadi kebalikannya
        System.out.println(!true);




    }
}
