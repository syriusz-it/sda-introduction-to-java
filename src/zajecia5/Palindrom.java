package zajecia5;

import java.util.Scanner;

public class Palindrom {

    public static boolean isPalindrom(String text) {
        ////usuniecie spacji -> zamiana " " na "" oraz zmieniamy na male litery
        ////oryginalny napis nie ulega zmianie
        text = text.replace(" ", "").toLowerCase();
        for (int i = 0; i < text.length() / 2; i++) {
            if (text.charAt(i) != text.charAt(text.length() - 1 - i)) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj teskt o dlugosci do 30 znakow: ");
        String text = sc.nextLine();
        System.out.println("Napis: " + text + " jest palindromem: " + isPalindrom(text));


    }


}
