package com.bridgelabz.day5;
import java.util.Scanner;
public class Array2d {
    public static void main(String[] args) {


        int a[][]=new int[2][2];
        Scanner r=new Scanner(System.in);
        System.out.print("Enter the elements of the array");
        for(int i=0;i<2; i++){
            for(int j=0;j<2; j++) {
                a[i][j] = r.nextInt();

            }
        }
        System.out.print("Matrix \n" );
        for(int i=0;i<2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(a[i][j]+ " ");
            }
            System.out.println(" ");
        }
        
}
