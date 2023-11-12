package core.basesyntax;

public abstract class Bulldozer extends Machine{
    @Override
    public void doWork() {
        System.out.println("Bulldozer has started");
    }
    @Override
    public void stopWork() {
        System.out.println("Bulldozer has stopped");
    }
}