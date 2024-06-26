package Mext2;

public class Main {
    public static void main(String[] args) {
        Engineer employeeOne=new Engineer("Dilara Sabırtaş",36500,38);
        Salesperson employeeTwo= new Salesperson("Ali", 27000, 25, .25);
        employeeOne.getAnnualBonus();
        employeeOne.getAnnualBonus();
        employeeTwo.getComissionPercentage();
        
        employeeTwo.raiseSalary();
        employeeTwo.getComissionPercentage();
        System.out.println(employeeOne.salary);
        System.out.println(employeeOne.getAnnualBonus());
        System.out.println(employeeTwo.salary);
        System.out.println(employeeTwo.getComissionPercentage());
    }

}
