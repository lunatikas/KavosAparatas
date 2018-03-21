public class CoffeLatte extends CoffeCup {
    public CoffeLatte() {
        super.set_name("Espresso");
        super.set_Isready(false);
        super.setMaxVolume(250);
        super.set_products(new ProductsVO(10, 140, 20));
    }
}
