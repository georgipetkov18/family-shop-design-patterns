import decorators.ChocolateSticksDecorator;
import decorators.ChocolateToppingDecorator;
import enums.IceCreamType;
import interfaces.IceCream;

public class Store {
    private static Store myStore = null;

    private Store() {

    }

    public static Store getInstance() {
        if (myStore == null)
            myStore = new Store();

        return myStore;
    }

    public void openStore() {
        IceCreamFactoryInstance factory = new IceCreamFactoryInstance();
        IceCream vanillaIceCream = factory.createIceCream(IceCreamType.vanilla);
        System.out.println(vanillaIceCream.makeIceCream());

        IceCream chocolateIceCream = factory.createIceCream(IceCreamType.chocolate);
        System.out.println(chocolateIceCream.makeIceCream());

        IceCream starwberryIceCream = factory.createIceCream(IceCreamType.strawberry);
        System.out.println(starwberryIceCream.makeIceCream());


        ChocolateToppingDecorator chocolateToppingDecorator = new ChocolateToppingDecorator(vanillaIceCream);
        System.out.println(chocolateToppingDecorator.makeIceCream());

        ChocolateSticksDecorator chocolateSticksDecorator = new ChocolateSticksDecorator(starwberryIceCream);
        System.out.println(chocolateSticksDecorator.makeIceCream());
    }
}
