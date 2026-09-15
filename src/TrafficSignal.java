package src;

public class TrafficSignal {
    String color;

    TrafficSignal(){
        this.color= "RED";
    }

    void changeToGreen(){
        color = "GREEN";
    }

    void changeToYellow(){
        color = "YELLOW";
    }

    void changeToRed(){
        color = "RED";
    }

    void displaySignal(){
        System.out.println("Signal: "+ color);
    }
}
