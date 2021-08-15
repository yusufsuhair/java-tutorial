public class Main {
    public static void main(String[] args) {

        // Method Overloading
        System.out.println(perkenalkanDiri("Amin", 10)); // Integer);
        System.out.println(perkenalkanDiri("Asyraf", 10.0)); // Double);
        System.out.println(perkenalkanDiri("Aziz", 9.0f)); // Float);
    }

    static int tambah(int a, int b) {
        return a + b;
    }

    static int tambah(int a, double b) {
        return (int) (a + b);
    }

    static String perkenalkanDiri(String nama, int umur) {
        return "Nama saya adalah " + nama + " dan umur saya adalah " + umur;
    }

    static String perkenalkanDiri(String nama, double umur) {
        return "Nama saya adalah " + nama + " dan umur saya adalah " + umur;
    }

    static String perkenalkanDiri(String nama, float umur) {
        return "Nama saya adalah " + nama + " dan umur saya adalah " + umur;
    }
}
