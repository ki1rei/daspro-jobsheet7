
import java.util.Scanner;

public class KafeDoWhile14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int kopi,teh,roti, totalHarga;
        int hargaKopi = 12000, hargaTeh = 7000, hargaRoti = 20000;
        String namaPelanggan;

        do { 
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar) : ");
            namaPelanggan = sc.nextLine();

            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan");
                break;
            }

            System.out.print("Jumlah Kopi : ");
            kopi = sc.nextInt();
            System.out.print("Jumlah Teh : ");
            teh = sc.nextInt();
            System.out.print("Jumlah Roti : ");
            roti = sc.nextInt();

            totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);

            System.out.println("Total harga pembelian atas nama " + namaPelanggan + " adalah Rp " + totalHarga);

            sc.nextLine();

        } while (true);
        
        System.out.println("Semua Transaksi selesai");
    }
}
