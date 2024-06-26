public class Hottub {
    String location;
    boolean on;
    int temperature;

    public Hottub(String location) {
        this.location = location;
        this.on = false;
        this.temperature = 98; // Default temperature
    }

    public void on() {
        System.out.println(location + " Hot Tub is on");
        this.on = true;
    }

    public void off() {
        System.out.println(location + " Hot Tub is off");
        this.on = false;
    }

    public void heat() {
        this.temperature = 104;
        System.out.println(location + " Hot Tub is heating to a steaming 104 degrees");
    }

    public void bubble() {
        System.out.println(location + " Hot Tub is bubbling!");
    }

    public void cool() {
        this.temperature = 98;
        System.out.println(location + " Hot Tub is cooling to 98 degrees");
    }

    public int getTemperature() {
        return temperature;
    }

    public boolean isOn() {
        return on;
    }
}
