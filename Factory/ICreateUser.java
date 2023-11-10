package Factory;

import Observer.User;

public interface ICreateUser {
    User create(String name, int wallet);
}
