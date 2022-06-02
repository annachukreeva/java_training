package homework.homework9.homework10;

import java.util.Objects;
import java.util.Set;

public class Client {
    private String name;
    private int age;
    private Set<Account> accounts;

    public Set<Account> getAccounts() {
        return accounts;
    }

    public Client(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAccounts(Set<Account> accounts) {
        this.accounts = accounts;
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
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';

    }
}
