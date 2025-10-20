import java.util.Scanner;

public class SayininKaresiniKupunuHesaplama {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz: ");
        int sayi=oku.nextInt();
        int karesi=sayi*sayi;
        int küpü=sayi*sayi*sayi;
        System.out.println("Sayının Karesi: "+karesi);
        System.out.println("Sayının Küpü: "+küpü);
    }
}
