/**
 * Name:  Robert Parson
 * Date:  10-21-15
 * Course Number:  45180
 * Section:  1
 */
import java.util.concurrent.*;

public class Vehicle implements Runnable
{
    //private variables
    private String name;
    private Bridge bridge;
    public Vehicle(Bridge bridge)
    {
        this.bridge = bridge;  //assigns value of parameter bridge to variable with same name
    }
    //method that is implemented when there is a Runnable interface
    public void run()
    {
        bridge.crossBridge(this);
    }
    //get method for vehicle name
    public String getName()
    {
        return name;
    }
    //set method for vehicle name
    public void setName(String name)
    {
            this.name = name;
    }
}
