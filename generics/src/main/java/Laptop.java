import java.util.Objects;

public class Laptop {
    private int id;
    private String name;

    public Laptop(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Laptop laptop)) return false;
        return id == laptop.id && Objects.equals(name, laptop.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
