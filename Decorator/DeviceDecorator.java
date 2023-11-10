package Decorator;

import java.util.List;

public class DeviceDecorator implements IDecorator{
    IDecorator decorator;

    public DeviceDecorator(IDecorator decorator) {
        this.decorator = decorator;
    }

    @Override
    public String addToBusket() {
        return decorator.addToBusket();
    }

}
