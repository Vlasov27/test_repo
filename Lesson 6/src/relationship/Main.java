package relationship;

public class Main {
    public static void main(String[] args) {

        Bus bus = new Bus(56);
        Driver driver = new Driver("Оля", "Власова");
        Passenger p1 = new Passenger("Vlasov", "Maksim");
        Passenger p2 = new Passenger("Vlasov", "Artem");
        Passenger p3 = new Passenger("Vlasov", "Andrei");
        Passenger p4 = new Passenger("Vlasov", "Pavel");
        Passenger p5 = new Passenger("Vlasov", "Oleg");
        Passenger p6 = new Passenger("Vlasova", "Ksenia");


        p1.goToBus(bus);
        p2.goToBus(bus);
        p3.goToBus(bus);
        p4.goToBus(bus);
        p5.goToBus(bus);
        p6.goToBus(bus);

        driver.goToBus(bus);

        driver.drive();


    }
}
