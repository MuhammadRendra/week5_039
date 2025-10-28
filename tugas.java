import java.util.Scanner;

public class tugas {
 public static void main(String[] args) {
        Scanner newScanner = new Scanner(System.in);

        System.out.println();

        String luas;
        String tinggi;
        String alas;
        String keliling;
        String nilaiA;
        String nilaiB;
        String nilaiC;
        
        
        System.out.print("masukkan luas : ");
        luas = newScanner.nextLine();
        System.out.print("masukkan tinggi : ");
        tinggi = newScanner.nextLine();
        System.out.print("masukkan alas : ");
        alas = newScanner.nextLine();
        System.out.print("masukkan nilai A : ");
        alas = newScanner.nextLine();
        System.out.print("masukkan nilai B : ");
        alas = newScanner.nextLine();
        System.out.print("masukkan nilai C : ");
        alas = newScanner.nextLine();

        System.out.println(luas = "1/2" * alas * tinggi );
        System.out.println(keliling =  nilaiA + nilaiB + nilaiC);

        System.out.println("Luas = " + luas);
        System.out.println("keliling = " + keliling);
       
        

        newScanner.close();
 }
    
}
