import java.util.Scanner;

public class FahrenheitCelsiusaCevirme {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.println("Fahrenheit Değerini Giriniz: ");
        double fahrenheit = oku.nextDouble();
        double celsius = (fahrenheit - 32) / 1.8;
        System.out.println("Celsius = " + celsius);
    }
}
