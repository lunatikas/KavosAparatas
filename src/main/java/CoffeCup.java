public class CoffeCup extends Cup {
    private ProductsVO _products;
    private String _name;
    private boolean _Isready;

    public ProductsVO get_products() {
        return _products;
    }

    public void set_products(ProductsVO value) {
        this._products = value;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String value) {
        this._name = value;
    }

    public boolean is_Isready() {
        return _Isready;
    }

    public void set_Isready(boolean va) {
        this._Isready = _Isready;
    }
    public void String

    @Override
    public String toString() {
        return "name"+ _name", is ready"+_Isready", bleans"+ _products.getBeans();
    }
}
