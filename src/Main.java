public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void task1() {

        System.out.println("Задача 1");

        int age = 18;
        if (age >= 17) {
            System.out.println("Возраст человека равен " + age + ", он совершеннолетний");
        } else {
            System.out.println("Человек не достиг совершеннолетия, нужно немного подождать");
        }
        System.out.println("Задача 2");

        int temp = 6;
        if (temp <= 5) {
            System.out.println("На улице холодно " + temp + " градусов, нужно надеть шапку.");
        } else {
            System.out.println("На улице тепло " + temp + " градусов, можно идти без шапки.");
        }

        System.out.println("Задача 3");

        int speed = 66;
        if (speed > 60) {
            System.out.println("скорость превышена, придется заплатить штраф");
        } else {
            System.out.println("превышения скорости нет, можно ездить спокойно");
        }
    }

    public static void task2() {
        System.out.println("Задача 4");

        int age = 25;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад.");
        }
        if (age >= 7 && age <= 18) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу.");
        }
        if (age > 18 && age < 24) {
            System.out.println("Если возраст человека равен " + age + ", то его место в университете");
        } else if (age > 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему пора ходить на работу.");
        }
    }

    public static void task3() {
        System.out.println("Задача 5");
        int age = 15;
        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе.");
        } else if (age<14) {System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе в сопровождении взрослого.");
        } else {System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе одному.");
        }

        System.out.println("Задача 6");

        int capacity = 102;
        int seats = 60;
        int standingCapacity = capacity - seats;
        int passengers = 122;

        if (passengers <= seats) {
            System.out.println("Есть свободные сидячие места.");
        } else if (passengers <= capacity) {
            System.out.println("Свободных сидячих мест нет, но есть места для стояния.");
        } else {
            System.out.println("Вагон полностью забит.");
        }

        System.out.println("Задача 7");
        int one = 15;
        int two = 56;
        int three =99;

        if (one >= two && one >= three) {
            System.out.println(one + " наибольшее число");
        } else if (two >= one && two >= three) {
            System.out.println(two + " наибольшее число");
        } else {
            System.out.println(three + " наибольшее число");
        }
    }
}