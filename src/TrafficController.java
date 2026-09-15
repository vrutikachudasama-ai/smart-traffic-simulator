package src;

public class TrafficController {
    Road northRoad;
    Road southRoad;
    Road eastRoad;
    Road westRoad;
    int totalVehiclesPassed = 0;

    TrafficController(Road northRoad,Road southRoad,Road eastRoad,Road westRoad){
        this.northRoad=northRoad;
        this.southRoad=southRoad;
        this.eastRoad=eastRoad;
        this.westRoad=westRoad;
    }

    Road findBusiestRoad(){
        Road busiest = northRoad;

        if (southRoad.vehicles.size() > busiest.vehicles.size()) {
            busiest = southRoad;
        }

        if (eastRoad.vehicles.size() > busiest.vehicles.size()) {
            busiest = eastRoad;
        }

        if (westRoad.vehicles.size() > busiest.vehicles.size()) {
            busiest = westRoad;
        }
        return busiest;
    }

    void controlTraffic() {

        northRoad.increaseWaitingTime();
        southRoad.increaseWaitingTime();
        eastRoad.increaseWaitingTime();
        westRoad.increaseWaitingTime();

        Road busiest = findBusiestRoad();

        northRoad.signal.changeToRed();
        southRoad.signal.changeToRed();
        eastRoad.signal.changeToRed();
        westRoad.signal.changeToRed();

        busiest.signal.changeToGreen();

        System.out.println("Green Signal: " + busiest.name);

        if (!busiest.vehicles.isEmpty()) {
        busiest.removeVehicle();
        totalVehiclesPassed++;
        System.out.println("1 vehicle passed from " + busiest.name);
        }

    }
    
}
