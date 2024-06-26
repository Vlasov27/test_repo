package relationship;

public class Driver {
    private Bus bus;
    private String firstName;
    private String lastName;

    public Driver(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void goToBus(Bus bus) {
        this.bus = bus;
        this.bus.takeDriver(this);
    }
    public void drive() {
        this.bus.go();
    }
}
