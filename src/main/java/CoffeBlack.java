public class CoffeBlack extends CoffeCup {
    public CoffeBlack() {
        super.set_name("Espresso");
        super.set_Isready(false);
        super.setMaxVolume(175);
        super.set_products(new ProductsVO(15, 165, 25));
    }
}