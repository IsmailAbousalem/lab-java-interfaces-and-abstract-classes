public class Truck extends Car {
    private double towingCapacity;

    public Truck(String vinNumber, String make, int mileage, String model, double towingCapacity) {
        super(vinNumber, make, mileage, model);
        this.towingCapacity = towingCapacity;
    }

    public double getTowingCapacity() {
        return towingCapacity;
    }

}
