
public class WhatToWear {
    public static void main(String[] args) {

        boolean rain = true;
        boolean cloudy = true;
        boolean sunny = false;
        boolean snow = false;
        int temp = 11;

        System.out.println("What should I wear today?");
        if (snow && temp < 12) {
            System.out.println("A coat!");
        } else if (sunny || temp > 18){
            System.out.println("A T shirt!");
        } else if (cloudy && rain){
            System.out.println("A jumper and a waterproof jacket");
        } else if (rain){
            System.out.println("A waterproof jacket");
        } else {
            System.out.println("I'm not sure");
        }
    }
}