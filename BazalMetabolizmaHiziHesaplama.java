package com.example.odev;

import java.util.Scanner;

public class BazalMetabolizmaHiziHesaplama {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);

        System.out.print("Cinsiyet (1-Kadın, 2-Erkek): ");
        int cinsiyet = oku.nextInt();

        System.out.print("Yaş: ");
        int yas = oku.nextInt();

        System.out.print("Boy (cm): ");
        double boy = oku.nextDouble();

        System.out.print("Kilo (kg): ");
        double kilo = oku.nextDouble();

        double bmh = 0;

        if (cinsiyet == 1) {
            // Kadın
            bmh = 655.1 + (9.56 * kilo) + (1.85 * boy) - (4.68 * yas);
        } else if (cinsiyet == 2) {
            // Erkek
            bmh = 66.5 + (13.75 * kilo) + (5.03 * boy) - (6.75 * yas);
        } else {
            System.out.println("Hatalı cinsiyet seçimi!");
            return;
        }

        System.out.println("Bazal Metabolizma Hızınız (BMH): " + String.format("%.2f", bmh) + " kcal/gün");
    }

}
