package com.Gita2.homewok;

import java.util.Scanner;

public class a1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine().toLowerCase();
        String str2 = input.nextLine().toLowerCase();

        System.out.println(str.equals(str2));
    }
}
