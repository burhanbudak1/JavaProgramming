package day32_Constructor;

public class EmployeeObjects {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Aaron");
        Employee employee2 = new Employee("Burhan", 'F');
        Employee employee3 = new Employee("Serkan", 'M', "SDET");
        Employee employee4 = new Employee("Serkan", 'M', "SDET", 120000);

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
        System.out.println(employee4);












    }
}
