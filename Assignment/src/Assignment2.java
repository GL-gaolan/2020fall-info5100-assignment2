import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Comparator.comparing;

/**
 * The deadline of this assignment is 09/25/2020 23:59 PST.
 * Please feel free to contact Yafei and Yaqi for any questions.
 */

class Employee {
    String name;
    int age;
    Gender gender;
    double salary;// salary per month

    // Constructor. Please set all the data in constructor.
    public Employee(String name, int age, Gender gender, double salary) {
        super();
        this.name= name;
        this.age= age;
        this.gender=gender;
        this.salary=salary;
    }

    // Getter for `name`. Return the current `name` data
    public String getName(){
            return name;
    }

    // Setter for `name`. Set `name` data
    public void setName(String name) {
            this.name=name;
    }

    public double getSalary(){
        return salary;
        }

    public int compareTo(Employee otherEmployee){
        return Double.compare(this.getSalary(), otherEmployee.getSalary());
    }
}

enum Gender {
    MALE,
    FEMALE;
}

public class Assignment2 {
    // Assignment

    /**
     * Write a method to calculate the Social Security Tax of an employee and print it.
     * If the salary is less than or equal to 8900, the Social Security Tax is 6.2% of the salary.
     * If the salary is more than 8900, the Social Security Tax is 6.2% of 106,800.
     */
    public void socialSecurityTax(Employee employee) {
        double tax;
        if (employee.salary<=8900) {
            tax = employee.salary*0.062 ; }
        else
            {
                tax = 106800*0.062 ;
            }
        System.out.println(employee.name+"'s tax is "+tax);

    }

    /**
     * Write a method to calculate an employee's contribution for insurance coverage and print it.
     * Amount of deduction is computed as follows:
     * If the employee is under 35, rate is 3% of salary; if the employee is between 35 and 50(inclusive), rate is 4% of salary;
     * If the employee is between 50 and 60(exclusive), rate is 5% of salary; If the employee is above 60, rate is 6% of salary.
     */
    public void insuranceCoverage(Employee employee) {
        double coverage;
        if(employee.age<35){
            coverage= employee.salary*0.03;
        }
        if(employee.age>=35&employee.age<=50){
            coverage=employee.salary*0.04;
        }
        if(employee.age>50&employee.age<60){
            coverage=employee.salary*0.05;
        }
        else {
            coverage= employee.salary*0.06;
        }
        System.out.println(employee.name+"'s coverage is "+coverage);
    }

    /**
     * Write a method to sort three employees' salary from low to high, and then print their name in order.
     * For example, Alice's salary is 1000, John's salary is 500, Jenny's salary is 1200, you should print:
     * John Alice Jenny
     */
    public void sortSalary(Employee e1, Employee e2, Employee e3) {
        List<Employee> employees = new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.sort(null);
        for (Employee employee:employees){
            System.out.println(employee.name);
        }
    }

    /**
     * Write a method to raise an employee's salary to three times of his/her original salary.
     * Eg: original salary was 1000/month. After using this method, the salary is 3000/month.
     * Do not change the input of this method.
     * Try to add a new method in Employee class: public void raiseSalary(double byPercent)
     */
    public void tripleSalary(Employee employee) {
        Double newSalary= employee.salary*3;
        System.out.println(employee.name+"'s newSalary is "+ newSalary);
    }

    //Extra credit

    /**
     * I have written some code below. What I want is to swap two Employee objects.
     * One is Jenny and one is John. But after running it, I got the result below:
     * Before: a=Jenny
     * Before: b=John
     * After: a=Jenny
     * After: b=John
     * There is no change after swap()! Do you know the reason why my swap failed?
     * Write your understanding of the reason and explain it.
     */
    /*
     Basic types of functions such as int, double, float, etc. are passed by value when passing parameters,
     that is, what is passed into the function is only a copy of the original variable,
     so the exchange in the function is a copy, and it cannot reach To the purpose of exchange.
    */
    public void main(String[] args) {
        Employee a = new Employee("Jenny", 20, Gender.FEMALE, 2000);
        Employee b = new Employee("John", 30, Gender.MALE, 2500);
        System.out.println("Before: a=" + a.getName());
        System.out.println("Before: b=" + b.getName());
        swap(a, b);
        System.out.println("After: a=" + a.getName());
        System.out.println("After: b=" + b.getName());
    }

    public static void swap(Employee x, Employee y) {
        Employee temp = x;
        x = y;
        y = temp;
    }
}
