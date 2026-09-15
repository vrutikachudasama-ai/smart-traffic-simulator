package src;

public class Vehicle {
   
    int vehicleId;
    String type;
    int waitingTime;

    Vehicle(int vehicleId,String type){
        this.vehicleId=vehicleId;
        this.type=type;
        this.waitingTime=0;
    }

    void displayVehicle(){
        System.out.println("Vehicle ID: "+vehicleId);
        System.out.println("Type: "+type);
        System.out.println("Waiting Time: "+waitingTime);
    }

}


