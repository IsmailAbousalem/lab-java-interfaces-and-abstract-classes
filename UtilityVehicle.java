public class UtilityVehicle extends Car{
    private boolean fourWheelDrive;

    public UtilityVehicle(String vinNumber, String make, int mileage, String model, boolean fourWheelDrive) {
        super(vinNumber, make, mileage, model);
        this.fourWheelDrive = fourWheelDrive;
    }

    public boolean isFourWheelDrive() {
        return fourWheelDrive;
    }

}
