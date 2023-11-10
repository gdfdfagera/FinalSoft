package Decorator;

import java.util.List;

public class AddMouse extends DeviceDecorator{
    public AddMouse(IDecorator decorator) {
        super(decorator);
    }

    public String mouse(){
        return "mouse";
    }

    @Override
    public String addToBusket(){
        return super.addToBusket() + mouse();
    }
}
