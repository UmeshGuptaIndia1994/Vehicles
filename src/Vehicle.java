
public class Vehicle {
    private String name;
    private int currentSpeed;
    private int currentDirection;

    public Vehicle(String name) {
        this.name=name;
        this.currentSpeed = 0;
        this.currentDirection = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void setCurrentDirection(int currentDirection) {
        this.currentDirection = currentDirection;
    }

    public void steer(int direction){
        //direction is in degrees, add it to the current direction
        this.currentDirection+=direction;
        System.out.println("steer method called - The direction is changed to: " + currentDirection + " degrees");
    }

    public void move(int speed, int direction){
        //set the values of currentSpeed and currentDirection
        this.currentDirection=direction;
        this.currentSpeed=speed;
        System.out.println("move method called - The speed is changed to: " + currentSpeed + ", and the direction is changed to: " + currentDirection + " degrees");
    }

    public void stop(){
        this.currentSpeed=0;
        System.out.println("stop method called - The vehicle is stopped");
    }

}