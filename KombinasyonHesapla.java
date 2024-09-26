import java.util.Scanner;

public class KombinasyonHesapla {

    // Faktöriyel hesaplayan metot
    public static long faktoriyel(int n) {
        long sonuc = 1;
        for (int i = 1; i <= n; i++) {
            sonuc *= i;
        }
        return sonuc;
    }

    // Kombinasyonu hesaplayan metot
    public static long kombinasyon(int n, int r) {
        if (r > n) {
            return 0; // r, n'den büyük olamaz
        }
        return faktoriyel(n) / (faktoriyel(r) * faktoriyel(n - r));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("n değerini girin: ");
        int n = scanner.nextInt();
        
        System.out.print("r değerini girin: ");
        int r = scanner.nextInt();
        
        long sonuc = kombinasyon(n, r);
        
        System.out.println("C(" + n + ", " + r + ") = " + sonuc);
        
        scanner.close();
    }
}
