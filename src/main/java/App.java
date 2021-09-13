/*
 *  UCF COP3330 Fall 2021 Assignment 6 Solution
 *  Copyright 2021 zain yousaffuentes
 */

import java.util.Scanner;
import java.util.Calendar;

public class App {
    public static void main(String[] args) {

        int year = Calendar.getInstance().get(Calendar.YEAR);

        Scanner s = new Scanner(System.in);

        System.out.println("What is your current age? ");
        int currentAge = Integer.parseInt(s.nextLine());
        System.out.println("At what age would you like to retire? ");
        int ageToRetire = Integer.parseInt(s.nextLine());

        System.out.println(String.format("You have %d years left until you can retire.\nIt's %d, so you can retire in %d.", ageToRetire - currentAge, year, year + (ageToRetire - currentAge)));
    }
}
