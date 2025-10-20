import java.util.Scanner;

public class TlEuroCevirme {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.println("TL Giriniz: ");
        double tl = oku.nextDouble();
        double euro = tl / 48;
        System.out.println("Euro = " + euro);
    }
}
