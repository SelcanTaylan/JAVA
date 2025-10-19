import java.util.Scanner;

public class AlanCevreHesaplama {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.println("Kısa Kenarı Giriniz: ");
        int kisakenar=oku.nextInt();
        System.out.println("Uzun Kenarı Giriniz: ");
        int uzunkenar=oku.nextInt();
        int alan=kisakenar*uzunkenar;
        int cevre=2*(kisakenar+uzunkenar);
        System.out.println("Alan: "+alan);
        System.out.println("Çevre: "+cevre);
    }
}
