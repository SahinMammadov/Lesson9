package AbstractFactory;

public class PerformanceCarFactory implements CarFactory{
    @Override
    public Engine engine() {
        return new PerformanceEngine();
    }

    @Override
    public Wheel wheel() {
        return new PerformanceWheel();
    }
}
