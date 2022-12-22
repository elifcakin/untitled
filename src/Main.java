import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce ,tarih, muzik;

        Scanner input = new Scanner(System.in);

        System.out.println("mat:");
        mat = input.nextInt();

        System.out.println("fizik:");
        fizik = input.nextInt();

        System.out.println("kimya:");
        kimya = input.nextInt();

        System.out.println("turkce:");
        turkce = input.nextInt();

        System.out.println("tarih:");
        tarih = input.nextInt();

        System.out.println("muzik:");
        muzik = input.nextInt();

        int toplam = (mat + fizik+kimya+turkce+tarih+muzik);
        double sonuc = toplam/6.0;
        System.out.println("ortalama: " + sonuc);

        if (sonuc >60) {
            System.out.println("sınıfı geçti");
        }else{
            System.out.println("sınıfta kaldı");
        }

    }

}