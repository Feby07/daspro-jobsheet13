import java.util.Scanner;

public class MarianaCafe07 {
    static String [] menu = {"Kopi", "Teh", "Es Degan", "Roti Bakar", "Gorengan"};
    static int[][]  penjualan = new int[5][7];

    public static void inputDataPenjualan() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Data Penjualan");
        
        for (int i = 0; i < menu.length; i++) {
            System.out.println("Masukkan data penjualan untuk menu: " + menu[i]);
            for (int j = 0; j < 7; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                penjualan[i][j] = sc.nextInt();
            }
            System.out.println();
        }
    }
    public static void dataPenjualan() {
        System.out.println("Data Penjualan");
        for (int i = 0; i < menu.length; i++) {
            System.out.print(menu[i] + ": ");
            for (int j = 0; j < penjualan[i].length; j++) {
                System.out.print(penjualan[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void menuPenjualanTertinggi() {
        System.out.println("Menu dengan Penjualan Tertinggi");
        String menuTerlaris = "";
        int penjualanTertinggi = 0;

        for (int i = 0; i < menu.length; i++) {
            int total = 0;
            for (int j = 0; j < penjualan[i].length; j++) {
                total += penjualan[i][j];
            }
            if (total > penjualanTertinggi) {
                penjualanTertinggi = total;
                menuTerlaris = menu[i];
            }
        }
        System.out.println("Menu terlaris adalah " + menuTerlaris + " dengan total penjualan " + penjualanTertinggi);
    }
    public static void rataRataPenjualan() {
        System.out.println("Rata-rata Penjualan");
        for (int i = 0; i < menu.length; i++) {
            int total = 0;
            for (int j = 0; j < penjualan[i].length; j++) {
                total += penjualan[i][j];
            }
            double rataRata = (double) total / penjualan[i].length;
            System.out.printf("%s: %.2f\n", menu[i], rataRata);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah menu: ");
        int jumlahMenu = sc.nextInt();
        System.out.print("Masukkan jumlah hari: ");
        int jumlahHari = sc.nextInt();

        inputDataPenjualan();

        dataPenjualan();

        menuPenjualanTertinggi();

        rataRataPenjualan();

    }
}