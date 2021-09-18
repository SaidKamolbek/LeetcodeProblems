package com.Gita2.homewok;

import java.util.Locale;
import java.util.Scanner;

public class a5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str1 = input.nextLine();
        String str2 = input.nextLine();
        System.out.println(str1.toUpperCase().equals(str2) && str2.toLowerCase().equals(str1));

    }
}
