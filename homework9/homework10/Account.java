package homework.homework9.homework10;

import java.util.Objects;

public class Account {
    private int account;
    private Client client;

    public Account(int account, Client client) {
        this.account = account;
        this.client = client;
    }

    public Account(int account) {
        this.account = account;
    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account1 = (Account) o;
        return account == account1.account;
    }

    @Override
    public int hashCode() {
        return Objects.hash(account);
    }

    public String toString() {
        return "Account{" +
                "account=" + getAccount()+ '\'' +
                '}';

    }


    public Client getClient() {
        return client;
    }
}


