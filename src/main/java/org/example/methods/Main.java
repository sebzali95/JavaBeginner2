package org.example.methods;

public class Main {
    public static void main(String[] args) {
        sayiBulmaca();
    }

    public static void sayiBulmaca() {
        int[] sayilar = new int[]{1, 2, 3, 4, 5, 6, 7};
        int aranacak = 1;
        boolean varMi = false;

        for (int sayi : sayilar) {
            if (sayi == aranacak) {
                varMi = true;
                break;
            }
        }
        if (varMi) {
            mesajVer("Sayi mevcuttur : " + aranacak);
        } else {
            mesajVer("Sayi mevcut deyildir : " + aranacak);
        }
    }

    public static void mesajVer(String message) {
        System.out.println(message);
    }
}
