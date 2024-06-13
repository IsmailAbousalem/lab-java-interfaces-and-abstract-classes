public abstract class Car {
    private String vinNumber;
    private String make;
    private String model;
    private int mileage;


    public Car(String vinNumber, String make, int mileage, String model) {
        this.vinNumber = vinNumber;
        this.make = make;
        this.mileage = mileage;
        this.model = model;
    }

    public String getVinNumber() {
        return vinNumber;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getMileage() {
        return mileage;
    }

    public String getInfo() {
        return String.format("VIN: " + vinNumber + ", Make: " + make + ", Model: " + model + ", Mileage: " + mileage);
    }
}
