import java.util.Scanner;

public class OrtalamaHesaplama {
    public static void main(String[] args) {
        Scanner oku= new Scanner(System.in);
        System.out.println("1. Notunuzu Giriniz: ");
        double not1= oku.nextDouble();
        System.out.println("2. Notunuzu Giriniz: ");
        double not2= oku.nextDouble();
        double ortalama=(not1+not2)/2;

        if (ortalama>=50){
            System.out.println("Tebrikler Geçtiniz:) ");
        }
        else {
            System.out.println("Malesef Kaldınız:( ");
        }
    }
}
