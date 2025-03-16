package dsa.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrComp {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new Employee("Harry", 40, 2000000);
        employees[1] = new Employee("Lolo", 50, 1000000);
        employees[2] = new Employee("Opinion", 30, 3000000);
        Arrays.sort(employees);
        System.out.println("After sorting : " + Arrays.toString(employees));
    }
}

// added an Employee class and want to compare the members so i can have them sorteed
 class Employee implements Comparable<Employee> {
    private String name;
    private int age;
    private int salary;

    Employee(String name, int age, int salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    
    @Override
    public int compareTo(Employee o) {
        if(age == o.age){
            return(salary-o.salary);
        }
        return age - o.age;
    }

    @Override
    public String toString(){
        return String.format("(%s, %d, %d))", name, age, salary);
    }    
}
