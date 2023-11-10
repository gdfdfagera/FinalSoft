package Factory;

import Observer.User;

public class CreateUser implements ICreateUser{

    @Override
    public User create(String name, int wallet) {
        return new User(name, wallet);
    }
}
