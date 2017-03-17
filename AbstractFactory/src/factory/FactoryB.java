package factory;

import product.Producto;
import product.ProductoC;
import product.ProductoD;

public class FactoryB extends AbstractFactory{

	@Override
	public Producto getProducto1() {
		return new ProductoC();
	}

	@Override
	public Producto getProducto2() {
		return new ProductoD();
	}

}
