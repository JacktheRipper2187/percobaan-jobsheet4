import java.util.Scanner;

public class HargaBayar22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int harga, jumlah,jumlahHalaman;
        double dis, total, bayar, jmlDis;
        String merkBuku;

        System.out.println("=====Selamat datang di toko wahyudi=====");

        System.out.println("Masukkan Merk Buku Anda = ");
        merkBuku = input.nextLine();
        System.out.println("Jumlah halaman buku = ");
        jumlahHalaman = input.nextInt();
        System.out.println("Masukkan berapa banyak buku yang dibeli = ");
        jumlah = input.nextInt();
        System.out.println("Masukkan harga buku anda = ");
        harga = input.nextInt();
        System.out.println("Diskon yang anda dapatkan");
        dis = input.nextInt();

        total = harga * jumlah;
        jmlDis = total * dis;
        bayar = total - jmlDis;

        System.out.println("=====Tampilkan Barang Yang Anda Beli=====");

        System.out.println("Merk buku = " + merkBuku);
        System.out.println("Jumlah halaman buku = " + jumlahHalaman);
        System.out.println("Jumlah yang anda beli = " + jumlah);
        System.out.println("Harga total sebelum diskon = " + total);
        System.out.println("Jumlah diskon yang anda dapatkan adalah = " + jmlDis);
        System.out.println("Total yang dibayar setelah diskon = " + bayar + " rupiah ");

    
    }
} 