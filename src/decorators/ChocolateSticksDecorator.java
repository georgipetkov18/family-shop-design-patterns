package decorators;

import interfaces.IceCream;

public class ChocolateSticksDecorator extends IceCreamDecorator{
    public ChocolateSticksDecorator(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public String create() {
        return super.create() + " with chocolate sticks";
    }
}
