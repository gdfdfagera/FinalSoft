package Observer;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    static List<IObserver> users = new ArrayList<>();

    public static void addUser(User user){
        users.add(user);
    }

    public static void removeUser(User user){
        users.remove(user);
    }


    public static void notifyObservers(){
        for (IObserver observer: users) {
            observer.update();
        }
    }
}
