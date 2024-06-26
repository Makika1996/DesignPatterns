public class HottubHeatCommand implements Command {
    Hottub hottub;

    public HottubHeatCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    public void execute() {
        hottub.heat();
    }

    public void undo() {
        hottub.cool();
    }
}
