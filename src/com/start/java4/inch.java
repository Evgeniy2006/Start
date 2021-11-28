package com.start.java4;

public class inch {
    public static void main(String[] args) {
        double inhc, cm;
        int counter;

        counter = 0;
        for (inhc = 1; inhc <= 144; inhc++) {
            cm = inhc * 39.37;
            System.out.println(inhc + " дюймам соответствует " + cm + "сантиметра");
            counter ++;
            if (counter == 12) {
                System.out.println();
                counter = 0;
            }
        }
    }
}