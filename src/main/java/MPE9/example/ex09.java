package MPE9.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Derek Gilberti
 */

//class begin
public class ex09 {
    //main method begin
    public static void main(String[] args) {
        //scanner
        Scanner in = new Scanner(System.in);

        //inputs
        System.out.print("How many people? ");
        String strlen = in.nextLine();
        System.out.print("How many pizzas do you have? ");
        String strwid = in.nextLine();
        System.out.print("How many slices per pizza? ");
        String strgal = in.nextLine();

        //String conversion
        int len =Integer.parseInt(strlen);
        int wid =Integer.parseInt(strwid);
        int gal =Integer.parseInt(strgal);

    }
    //main method end
}
//class end
