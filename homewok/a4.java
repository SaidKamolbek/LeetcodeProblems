package com.Gita2.homewok;

import java.util.Locale;
import java.util.Scanner;

//public class a4 {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        String str = input.nextLine().toLowerCase(Locale.ROOT);
//        int consanant = 0;
//        for (int i = 0; i < str.length(); i++) {
//            char ch = str.charAt(i);
//            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
//                continue;
//            }
//            consanant++;
//        }
//        System.out.println(consanant);
//    }
//}

class A4{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        System.out.println( str.replaceAll("[aeiou]", "").length());
    }
}