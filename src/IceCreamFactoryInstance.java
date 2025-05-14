import enums.IceCreamType;
import interfaces.IceCream;
import interfaces.IceCreamFactory;

public class IceCreamFactoryInstance implements IceCreamFactory {

    @Override
    public IceCream createIceCream(IceCreamType type) {
        IceCream iceCream;

        switch (type) {
            case vanilla -> iceCream = new VanillaIceCream();
            case chocolate -> iceCream = new ChocolateIceCream();
            case strawberry -> iceCream = new StrawberryIceCream();
            default -> throw new IllegalArgumentException("Ice cream type is unknown");
        }

        return iceCream;
    }
}
