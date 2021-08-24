public class Main {
    public static void main(String[] args) {
        // Object-Oriented Programming (OOP)
        Anjing anjing = new Anjing();
        Babi babi = new Babi();

        System.out.println(anjing.suara());
        System.out.println(babi.suara());

        anjing.nama = "Hachiko";
        anjing.umur = 2;

        babi.nama = "Piglet";
        babi.umur = 10;

        System.out.println("Nama anjing adalah = " + anjing.nama);
        System.out.println("Umur babi sekarng adalah = " + babi.umur + " tahun");
    }
}

class Anjing {
    String nama;
    int umur;

    String suara() {
        return "Woof";
    }
}

class Babi {
    String nama;
    int umur;

    String suara() {
        return "Oink";
    }
}