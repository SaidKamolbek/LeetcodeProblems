package com.Gita2.homewok;

import java.util.Locale;
import java.util.Scanner;

//public class a2 {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        String str1 = input.nextLine().toLowerCase(Locale.ROOT);
//        String str2 = input.nextLine().toLowerCase(Locale.ROOT);
//        str1 = withoutVowels(str1);
//        str2 = withoutVowels(str2);
//
//        System.out.println(str1.equals(str2));
//    }
//
//
//    static String withoutVowels(String str) {
//        String temp = "";
//        for (int i = 0; i < str.length(); i++) {
//            char ch = str.charAt(i);
//            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
//                continue;
//            }
//            temp = temp.concat(str.charAt(i) + "");
//        }
//        return temp;
//    }
//}




class A2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str1 = input.nextLine().toLowerCase();
        String str2 = input.nextLine().toLowerCase();
        System.out.println(str1.replaceAll("[aeiou]", "").equals(str2.replaceAll("[aeiou]", "")));

    }
}