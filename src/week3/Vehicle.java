package week3;

public class Vehicle {
    private final double BYCICLE_PRICE = 1;
    private final double ELECTRIC_BYCICLE_PRICE = 3;
    private final double MOTOR_BYCICLE_PRICE = 5;

    private final String BYCICLE_NAME = "dap";
    private final String ELECTRIC_BYCICLE_NAME = "dien";
    private final String MOTOR_BYCICLE_NAME = "may";

    private double priceFactor = 1.5;

    private String vehicleType;
    private double vehiclePrice;
    private String location;

    public Vehicle() {
    }

    public Vehicle(String vehicleType) {
        this.vehicleType = vehicleType;
        setSpecialPrice(vehicleType);
    }

    public Vehicle(String vehicleType, String location) {
        this.vehicleType = vehicleType;
        this.location = location;
        setSpecialPrice(vehicleType);
    }

    private void setVehiclePrice(double vehiclePrice) {
        this.vehiclePrice = vehiclePrice;
    }

    private void setSpecialPrice(String vehicleType) {
        boolean isSpecialLocation = this.location !=null;
        switch (vehicleType) {
            case BYCICLE_NAME:
                setVehiclePrice(isSpecialLocation ? BYCICLE_PRICE * priceFactor : BYCICLE_PRICE);
                break;
            case ELECTRIC_BYCICLE_NAME:
                setVehiclePrice(isSpecialLocation ? ELECTRIC_BYCICLE_PRICE * priceFactor : ELECTRIC_BYCICLE_PRICE);
                break;
            case MOTOR_BYCICLE_NAME:
                setVehiclePrice(isSpecialLocation ? MOTOR_BYCICLE_PRICE * priceFactor : MOTOR_BYCICLE_PRICE);
                break;
        }
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public double getVehiclePrice() {
        return vehiclePrice;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
