package factory;

public class FactoryProducer {
	public static AbstractFactory getFactory(String tipoFactoria){
		AbstractFactory abstractFactory = null;
		try {
			String className = "factory.Factory"+tipoFactoria;
			 Class<?> clase = Class.forName(className);
			abstractFactory = (AbstractFactory) clase.newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			
		}
		return abstractFactory;
	}
}
