public class CoffeEspresso extends CoffeCup {
    public CoffeEspresso(){
        super.set_name("Espresso");
        super.set_Isready(false);
        super.setMaxVolume(100);
        super.set_products(new ProductsVO(10,90,30));
    }
}
