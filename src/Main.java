package src;

public class Main {
    public static void main(String[] args) {
        Road northRoad=new Road("North");
        Road southRoad=new Road("South");
        Road eastRoad=new Road("East");
        Road westRoad=new Road("West");

        northRoad.addVehicle(new Vehicle(101,"Car"));
        northRoad.addVehicle(new Vehicle(102,"Car"));

        southRoad.addVehicle(new Vehicle(103,"Car"));

        eastRoad.addVehicle(new Vehicle(104,"Car"));
        eastRoad.addVehicle(new Vehicle(105,"Car"));
        eastRoad.addVehicle(new Vehicle(106,"Car"));
        eastRoad.addVehicle(new Vehicle(107,"Car"));

        westRoad.addVehicle(new Vehicle(108,"Car"));
        
        TrafficController controller=new TrafficController(northRoad,southRoad,eastRoad,westRoad);
        for (int i = 1; i <= 5; i++) {
            System.out.println("Cycle " + i);

            if (i == 2) {
                eastRoad.addVehicle(new Vehicle(109, "Car"));
            }

            if (i == 3) {
                southRoad.addVehicle(new Vehicle(110, "Car"));
            }

            if (i == 4) {
                 westRoad.addVehicle(new Vehicle(111, "Car"));
            }

            controller.controlTraffic();

            System.out.println("North waiting time: " + northRoad.vehicles.stream().mapToInt(v -> v.waitingTime).sum());
            System.out.println("South waiting time: " + southRoad.vehicles.stream().mapToInt(v -> v.waitingTime).sum());
            System.out.println("East waiting time: " + eastRoad.vehicles.stream().mapToInt(v -> v.waitingTime).sum());
            System.out.println("West waiting time: " + westRoad.vehicles.stream().mapToInt(v -> v.waitingTime).sum());
            }
            System.out.println("\n--- Final Statistics ---");
            System.out.println("Total vehicles passed: " + controller.totalVehiclesPassed);
            System.out.println("North vehicles remaining: " + northRoad.vehicles.size());
            System.out.println("South vehicles remaining: " + southRoad.vehicles.size());
            System.out.println("East vehicles remaining: " + eastRoad.vehicles.size());
            System.out.println("West vehicles remaining: " + westRoad.vehicles.size());
    }
}
