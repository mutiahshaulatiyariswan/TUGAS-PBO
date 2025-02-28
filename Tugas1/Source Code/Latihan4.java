import java.util.Scanner;
public class Latihan4 {
    public static void main(String[] args) {
        int a;
        Scanner masukan = new Scanner(System.in);
        System.out.print("Masukkan nilai integer: ");
        a = masukan.nextInt();
        System.out.println("Nilai yang dibaca : " + a);
        masukan.close(); // Tambahkan close untuk menghindari memory leak
    }
}
