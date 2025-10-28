import java.util.Scanner;

public class tugas {
 public static void main(String[] args) {
        Scanner newScanner = new Scanner(System.in);

        System.out.println();

        double luas;
        double tinggi;
        double alas;
        double keliling;
        double sisi;
        
        
        
        System.out.print("masukkan luas : ");
        luas = newScanner.nextDouble();
        System.out.print("masukkan tinggi : ");
        tinggi = newScanner.nextDouble();
        System.out.print("masukkan alas : ");
        alas = newScanner.nextDouble();
        System.out.print("masukkan sisi : ");
        sisi = newScanner.nextDouble();
        System.out.print("masukkan sisi : ");
        sisi = newScanner.nextDouble();
        System.out.print("masukkan sisi : ");
        sisi = newScanner.nextDouble();

        
        System.out.println(luas = 1/2 * alas * tinggi );
        System.out.println(keliling =  sisi + sisi + sisi);

        System.out.println("Luas = " + luas);
        System.out.println("keliling = " + keliling);
       
        

        newScanner.close();
 }
    
}
