package task2;

import java.util.Objects;

public class Role {
    private String name;

    public Role(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {return true;}
        if (o == null || getClass() != o.getClass()) {return false;}
        final Role role = (Role) o;
        return this.getName().equals(role.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
