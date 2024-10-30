import java.util.Scanner;

public class Tugas205 {

    public static void main(String[] args) {
        Scanner sc05 = new Scanner(System.in);
        int arrPesanan, totalBayar = 0;

        System.out.print("Masukkan jumlah pesanan: ");
        arrPesanan = sc05.nextInt();
        sc05.nextLine();

        String namaMakanan[] = new String [arrPesanan];
        int harga[] = new int [arrPesanan];
        
 
        for(int i = 0; i < arrPesanan; i++) { 
            System.out.print("Masukkan nama pesanan ke-" + (i + 1) + " : ");
            namaMakanan[i] = sc05.nextLine();
            System.out.print("Harga " + namaMakanan[i] + " : ");
            harga[i] = sc05.nextInt();
            sc05.nextLine();

            totalBayar += harga[i];
        
        }

        System.out.println("\nPesanan anda adalah sebagai berikut:");
        for(int i = 0; i < namaMakanan.length; i++){
            System.out.println(namaMakanan[i]);
        }
        System.out.println("\nTotal Bayar: " + totalBayar);
    }
}