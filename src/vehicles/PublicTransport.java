import java.util.List;

package vehicles;

import passengers.Passenger;
import routes.Route;
import stops.Stop;

public class PublicTransport {

    int id, capacity;

    Route route;

    public PublicTransport(int id, int capacity, Route route){

        this.id = id;
        this.capacity = capacity;
        this.route = route;
    }
    public Route getRoute(){

        return this.route;
    }
    public int getId(){

        return this.id;
    }
    public Stop getCurrentStop(){

    }
    public int passengerCount(){


    }
    public int getCapacity(){

        return this.capacity;
    }
    public String getType(){


    }
    public List<Passenger> getPassengers(){

    }
    public void addPassenger(Passenger passenger)
            throws OverCapacityException{


    }
    public boolean removePassenger(Passenger passenger){

    }
    public List<Passenger> unload(){

    }
    public void travelTo(Stop stop){

    }
    @Override;
    public String toString(){

    }




}
