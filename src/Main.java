import com.sun.source.tree.IfTree;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");


        int deposit = 15000;
        int total = 0;
        int month = 0;
        while (total <= 2459000) {
            System.out.println("Месяц " + month + " сумма накоплений равна " + total + " рублей");
            month++;
            total = total + deposit;
        }


      int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }

        System.out.println();


        for (int a = 10; a>=0; a--) {
            System.out.print(a + " ");
        }
        System.out.println();


        int people = 12000000;
        int born = 17;
        int death = 8;
        int year = 0;
        int growth = people/1000 * (born - death);
        while (year <= 10) {
             people = people + growth;
            System.out.println("Год " + year + ", численность населения равна " + people);
            year++;
        }

        System.out.println();


        int month1 = 0;
        int total1 = 15000;
        while (total1 <= 12000000) {
            total1 = total1 + (total1/100) * 7;
            System.out.println("Месяц " + month1 + " сумма накоплений равна " + total1);
            month1++;
        }

        System.out.println();


        int month2 = 0;
        int total2 = 15000;
        while (total2 <= 12000000) {
            total2 = total2 + (total2/100) * 7;
            month2++;
            if (month2 % 6 == 0) {
                System.out.println("Месяц " + month2 + " сумма накоплений равна " + total2);
            }
        }

        System.out.println();


        int month3 = 0;
        int total3 = 15000;
        while (month3 <= 108) {
            total3 = total3 + (total3/100) * 7;
            month3++;
            if (month3 % 6 == 0) {
                System.out.println("Месяц " + month3 + " сумма накоплений равна " + total3);
            }
        }

        System.out.println();


        for (int friday = 3; friday < 31; friday = friday +7){
            System.out.println("Сегодня пятница " + friday + " -е число. Необходимо подготовить отчёт" );
        }

        System.out.println();


        int past = 1823;
        int present = 2023;
        int future = 2123;
        for (int y = 0; y < future; y = y + 79) {
            if (y > past) {
                System.out.println(y);
            }
        }
    }
    }

