import java.util.Arrays;

public class TipeArray {
    public static void main(String[] args) {

        String[] stringsArray = new String[4];
        stringsArray[0] = " pepew";
        stringsArray[1] = " alo";
        stringsArray[2] = " mouse";
        stringsArray[3] = " ehe";
        System.out.println(stringsArray[0]);
        System.out.println(stringsArray[1]);
        System.out.println(stringsArray[2]);
        System.out.println(stringsArray[3]);

        //bentuk array yang lain lebih simple
        long[] inilong = {31,23,34,45};
        System.out.println(inilong[0]);

        // untuk mengubah value array
        inilong[0] = 67;
        // untuk mengetahui value array
        System.out.println(inilong[0]);
        // untuk menggetahui panjang array
        System.out.println(inilong.length);

        //membuat array didalam array

        long[][] jumlah = {
                {22,33},
                {55,44},
                {99,88}
        };
        System.out.println(jumlah[0][1]);
        System.out.println(jumlah[1][1]);
        System.out.println(jumlah[2][1]);

    }
}
