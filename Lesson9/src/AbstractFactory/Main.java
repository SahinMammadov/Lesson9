package AbstractFactory;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CarFactory performanceCar = new PerformanceCarFactory();
        Engine performanceEngine= performanceCar.engine();
        Wheel performanceWheel = performanceCar.wheel();

        System.out.println("Sports car engine: " + performanceEngine.getType());
        System.out.println("Sports car tire: " + performanceWheel.getType());

        CarFactory normalCar = new NormalCarFactory();
        Engine normalEngine = normalCar.engine();
        Wheel normalWheel = normalCar.wheel();

        System.out.println("Normal Car engine: " + normalEngine.getType());
        System.out.println("Normal Car wheel: " + normalWheel.getType());

        }
    }
