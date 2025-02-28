import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Latihan5 {
    public static void main(String[] args) throws IOException {
        char cc;
        int bil;
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Baca 1 karakter : ");
        cc = dataIn.readLine().charAt(0);
        System.out.print("Baca 1 bilangan : ");
        bil = Integer.parseInt(dataIn.readLine());
        System.out.println(cc + "\n" + bil + "\nBye");
    }
}

