package org.example;
import java.sql.SQLOutput;
import java.util.Scanner;

public class WhatChocolate {
    public static void main(String[] args) {
        //Prompt a user to input their favourite chocolate
        System.out.println("What is your favourite chocolate?");
        //Collect user input
        Scanner reader = new Scanner(System.in); //creates scanner object
        String favouriteChocolate = reader.nextLine();
        //if chocolate is bounty, print "gross"
        //otherwise prjnt "yum"
        if (favouriteChocolate.equals("Bounty")) {
            System.out.println("Gross");
        } else if (favouriteChocolate.equals("Crunchie")){
            System.out.println("The best!");
        } else {
            System.out.println("Yum");
        }
    }
}