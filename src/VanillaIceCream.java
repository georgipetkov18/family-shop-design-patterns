import interfaces.IceCream;

public class VanillaIceCream implements IceCream {

    @Override
    public String create() {
        return "This is a vanilla ice cream";
    }
}
