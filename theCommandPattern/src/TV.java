public class TV {
    private String location;
    private boolean on;

    public TV(String location) {
        this.location = location;
        this.on = false;
    }

    public void on() {
        System.out.println(location + " TV is on");
        this.on = true;
    }

    public void off() {
        System.out.println(location + " TV is off");
        this.on = false;
    }

    public boolean isOn() {
        return on;
    }

    public String getLocation() {
        return location;
    }
}
