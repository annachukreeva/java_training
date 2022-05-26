package homework.homework9.homework10;

import java.util.Map;
import java.util.HashMap;

public class Bank {
    public static void main(String[] args) {
       Account client1 = new Client (112233, "Name1", 25);
       Account client2 = new Client (112244, "Name2", 25);
       Account client3 = new Client (112255, "Name3", 25);

Map<Integer, Client> map = new HashMap<> ();
map.put(client1.getAccount(), (Client) client1);
map.put(client2.getAccount(), (Client) client2);
map.put(client3.getAccount(), (Client) client3);

System.out.println(map.entrySet());


        //client2.setId(5);
        //client2.setId(5);

       // System.out.println(client2.getId());
       //System.out.println(client2);

        /*Map<Integer, Client> map = new HashMap<>();
        map.put(ivanov.get(id), ivanov);
        map.put(petrov,get(id), petrov);
        System.out.println(map.values());*/
            }
}
