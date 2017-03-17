package factory;

import product.Producto;
import product.ProductoA;
import product.ProductoB;

public class FactoryA extends AbstractFactory{

	@Override
	public Producto getProducto1() {
		return new ProductoA();
	}

	@Override
	public Producto getProducto2() {
		return new ProductoB();
	}

}
