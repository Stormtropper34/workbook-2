package com.pluralsight;

public class ForLoop {
    public static void main(String[] args) throws InterruptedException {

        //using i-- to count down then to have i++ counting up
        // i = 10 so that means if i is greater than or equal to 1 it will count down
        // 10 is greater than or equal to 1,2,3,4,5,6,7,8,9,10 
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
            Thread.sleep(1000);

        }


        System.out.println("Launch!!!!!!");
    }


}
