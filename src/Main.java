import java.util.Locale;

public class Main {
    public static void main(String[] args) {
       String nama = "Kim Jisoo";

       // length(). Untuk mendapatkan panjang/ukuran oleh sebuah String.
        System.out.println("Panjang nama adalah: " + nama.length());

        // toUpperCase().
        System.out.println("Nama jika kita buatkan dia kapital adalah: " + nama.toUpperCase());

        // toLowerCase().
        System.out.println("Nama jika kita buatkan dia tidak kapital adalah: " + nama.toLowerCase());

        // indexOf(). Untuk mencari kedudukan/posisi oleh teks yang dinyatakan.
        System.out.println("Position Jisoo adalah pada yang ke-" + nama.indexOf("Jisoo"));

        // concat(). Untuk menggabungkan antara banyak-banyak String.
        String a = "Mr.";
        String b = "Bean";
        System.out.println("Gabungan antara a dan b adalah: " + a + b);
        System.out.println("Gabungan antara a dan b menggunakan concat() adalah: " + a.concat(b));

        // Special characters.
        String c = "Amir telah cakap \"Hi\".";
        System.out.println(c);
    }
}
