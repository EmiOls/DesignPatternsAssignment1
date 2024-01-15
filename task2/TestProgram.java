package task2;

import java.util.ArrayList;

public class TestProgram {
    public static void main(String[] args) {


        var employee = new Employee("Emil", "Yrgo", new Role("Role1"));
        System.out.println(employee);
        employee.addRole("Role2");
        System.out.println(employee);
        employee.removeRole("Role1");
        System.out.println(employee);
    }
}
