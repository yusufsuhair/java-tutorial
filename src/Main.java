public class Main {
    public static void main(String[] args) {

        // Method dengan parameter
        perkenalkanDiri("Najib", 60, "Main facebook", "PUBG", false);
        perkenalkanDiri("Muhyiddin", 70, "Main facebook", "PUBG", false);
        perkenalkanDiri("Mahathir", 93, "Main facebook", "PUBG", false);
    }

    static void perkenalkanDiri(String nama, int umur, String hobi, String gameFeveret, boolean adakahSayaSingle) {
        System.out.println("Nama saya adalah " + nama + " dan umur saya adalah " + umur);
        System.out.println("Game feveret saya pula adalah " + gameFeveret);
        System.out.println("Hobi saya pula adalah " + hobi);
        System.out.println("Adakah saya single ke tak? " + adakahSayaSingle);
        System.out.println("\n");
    }
}
