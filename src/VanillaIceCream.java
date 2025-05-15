import interfaces.IceCream;

public class VanillaIceCream implements IceCream {

    @Override
    public String makeIceCream() {
        return "This is a vanilla ice cream";
    }
}
