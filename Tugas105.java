import java.util.Scanner;

public class Tugas105 {

    public static void main(String[] args) {
        Scanner sc05 = new Scanner(System.in);
        int jumlahMhs;
        int nilaiTinggi = 0, nilaiRendah = 100;
        double rata2, total = 0;

        System.out.print("Masukkan jumlah mahasiswa: ");
        jumlahMhs = sc05.nextInt();
        int nilaiMhs[] = new int[jumlahMhs];

        for(int i = 0; i < nilaiMhs.length; i++){
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " : ");
            nilaiMhs[i] = sc05.nextInt();
            if (nilaiMhs[i] > nilaiTinggi){
                nilaiTinggi = nilaiMhs[i];
            }else if(nilaiMhs[i] < nilaiRendah){
                nilaiRendah = nilaiMhs[i];
            }
        }
        for(int i = 0; i < nilaiMhs.length; i++){
            total += nilaiMhs[i];
        }

        System.out.println();
        for(int i = 0; i < nilaiMhs.length; i++){
            System.out.println("Nilai Mahasiswa ke-" + i + " adalah = " + nilaiMhs[i]);
        }
        System.out.println();


        rata2 = total/nilaiMhs.length;
        System.out.println("Rata-rata nilai = " + rata2);

        System.out.println("Nilai tertinggi = " + nilaiTinggi);
        System.out.println("Nilai terendah = " + nilaiRendah);
    

    }
}