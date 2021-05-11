package ru.gb.lesson5;

public class JavaApp {

    public static void main(String[] args) {

        Employee one = new Employee("Васильев Василий Васильевич", "Програмист", "vasya@mail.ru",
                "8-923-999-99-99", 50000, 38);
        one.printInfo();
        System.out.println();





        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Петров Петр Петрович", "слесарь", "vasya@mail.ru",
                "8-923-999-99-99", 25000, 64);
        employees[1] = new Employee("Иванов Иван Иваныч", "слесарь", "vasya@mail.ru",
                "8-923-999-99-99", 30000, 40);
        employees[2] = new Employee("Германюк Герман Германович ", "слесарь", "vasya@mail.ru",
                "8-923-999-99-99", 27000, 41);
        employees[3] = new Employee("Пушкин Александр Сергеевич", "слесарь", "vasya@mail.ru",
                "8-923-999-99-99", 31000, 54);
        employees[4] = new Employee("Мамаев Рустам Рамизович", "слесарь", "vasya@mail.ru",
                "8-923-999-99-99", 40000, 34);
        for(int i = 0; i < employees.length; i++){
            if (employees[i].getAge() > 40){
                employees[i].printInfo();
            }

        }
    }
}
