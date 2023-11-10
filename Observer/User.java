package Observer;

import Observer.IObserver;

public class User implements IObserver {
    private String name;
    private int wallet;

    public User(String name, int wallet){
        this.name = name;
        this.wallet =wallet;
    }


    @Override
    public void update() {
        System.out.println("Dear " + name + ", list of products was updated");
    }
}
