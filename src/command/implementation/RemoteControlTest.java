package command.implementation;

public class RemoteControlTest {
    public static void main(String[] args) {

        //Waitress
        SimpleRemoteControl remote = new SimpleRemoteControl();

        //Meal
        Light light = new SimpleLight();

        //Order
        LightOnCommand lightOnCommand = new LightOnCommand(light);

        remote.setCommand(lightOnCommand);
        remote.buttonWasPressed();
    }
}
