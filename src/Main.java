import com.sun.source.tree.IfTree;

public class Main {
    public static void main(String[] args) {
    byte clientOS = 1;
    if (clientOS == 1) {
        System.out.println("Установите версию приложения для Android по ссылке.");
    } else {
        System.out.println("Установите версию приложения для iOS по ссылке.");
    }


    byte clientOS1 = 0;
    short clientDeviceYear = 2015;
    if (clientOS1 == 1 && clientDeviceYear > 2015) {
        System.out.println("Установите версию приложения для Android по ссылке.");
    } else {
        System.out.println("Установите версию приложения для iOS по ссылке.");
        }
    if (clientOS1 == 1 && clientDeviceYear < 2015) {
        System.out.println("Установите облегченную версию приложения для Android по ссылке.");
    } else if (clientOS1 == 0 && clientDeviceYear < 2015) {
        System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
    }


    int year = 2014;
    if(((year % 4 == 0) && (year % 100 != 0))) {
        System.out.println(year + " год является високосным.");
    } else {
        System.out.println(year + " год не является високосным.");
    }


     short deliveryDistance = 95;
     int days = 1;
     if (deliveryDistance > 0 && deliveryDistance < 20) {
         System.out.println("Потребуется " + days + " день.");
     }
     if (deliveryDistance > 20 && deliveryDistance < 60) {
         System.out.println("Потребуется " + (days + 1) + " дня.");
     } else if (deliveryDistance > 60 && deliveryDistance <100) {
         System.out.println("Потребуется " + (days + 2) + " дня.");
     } else {
         System.out.println("Свыше 100км доставки нет.");
     }

     int month = 5;
     switch (month) {
         case 1:
             System.out.println("Январь.Зима.");
             break;
         case 2:
             System.out.println("Февраль.Зима.");
             break;
         case 3:
             System.out.println("Март.Весна.");
             break;
         case 4:
             System.out.println("Апрель.Весна.");
             break;
         case 5:
             System.out.println("Май.Весна.");
             break;
         case 6:
             System.out.println("Июнь.Лето.");
             break;
         case 7:
             System.out.println("Июль.Лето.");
             break;
         case 8:
             System.out.println("Август.Лето.");
             break;
         case 9:
             System.out.println("Сентябрь.Осень.");
             break;
         case 10:
             System.out.println("Октябрь.Осень.");
             break;
         case 11:
             System.out.println("Ноябрь.Осень.");
             break;
         case 12:
             System.out.println("Декабрь.Зима.");
             break;
         default:
             System.out.println("К сожалению в году 12 месяцев.");

     }

    }
    }
