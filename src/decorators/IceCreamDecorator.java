package decorators;

import interfaces.IceCream;

public abstract class IceCreamDecorator implements IceCream {
    private final IceCream iceCream;

    public IceCreamDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public String makeIceCream() {
        return this.iceCream.makeIceCream();
    }
}

