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
        System.out.print("What is the length of the room? ");
        String strlen = in.nextLine();
        System.out.print("What is the width of the room? ");
        String strwid = in.nextLine();

        //String conversion
        int len =Integer.parseInt(strlen);
        int wid =Integer.parseInt(strwid);

        //math
        int area = len * wid;
        int gal = area / 350;
        gal = gal + 1;

        //Output
        System.out.println("You will need to purchase "+gal+" gallons of paint to cover "+area+" square feet.");
    }
    //main method end
}
//class end
