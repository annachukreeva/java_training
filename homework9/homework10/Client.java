package homework.homework9.homework10;

import java.util.Objects;

public class Client extends Account {
    private String name;
    private int age;

    public Client(int account) {
        super(account);
    }

    public Client (int account, String name, int age) {
        super(account);
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return age == client.age && Objects.equals(name, client.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Client{" +
                "account=" + getAccount() +
                ", name='" + name + '\'' +
                 ", age='" + age + '\'' +
                '}';
    }
}
