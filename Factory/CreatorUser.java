package Factory;

import Observer.User;

public class CreatorUser extends Creator{

    @Override
    public User createUser(String name, int wallet) {
        CreateUser c = new CreateUser();
        return c.create(name, wallet);
    }
}
