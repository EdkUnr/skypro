import com.sun.source.tree.IfTree;

public class Main {
    public static void main(String[] args) {
       for(int i = 0; i < 10; i ++) {
           System.out.println(i);
       }


       for(int a = 10; a > 0; a--) {
            System.out.println(a);
        }


       for (int b = 0; b < 17; b = b + 2) {
           System.out.println(b);
       }

       for (int c = 10; c >= -10; c--) {
           System.out.println(c);
       }


       for (int d = 1904; d < 2096; d = d + 4) {
           System.out.println(d + " год является високосным.");
       }


       for (int e = 7; e <= 98; e = e + 7) {
           System.out.println(e);
       }

       for (int g = 1; g <= 512; g = g * 2){
           System.out.println(g);
       }

       int deposit = 29000;
       int total = 0;
       for (int f = 1; f <= 12; f ++) {
           total = total + deposit;
           System.out.println("Месяц " + f + ", сумма накоплений равна " + total + " рублей.");
       }


       int deposit1 = 29000;
       int total1 = 0;
       for (int h = 1; h <= 12; h ++) {
           total1 = total1 + (total1/100) * 12;
           total1 = total1 + deposit1;
           System.out.println("Месяц " + h + ", сумма накоплений равна " + total1 + " рублей.");
       }


       int result1 = 2;
       for (int j= 1; j <= 10; j = j + 1) {
           System.out.println("2*" + j + "=" + result1 * j);
       }


    }
    }
