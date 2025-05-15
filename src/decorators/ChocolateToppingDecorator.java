package decorators;

import interfaces.IceCream;

public class ChocolateToppingDecorator extends IceCreamDecorator{
    public ChocolateToppingDecorator(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public String makeIceCream() {
        return super.makeIceCream() + " with chocolate topping";
    }
}
