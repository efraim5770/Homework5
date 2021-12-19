import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee employee1 =
                new Employee("Grunin Efraim", 34,"Tester","efraim5770@gmail.com", 50000, "+79603552734");
        employee1.printEmployee();
        Employee[] employees = new Employee[5];
        employees[0] =  new Employee("Grunin Efraim", 32,"Tester","efra1im5770@gmail.com", 50000, "+79603552734");
        employees[1] =  new Employee("2Grunin Efraim", 33,"Tester","efra2im5770@gmail.com", 50000, "+79103552734");
        employees[2] =  new Employee("3Grunin Efraim", 50,"Tester","efraim5770@gmail.com", 50000, "+79603552744");
        employees[3] =  new Employee("4Grunin Efraim", 35,"Tester","efra3im5770@gmail.com", 50000, "+79603556734");
        employees[4] =  new Employee("5Grunin Efraim", 45,"Tester","efraim45770@gmail.com", 50000, "+79603852734");
        System.out.println(Arrays.toString(employees));

        for (Employee emp: employees) {
            if(emp.getAge()>40){
                System.out.println(emp);
            }
        }
    }

}
