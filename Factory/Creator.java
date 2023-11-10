package Factory;

import Observer.IObserver;
import Observer.User;

public abstract class Creator {
    public User create(String name, int wallet){
        return createUser(name, wallet);
    }

    public abstract User createUser(String name, int wallet);
}
