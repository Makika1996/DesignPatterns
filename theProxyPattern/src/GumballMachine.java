import java.rmi.server.UnicastRemoteObject;

class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote {
    private String location;
    private int count;
    private State state;

    public GumballMachine(String location, int count) {
        this.location = location;
        this.count = count;
        this.state = count > 0 ? State.WAITING_FOR_QUARTER : State.SOLD_OUT;
    }

    public String getLocation() {
        return location;
    }

    public int getCount() {
        return count;
    }

    public State getState() {
        return state;
    }

    // Other methods to manage state transitions would go here

    public enum State {
        SOLD_OUT, WAITING_FOR_QUARTER, HAS_QUARTER, SOLD;
    }
}