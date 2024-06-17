package relationship;

public class Passenger {
    private Bus bus;
    private String firstName;
    private String lastName;

    public Passenger(String firstName, String lastName) {
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
        this.bus.takePassenger(this);
    }
}
