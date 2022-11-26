package command.implementation;

public class RemoteControlTest {
    public static void main(String[] args) {

        //Waitress
        RemoteControl remote = new RemoteControl();

        //Meal
        Light light = new SimpleLight();
        Stereo stereo = new Stereo();


        //Order
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);

        remote.setCommand(0, lightOnCommand, lightOffCommand);

//        using method reference
//        remote.setCommand(0, light::on, light::off);

        System.out.println(remote);

        remote.onButtonWasPushed(0);
        remote.offButtonWasBushed(0);
        System.out.println(remote);
        remote.undoButtonWasPushed();
        remote.onButtonWasPushed(1);
        remote.offButtonWasBushed(1);
        remote.onButtonWasPushed(2);
        remote.offButtonWasBushed(2);
    }
}
