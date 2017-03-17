package cliente;

import product.Producto;
import factory.AbstractFactory;

public class Cliente {
	Producto producto1;
	Producto producto2;
	
	public Cliente(AbstractFactory abstractFactory){
		producto1 = abstractFactory.getProducto1();
		producto2 = abstractFactory.getProducto2();
	}

	@Override
	public String toString() {
		return "Cliente [producto1=" + producto1.getName() + ", producto2=" + producto2.getName() + "]";
	}
	
}
