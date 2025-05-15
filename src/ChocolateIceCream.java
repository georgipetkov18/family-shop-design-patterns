import interfaces.IceCream;

public class ChocolateIceCream implements IceCream {
    @Override
    public String create() {
        return "This is a chocolate ice cream";
    }
}
