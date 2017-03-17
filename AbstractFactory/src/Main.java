
import java.io.IOException;

import cliente.Cliente;
import factory.AbstractFactory;
import factory.FactoryProducer;


public class Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		AbstractFactory abstractFactory = FactoryProducer.getFactory("A");
		Cliente cliente = new Cliente(abstractFactory);
		System.out.println(cliente);
		
	}

	
	
}
