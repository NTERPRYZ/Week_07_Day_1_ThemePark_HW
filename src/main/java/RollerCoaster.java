public class RollerCoaster extends Ride{

    public RollerCoaster(int price, double minHeight, double maxHeight, int age) {
        super(price, minHeight, maxHeight, age);
    }

    public String rideGoal(String goal){
        return "This ride will " + goal;
    }
}

