package module.FactoryMethodPattern;

public class BananaFactory implements FruitFactory {

	public Fruit getFruit() {
		return new Banana();
	}

}
