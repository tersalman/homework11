import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void checkYearOnLeapy(int yearInMethod) {
        if (yearInMethod % 4 == 0 && yearInMethod % 100 != 0 || yearInMethod % 400 == 0) {
            System.out.println(yearInMethod + " год является високосным");
        } else {
            System.out.println(yearInMethod + " год не является високосным");
        }
    }

    public static void task1() {
        System.out.println("Задача 1");
        int year = 400;
        int leapYear = 4;
        checkYearOnLeapy(year);
    }

    public static void offerForDowlandApp(int a, int b, int c) {
        if (a == 0 && b >= c) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (a == 0 && b < c) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (a == 1 && b >= c) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (a == 1 && b < c) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int clientOS = 1;
        int currentYear = LocalDate.now().getYear();
        int clientMobileYear = 2021;
        offerForDowlandApp(clientOS, clientMobileYear, currentYear);
    }

    public static void findADistantion(int a,int b ) {
        if (a < 20) {
            System.out.println("Потребуется дней " + b);
        } else if (a >= 20 && a < 60) {
            b = b + 1;
            System.out.println("Потребуется дней " + b);
        } else if (a >= 60 && a < 100) {
            b = b + 2;
            System.out.println("Потребуется дней " + b);
        } else {
            System.out.println("доставки нет");
        }
    }

    public static void task3() {
        System.out.println("Задача 2");
        int deliveryDistance = 30;
        int daysToDelivary = 1;
        findADistantion(deliveryDistance , daysToDelivary);

    }
}
