public class Kafe07Modifikasi2 {
    public static void Menu(String namaPelangan, boolean isMember, String kodePromo) {
        System.out.println("Selamat datang, " + "!");

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }
        
        if (kodePromo.equals("DISKON50")) {
            System.out.println("Kode promo " + kodePromo + " berhasil, Anda mendapat diskon sebesar 50%");
        } else if (kodePromo.equals("DISKOM30%")) {
            System.out.println("Kode promo " + kodePromo + " Berhasil, Anda mendapat diskon seesar 30%");
        } else {
            System.out.println("Kode promo" + kodePromo + " tidak valid");
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
        Menu("Andi", true, "DISKON50");
        System.out.println();
        Menu("Budi", false, "DISKON30");
        System.out.println();
        Menu("Citra". true, "INVALID");
    }
}

