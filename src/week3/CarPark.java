package week3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class CarPark {
    /*
     * Bac bao ve:
     *   may: xe may
     *   dap: xe dap thuong
     *   dien: xe dap dien
     *
     *   Input: may dap dap may dien may dap
     *   Output: tong tien thu duoc
     *   Edge cases: het cho giu xe  -> capability
     *
     * */


    public static void main(String[] args) {

        // Nhap loai xe vao bai giu xe
        List<String> locations = Arrays.asList("q1", "q2", "q3");

        List<Vehicle> vehicles = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean isContinuing = true;
        double totalMoneyAmount = 0.0;
        boolean hasLocation = false;
        String currentLocation;

        while(!hasLocation){
            System.out.println("Set location: ");
            currentLocation = scanner.nextLine();
            if(locations.contains(currentLocation))
                hasLocation = true;

        }

        System.out.println("Nhap loai xe:....");
        while (isContinuing) {
            String vehicleType = scanner.nextLine();
            if (vehicleType.equals("may") ||
                    vehicleType.equals("dap") ||
                    vehicleType.equals("dien")) {
                Vehicle vehicle = new Vehicle();
                if (hasLocation){
                    vehicle = new Vehicle(vehicleType, "q1");
                } else {
                    vehicle = new Vehicle(vehicleType);
                }
                vehicles.add(vehicle);
            } else {
                System.out.println("Xe gi vay teo oi...");
            }

            // Bai giu xe is full
            if(vehicles.size() == 5)
                isContinuing = false;
        }

        // Tinh tong so tien
        if(vehicles.isEmpty()){
            System.out.println("Hom nay e qua!!!");
        } else {
            for (Vehicle vehicle : vehicles){
                totalMoneyAmount += vehicle.getVehiclePrice();
            }

            System.out.printf("Total: %f", totalMoneyAmount * 1000);
        }


    }
}
