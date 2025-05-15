package decorators;

import interfaces.IceCream;

public class ChocolateToppingDecorator extends IceCreamDecorator{
    public ChocolateToppingDecorator(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public String create() {
        return super.create() + " with chocolate topping";
    }
}
