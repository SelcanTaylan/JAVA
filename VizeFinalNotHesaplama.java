import java.util.Scanner;

public class VizeFinalNotHesaplama {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.println("Vize Notunu Giriniz: ");
        double vizeNot=oku.nextDouble();
        System.out.println("Final Notunu Giriniz: ");
        double finalNot=oku.nextDouble();
        double ortalama=vizeNot * 0.4 + finalNot * 0.6;
        System.out.println("Geçme Notunuz: "+ortalama);

    }
}
