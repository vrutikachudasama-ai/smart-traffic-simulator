package src;

import java.util.LinkedList;
import java.util.Queue;

public class Road {
        String name;
        Queue<Vehicle> vehicles;
        TrafficSignal signal;

        Road(String name){
            this.name=name;
            this.vehicles=new LinkedList<>();
            this.signal=new TrafficSignal();
        }

        void addVehicle(Vehicle vehicle){
            vehicles.add(vehicle);
        }

        void removeVehicle(){
            if (!vehicles.isEmpty()) {
                vehicles.remove();
            }
        }

        void displayVehicles(){
            System.out.println("Road: "+ name);
            System.out.println("Vehicles waiting: "+ vehicles.size());
        }
        void increaseWaitingTime() {
            for (Vehicle vehicle : vehicles) {
                vehicle.waitingTime++;
            }
        }
}
