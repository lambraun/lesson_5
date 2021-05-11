package ru.gb.lesson5;

public class Employee {


    String fullName ;
    String position;
    String email;
    String telephone;
    int salary;
    int age;

    public int getAge(){
        return age;
    }

    public Employee(String fullName, String position, String email, String telephone, int salary, int age){
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
    }
    public void printInfo() {
        System.out.println("Сотрудник : \n" + fullName + "\nДолжность : " + position +
                "\nemail : " + email + "\nТелефон : " + telephone + "\nЗарплата : " + salary + " рублей " +
                "\nВозрараст : " + age + " лет");
    }
}
