package com.bridgelabz.day5;

import java.util.Scanner;

public class SwapTwoNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("enter x=");
        int x=scanner.nextInt();
        System.out.print("enter y=");
        int y=scanner.nextInt();

        x=x+y;
        y=x-y;
        x=x-y;

        System.out.println("x = "+x);
        System.out.println("y = "+y);

    }
}
