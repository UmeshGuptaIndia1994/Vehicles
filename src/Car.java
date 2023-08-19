
public class Car extends Vehicle {
    private int wheels;
    private String type;
    private int doors;
    private int gears;
    private boolean isManual;
    private int currentGear;
    private int seats;

    public int getDoors(){
        return this.doors;
    }
    public int getWheels(){
        return this.wheels;
    }
    public int getGears(){
        return this.wheels;
    }

    public boolean isManual(){
        return this.isManual;
    }
    public String getType(){
        return this.type;
    }
    public int getCurrentGear(){
        return this.currentGear;
    }
    public int getSeats(){
        return this.seats;
    }
    public void setWheels(int wheels){
        this.wheels=wheels;
    }
    public void setType(String type){
        this.type=type;
    }
    public void setDoors(int doors){
        this.doors=doors;
    }
    public void setGears(int gears){
        this.gears=gears;
    }
    public void setManual(boolean manual){
        isManual=manual;
    }
    public void setCurrentGear(int currentGear){
        this.currentGear=currentGear;
    }
    public void setSeats(int seats){
        this.seats=seats;
    }

    public Car(String name, boolean isManual) {
        super(name);
        this.isManual = isManual;
    }

    public Car(String name, int wheels, int doors, int gears, boolean isManual, String type) {
        //Hint: Car extends Vehicle
        super(name);
        this.wheels=wheels;
        this.doors=doors;
        this.gears=gears;
        this.isManual=isManual;
        this.type=type;
        this.currentGear=1;
    }
    public Car(String name, int wheels, int doors, int gears, boolean isManual, String type,int seats) {
        //Hint: Car extends Vehicle
        super(name);
        this.wheels=wheels;
        this.doors=doors;
        this.gears=gears;
        this.isManual=isManual;
        this.type=type;
        this.currentGear=1;
        this.seats=seats;
    }

    public void changeGear(int newGear){
        this.currentGear=newGear;
        System.out.println("changeGear method called - The gear is changed to: " + currentGear);
    }

    public void changeSpeed(int newSpeed, int newDirection){
        super.move(newSpeed,newDirection);
        System.out.println("changeSpeed method called - The speed is changed to: " + newSpeed + ", and the direction is changed to: " + newDirection + " degrees");
    }
}