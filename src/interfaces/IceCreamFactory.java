package interfaces;

import enums.IceCreamType;

public interface IceCreamFactory {
    IceCream createIceCream(IceCreamType type);
}
