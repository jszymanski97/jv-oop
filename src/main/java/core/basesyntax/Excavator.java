package core.basesyntax;

public abstract class Excavator extends Machine{
    @Override
    public void doWork() {
        System.out.println("Excavator has started");
    }

    @Override
    public void stopWork() {
        System.out.println("Excavator has stopped");
    }
}