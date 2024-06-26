public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

        CeilingFan ceilingFan = new CeilingFan("Living Room");
        GarageDoor garageDoor = new GarageDoor("Main Garage");
        TV livingRoomTV = new TV("Living Room");

        CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garageDoor);
        GarageDoorCloseCommand garageDoorClose = new GarageDoorCloseCommand(garageDoor);

        TVOnCommand tvOn = new TVOnCommand(livingRoomTV);
        TVOffCommand tvOff = new TVOffCommand(livingRoomTV);

        remoteControl.setCommand(0, ceilingFanOn, ceilingFanOff); // Slot 0 for ceiling fan
        remoteControl.setCommand(1, garageDoorOpen, garageDoorClose); // Slot 1 for garage door
        remoteControl.setCommand(2, tvOn, tvOff); // Slot 2 for TV

        System.out.println(remoteControl);

        // Testing individual commands
        System.out.println("--- Pushing CeilingFan On---");
        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.undoButtonWasPushed();

        System.out.println("--- Pushing GarageDoor Close---");
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.undoButtonWasPushed();

        System.out.println("--- Pushing Living Room TV On---");
        remoteControl.onButtonWasPushed(2);
        System.out.println("--- Pushing Living Room TV Off---");
        remoteControl.offButtonWasPushed(2);
    }
}
