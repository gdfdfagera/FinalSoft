package Strategy;

import Factory.CreateUser;
import Factory.Creator;
import Factory.CreatorUser;
import Factory.ICreateUser;
import Observer.Shop;
import Observer.User;
import Strategy.IChange;

public class Admin {
    IChange db;

    public void setChange(IChange db){
        this.db = db;
    }

    public void action(int id, String product, String type, String price){
        db.action(id, product, type, price);
    }

    public void createUser(String name, int wallet){
        Creator c = new CreatorUser();
        User user = c.create(name, wallet);

        Shop.addUser(user);
    }
}
