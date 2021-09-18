package com.Gita2.homewok;

import java.util.Locale;
import java.util.Scanner;

//public class a3 {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        String str = input.nextLine().toLowerCase(Locale.ROOT);
//        int countvowels = 0;
//        for (int i = 0; i < str.length(); i++) {
//            char ch = str.charAt(i);
//            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
//                countvowels++;
//            }
//        }
//        System.out.println(countvowels);
//    }
//}

class A3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        int l = str.length();
        System.out.println(l - str.replaceAll("[aeiou]", "").length());
    }
}