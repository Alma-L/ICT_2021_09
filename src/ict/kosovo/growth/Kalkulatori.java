package ict.kosovo.growth;

import java.util.Scanner;

public class Kalkulatori{

        public static void main(String[] args) {
            int x;
            int y;
            char z;
            try (Scanner input = new Scanner(System.in)) {

                System.out.print("Jepni numrin e pare:");
                x = input.nextInt();
                System.out.print("Jepni numrin e dyte:");
                y = input.nextInt();
                System.out.print("Zgjidhni operatorin:+,-,*,/,%: ");
                z = input.next().charAt(0);
            }
            System.out.println("-----------------------------------------");
            if(z=='+')
                System.out.printf("%d + %d = %d",x,y,(x+y));
            else if(z=='-')
                System.out.printf("%d - %d = %d",x,y,(x-y));
            else if(z=='*')
                System.out.printf("%d * %d = %d",x,y,(x*y));
            else if(z=='/')
                System.out.printf("%d / %d = %d",x,y,(x/y));
            else if(z=='%')
                System.out.printf("%d % %d = %d",x,y,(x%y));
            System.out.println();
            System.out.println("-----------------------------------------");

        }
    }
