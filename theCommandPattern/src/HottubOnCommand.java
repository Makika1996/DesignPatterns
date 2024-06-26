public class HottubOnCommand implements Command {
    Hottub hottub;

    public HottubOnCommand(Hottub hotTub) {
        this.hottub = hotTub;
    }

    public void execute() {
        hottub.on();
    }

    public void undo() {
        hottub.off();
    }
}
