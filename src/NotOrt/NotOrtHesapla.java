package NotOrt;

import java.util.Scanner;

public class NotOrtHesapla {
    public static void main(String[] args) {
        int matematikNot, fizikNot, kimyaNot, turkceNot, tarihNot, muzikNot;

        Scanner giris = new Scanner(System.in);

        System.out.println("Matematik notunuzu giriniz:");
        matematikNot = giris.nextInt();
        System.out.println("Fizik notunuzu giriniz:");
        fizikNot = giris.nextInt();
        System.out.println("Kimya notunuzu giriniz:");
        kimyaNot = giris.nextInt();
        System.out.println("Turkce notunuzu giriniz:");
        turkceNot = giris.nextInt();
        System.out.println("Tarih notunuzu giriniz:");
        tarihNot = giris.nextInt();
        System.out.println("Muzikl notunuzu giriniz:");
        muzikNot = giris.nextInt();

        double ort = (matematikNot + fizikNot + kimyaNot + turkceNot + tarihNot + muzikNot) / 6;

        String str = ort >= 60 ? "Basarili" : "Basarisiz";

        System.out.println(str);



    }
}
