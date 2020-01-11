public class Plane {

    private PlaneType planeType;

    public Plane(PlaneType planeType) {
        this.planeType = planeType;
    }


    public PlaneType getPlaneType(){
        return this.planeType;
    }

    public int getSeats(){
        return this.planeType.getCapacity();
    }

    public int getWeight(){
        return this.planeType.getReservedWeight();
    }
}
