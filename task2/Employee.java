package task2;

import java.util.ArrayList;
import java.util.List;

public class Employee {


    private String name;
    private String department;



    private List<Role> roles;

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
        roles = new ArrayList<>();
    }

    public Employee(final String name, final String department, final Role initialRole) {
        this(name, department);
        roles.add(initialRole);
    }

    public String name() {
        return name;
    }

    public String department() {
        return department;
    }

    @Override
    public String toString() {
        StringBuilder roleStringBuilder = new StringBuilder();
        String delimiter = ", ";
        for (int i = 0; i < roles.size(); i++) {
            if (i == roles.size() - 1) {
                delimiter = "";
            }
            roleStringBuilder.append(roles.get(i)).append(delimiter);
        }
        return String.format("%s at %s. Roles: %s", name, department, roleStringBuilder);
    }

    public void addRole(String name) {
        this.roles.add(new Role(name));
    }
    public void removeRole(String name) {
        roles.removeIf(role -> role.equals(new Role(name)));
    }
}