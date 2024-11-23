import java.util.Scanner;

public class Kafe07Modifikasi3 {
    public static void Menu(String namaPelanggan, boolean isMember) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }

        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("============================");
        System.out.println("Silahkan pilih menu yang Anda inginkan.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu("Andi", true);

        int totalHargaKeseluruhan = 0;

        System.out.print("Masukkan jumlah jenis menu yang ingin Anda pesan: ");
        int jumlahMenu = sc.nextInt();

        for (int i = 0; i < jumlahMenu; i++) {
            System.out.print("\nMasukkan nomor menu yang ingin Anda pesan: ");
            int pilihanMenu = sc.nextInt();
            System.out.print("Masukkan jumlah item yang ingin dipesan: ");
            int banyakItem = sc.nextInt();

            System.out.print("Masukkan kode promo (jika ada): ");
            String kodePromo = sc.next();

            int totalHarga = hitungTotalHarga(pilihanMenu, banyakItem, kodePromo);
            totalHargaKeseluruhan += totalHarga;

            System.out.println("Total harga untuk pesanan menu " + pilihanMenu + ": Rp" + totalHarga);
        }

        System.out.println("\nTotal keseluruhan pesanan Anda: Rp" + totalHargaKeseluruhan);
    }

    public static int hitungTotalHarga(int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaItem = {15000, 20000, 22000, 12000, 10000, 18000};

        int hargaTotal = hargaItem[pilihanMenu - 1] * banyakItem;

        if (kodePromo.equals("DISKON50")) {
            hargaTotal -= hargaTotal / 2;  
        } else if (kodePromo.equals("DISKON30")) {
            hargaTotal -= hargaTotal * 30 / 100;  
        } else if (!kodePromo.equals("")) {
            System.out.println("Kode promo invalid");
        }

        return hargaTotal;
    }
}
