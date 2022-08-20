/**
 * Julia Delightly
 * CSD405
 * Professor Payne
 * Module 1 Assignment
 * 
 * This program will create two instances of the Fan class, one using the 
 * default constructor and the other using the argument constructor
 * 
 */
public class Fan {
    final int STOPPED = 0;
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed = STOPPED;
    private boolean on;
    private int radius = 6;
    private String color = "white";

    //getter methods
    public int getSpeed() {
        return this.speed;
    }

    public boolean getOn() {
        return this.on;
    }

    public int getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }

    //setter methods
    public void setSpeed(int spd) {
        this.speed = spd;
    }

    public void setOn(boolean isOn) {
        this.on = isOn;
    }

    public void setRadius(int rad) {
        this.radius = rad;
    }

    public void setColor(String col) {
        this.color = col;
    }

    //default constructor
    public Fan() {
        speed = STOPPED;
        on = false;
        radius = 6;
        color = "white";
    }

    //constructor taking arguments
    public Fan(int spd, boolean isOn, int rad, String col) {
        this.speed = spd;
        this.on = isOn;
        this.radius = rad;
        this.color = col;
    }

    public String toString() {
        //translate the boolean on to a string on/off
        String isOn = "";
        if(this.on == true){
            isOn = "On";
        }else{
            isOn = "Off";
        }

        //the string to hold the status
        String status = "";
        status += ("The current status of the fan is: ");
        status += ("\nOn/Off: " + isOn);
        status += ("\nSpeed Setting: " + this.speed);
        status += ("\nRadius Size: " + this.radius + " inches");
        status += ("\nColor: " + this.color);
        return status;
    }


    public static void main(String [] args){
        //space
        System.out.println("\n");

        //create and print the default fan
        Fan fan = new Fan();
        System.out.println("Default Fan: ");
        System.out.println(fan);

        //space
        System.out.println("\n");

        //create and print a custom fan
        Fan fanTwo = new Fan(4, true, 10, "pink");
        System.out.println("Custom Fan: ");
        System.out.println(fanTwo);

        //space
        System.out.println("\n");

        //test getter methods
        System.out.println("Fan Status Using Only Getter Methods:");
        System.out.println("The fan is on: " + fan.getOn());
        System.out.println("Speed setting: " + fan.getSpeed());
        System.out.println("Size: " + fan.getRadius()+ " inches");
        System.out.println("Color: " + fan.getColor());

        //test setter methods
        fan.setOn(true);
        fan.setSpeed(3);
        fan.setRadius(8);
        fan.setColor("blue");

         //space
        System.out.println("\n");
        
        //test getters and new values
        System.out.println("Fan Status After Setter Methods:");
        System.out.println("The fan is on: " + fan.getOn());
        System.out.println("Speed setting: " + fan.getSpeed());
        System.out.println("Size: " + fan.getRadius()+ " inches");
        System.out.println("Color: " + fan.getColor());
        System.out.println("\n");
    }
}
