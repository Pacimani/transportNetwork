package passengers;

import stops.Stop;

public class Passenger {

    protected String name;

    Stop destination = null;

    public Passenger(String name){

        this.name = name;

    }
    public Passenger(String name, Stop destination){

        this.name = name;
        this.destination = destination;


    }
    public String getName(){

        return this.name;


    }
    public void setDestination(Stop destination){

        this.destination = destination;
    }
    public Stop getDestination(){

        return this.destination;
    }

    @Override;
    public String toString(){


    }

}
