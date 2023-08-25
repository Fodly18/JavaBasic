public class OperasiBoolean {
    public static void main(String[] args) {

        // ini adalah program sederhana yang memilah nilai
        var absen = 80;
        var uts = 90;

        boolean minimalabsen = absen >= 80;
        boolean minimaluts = uts >= 80;

        var kelulusan = minimalabsen && minimaluts;
        System.out.println(kelulusan);

    }
}
