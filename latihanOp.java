import java.util.Scanner;

public class latihanOp {
    public static void main(String[] args) {
        Scanner lp = new Scanner(System.in);

        int nilaiMtk;
        int nilaiInggris;
        int nilaiFisika;

        System.out.println("masukkan nilai mtk= ");
        nilaiMtk = lp.nextInt();
        System.out.println("masukkan nilai inggris= ");
        nilaiInggris = lp.nextInt();
        System.out.println("masukkan nilai fisika= ");
        nilaiFisika = lp.nextInt();

        if (nilaiMtk == 75 && nilaiInggris!= 75) {
            System.out.println("Lulus");
        }else{
            System.out.println("Tidak Lulus Lulus");
        }

        if (nilaiInggris > 90 || nilaiFisika > 75) {
            System.out.println("Anda Pintar");
        }else{
            System.out.println("Anda Kurang Belajar");
        }

        lp.close();
    }
}
