public class Main {
    public static void main(String[] args) {
        // Arithmetic operators
        int x = 5;
        int y = 10;
        int z = y - x; // Output: 5

        // Assignment operators
        int a = 10;
        a += 5; // Output: 15

        // Comparison operators
        boolean adakahLimaLebihDaripadaDua = 5 > 2; // Output: true
        boolean adakahLimaSamaDenganLima = 5 == 5; // Output: true
        boolean adakahLimaKurangDaripadaDua = 5 < 2; // Output: false

        // Logical operators
        // AND (&&)
        boolean adakahSepuluhLebihDaripadaTigaDanLimaKurangDaripadaTiga = (10 > 3) && (5 < 3); // Output: False
        boolean adakahSepuluhLebihDaripadaTigaDanLimaLebihDaripadaTiga = (10 > 3) && (5 > 3); // Output: True

        // OR (||)
        boolean adakahSepuluhLebihDaripadaTigaAtauLimaKurangDaripadaTiga = (10 > 3) || (5 < 3); // Output: True
    }
}
