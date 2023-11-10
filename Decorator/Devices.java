package Decorator;

import java.util.List;

public class Devices implements IDecorator {

    @Override
    public String addToBusket() {
        return "Your also bought: ";
    }

}
