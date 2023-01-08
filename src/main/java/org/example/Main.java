package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main extends Newclass {

       public int p = 6;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Main obj = new Main();
       // int s = sum(10);
        System.out.println("enter input");
        int s = sc.nextInt();
        System.out.println(obj.sum(s));
        Main m= new Main();

        Newclass nc = new Main();
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("black");
        colors.add("blue");
        System.out.println(colors);

        System.out.println(obj.p);
        nc.setName("mahreen");
        nc.getName();
        System.out.println(nc.getName());
        System.out.println(m.score);
        Level lv= Level.MEDIUM;
        System.out.println(lv);

    }

        public int sum (int k){
            if (k > 0) {

              int s =  k + sum(k - 1);
              return s;
            } else {
                return 0;
            }


        }



}

enum Level{
    LOW,
    MEDIUM,
    HIGH,
}
