package KdvHesapla;

import java.util.Scanner;

public class Kdv {
    public static void main(String[] args) {
        float kdv = 0.18f;
        float para;

        System.out.println("Para tutari giriniz:");
        Scanner inp = new Scanner(System.in);
        para = inp.nextFloat();

        float kdvliPara = para + para * kdv ;

        System.out.println("Kdvsiz para tutari " + para);
        System.out.println("Kdv Tutari " + kdv);
        System.out.println("Kdvli para tutari " + kdvliPara);


    }
}
