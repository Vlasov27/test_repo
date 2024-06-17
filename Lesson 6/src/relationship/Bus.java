package relationship;

public class Bus {
    private int number;
    private Driver driver;

    private Passenger pass[];
    private int passengersCount;
    private Passenger passenger;

    public Bus(int number) {
        this.number = number;
        this.pass = new Passenger[10];
    }

    public void takePassenger(Passenger passenger) {
        this.pass[passengersCount] = passenger;
        this.passengersCount++;
    }

    public void takeDriver(Driver driver) {
        this.driver = driver;
    }

    public void go() {
        System.out.println("Автобус " + this.number + " поехал!");

        System.out.println("Водитель " + driver.getFirstName() + " " + driver.getLastName() + " приветствует Вас!");

        for (int i = 0; i < passengersCount; i++) {
            System.out.println(pass[i].getFirstName() + " " + pass[i].getLastName() + " я поехал");
        }
    }
}
