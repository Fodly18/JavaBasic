public class TipeDataBukanPrimitive {
    public static void main(String[] args) {

        Integer iniinterger = 100;
        Long inilong = 10000l;

        // null / 0 digunakana untuk mengosong kan value data bukan primitive
        // sedangkan data primitive memiliki default 0
        Byte inibyte = null;
        System.out.println(inibyte);

        // ini default data primitive
        byte inibyte2 = 0;
        System.out.println(inibyte2);

        //ini cara untuk merubah tipe data primitive ke non primitive
        int iniint2 = 120;
        Integer iniinteger2 = iniint2;
        System.out.println(iniinteger2);

        int age = 20;
        Integer age2 = age;
        int age3 = age2;

        // merubah tipe data beda jenis menggunakan . (titik)
        long angka = age2.longValue();
        String String1 = age2.toString();
        System.out.println(String1);








    }
}
