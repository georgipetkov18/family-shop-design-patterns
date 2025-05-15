package decorators;

import interfaces.IceCream;

public class ChocolateSticksDecorator extends IceCreamDecorator{
    public ChocolateSticksDecorator(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public String makeIceCream() {
        return super.makeIceCream() + " with chocolate sticks";
    }
}
