import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        int hari = 10;
        String jawapan;

        switch (hari) {
            case 5:
                jawapan = "Hari ini adalah hari Jumaat";
                break;
            case 6:
                jawapan = "Hari ini adalah hari Sabtu";
                break;
            case 7:
                jawapan = "Hari ini adalah hari Ahad";
                break;
            default:
                jawapan = "Hari ini adalah saya pun tidak tahu";
        }

        System.out.println(jawapan);
    }
}
