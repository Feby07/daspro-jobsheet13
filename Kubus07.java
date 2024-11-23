import java.util.Scanner;

public class Kubus07 {
    static int hitungVolume (int sisi) {
        int volume = sisi*sisi*sisi;
        return volume;
    }
    static int hitungLuasPermukaan (int sisi) {
        int luasPermukaan = 6*sisi*sisi;
        return luasPermukaan;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s, vol, LP;
        System.out.println("Masukkan sisi");
        s=sc.nextInt();

        vol=hitungVolume(s);
        System.out.println("Volume kubus adalah " + vol);
        LP=hitungLuasPermukaan(s);
        System.out.println("Luas Permukaan kuus adalah " + LP);
    }
}
