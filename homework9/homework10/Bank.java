package homework.homework9.homework10;

import java.util.*;

public class Bank {
    public static void main(String[] args) {
        Set<Account> accounts1 = new HashSet<>();
        Set<Account> accounts2 = new HashSet<>();
        Set<Account> accounts3 = new HashSet<>();
        Set<Account> accounts4 = new HashSet<>();


        Client client1 = new Client("Name1", 25);
        Client client2 = new Client("Name2", 25);
        Client client3 = new Client("Name3", 25);
        Client client4 = new Client("Name3", 25);

        Account account1 = new Account(1, client1);
        Account account2 = new Account(2, client2);
        Account account3 = new Account(3, client3);
        Account account4 = new Account(4, client3);

        accounts1.add(account1);
        accounts2.add(account2);
        accounts3.add(account3);
        accounts4.add(account4);

        client1.setAccounts(accounts1);
        client2.setAccounts(accounts2);
        client3.setAccounts(accounts3);


        Set<Client> client = new HashSet<>();
        client.add(client1);
        client.add(client2);
        client.add(client3);

        Optional<Client> first = client.stream().filter(client5 -> client4.equals(client5)).findFirst();
        first.isPresent();
        Client client5 = first.get();

HashMap<Client, Set<Account>> example = new HashMap<>();
example.put(client1, client1.getAccounts());
Client client6 = new Client("Name1", 25);
        Set<Account> accounts = example.get(client6);

        HashMap<Account, Client> example2 = new HashMap<>();
        example2.put(account1, account1.getClient());
        Account account6 = new Account(1);
        example2.get(account1);

        System.out.println(client1.getAccounts());
        System.out.println(account3.getClient());
    }
}
