import javax.swing.*;

public class BeatBar extends JProgressBar {
    public BeatBar() {
        super (0, 100);
        setValue(0);
    }
}
