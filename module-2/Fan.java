/**
 * Julia Delightly
 * CSD405
 * Professor Payne
 * Module 2 Assignment
 * 
 * Module 1 recap: This program will create two instances of the Fan class, one 
 * using the default constructor and the other using the argument constructor
 * 
 * Module 2: This program will create a UseFans class and display the 
 * functionality of all of the Fan instances in the collection
 * 
 */

//import ArrayList statement
import java.util.ArrayList;

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

        //fans for the collection
        Fan fanThree = new Fan(2, true, 6, "purple");
        Fan fanFour = new Fan(5, true, 12, "yellow");
        Fan fanFive = new Fan(0, false, 5, "gray");

        //creating the collection to put the fans in
        ArrayList<Fan> fans = new ArrayList<Fan>();
        fans.add(fanThree);
        fans.add(fanFour);
        fans.add(fanFive);

        //Print instances from collection
        UseFans.displayFans(fans);

        //Print instance of only one fan 
        UseFans.displayFan(fanTwo);
         
        //space
        System.out.println("\n");
        
        /**Module 1 specific methods**/
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

//UseFans Class
class UseFans {
        
    //method to display a collection of fans
    public static void displayFans(ArrayList<Fan> fans) {
        for(int i = 0; i < fans.size(); i++){
            String isOn = "";
            if(fans.get(i).getOn() == true){
                isOn = "On";
            }else{
                isOn = "Off";
            }

            System.out.println("\n\nFan Status (From Collection): ");
            System.out.println("On/Off: " + isOn);
            System.out.println("Speed Setting: " + fans.get(i).getSpeed());
            System.out.println("Radius Size: " + fans.get(i).getRadius() + " inches");
            System.out.println("Color: " + fans.get(i).getColor());
        }
    }

    //method to display one fan
    public static void displayFan(Fan fan) {
        String isOn = "";
        if(fan.getOn() == true){
            isOn = "On";
        }else{
            isOn = "Off";
        }

        System.out.println("\n\nFan Status (As A Single Instance): ");
        System.out.println("On/Off: " + isOn);
        System.out.println("Speed Setting: " + fan.getSpeed());
        System.out.println("Radius Size: " + fan.getRadius() + " inches");
        System.out.println("Color: " + fan.getColor());
    }
}
