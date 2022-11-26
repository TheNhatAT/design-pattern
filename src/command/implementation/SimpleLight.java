package command.implementation;

public class SimpleLight extends Light{
    @Override
    public void on() {
        System.out.println("Simple Light on!!!");
    }

    @Override
    public void off() {
        System.out.println("Simple Light off!!!");
    }
}
