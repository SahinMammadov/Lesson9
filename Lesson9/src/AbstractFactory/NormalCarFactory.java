package AbstractFactory;

public class NormalCarFactory implements CarFactory{
    @Override
    public Engine engine() {
        return new NormalEngine();
    }

    @Override
    public Wheel wheel() {
        return new NormalWheel();
    }
}
