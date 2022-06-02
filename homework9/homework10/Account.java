package homework.homework9.homework10;

public class Account {
    private int account;
    private Client client;

    public Account(int account, Client client) {
        this.account = account;
        this.client = client;
    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
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


