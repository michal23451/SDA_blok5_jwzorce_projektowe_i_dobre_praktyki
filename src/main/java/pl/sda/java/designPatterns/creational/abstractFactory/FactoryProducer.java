package pl.sda.java.designPatterns.creational.abstractFactory;

public class FactoryProducer {

    public static AbstractFactory getFactory(boolean rounded) {

        AbstractFactory factory = rounded ? new RoundedShapeFactory() : new ShapeFactory();
        return factory;
//        if (rounded) {
//            return new RoundedShapeFactory();
//        }
//        return new ShapeFactory();
    }
}