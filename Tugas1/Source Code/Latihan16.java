public class Latihan16 {
    public static void main(String[] args) {
        boolean Bool1 = true, Bool2 = false, TF;
        int i = 5, j = 2, hsl;
        float x = 5, y = 5, res;

        TF = Bool1 && Bool2;
        System.out.println("TF (AND) = " + TF);
        TF = Bool1 || Bool2;
        System.out.println("TF (OR) = " + TF);
        TF = !Bool1;
        System.out.println("TF (NOT) = " + TF);

        hsl = i + j;
        System.out.println("Hasil Penjumlahan = " + hsl);
        hsl = i - j;
        System.out.println("Hasil Pengurangan = " + hsl);
        
        res = x + y;
        System.out.println("Hasil Penjumlahan Float = " + res);
        res = x - y;
        System.out.println("Hasil Pengurangan Float = " + res);
    }
}