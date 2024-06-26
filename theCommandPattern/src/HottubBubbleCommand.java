public class HottubBubbleCommand implements Command {
    Hottub hottub;

    public HottubBubbleCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    public void execute() {
        hottub.bubble();
    }

    public void undo() {

    }
}
