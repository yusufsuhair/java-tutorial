import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String jawapan;
        int umur = 10;

        if (umur == 10) {
             jawapan = "Awak adalah sepuluh tahun";
        } else if (umur == 12) {
            jawapan = "Awak adalah dua belas tahun";
        } else if (umur == 14) {
            jawapan = "Awak adalah empat belas tahun";
        } else {
            jawapan = "Saya tidak tahu umur awak";
        }

        System.out.println(jawapan);

        // Ternary
        jawapan = 5 < 3 ? "Betul, lima adalah lebih daripada tiga" : "Salah, lima adalah lebih daripada tiga";
        System.out.println("Jawapan daripada Ternary: " + jawapan);
    }
}
