public class Plane {

    private PlaneType planeType;

    public Plane(PlaneType planeType) {
        this.planeType = planeType;
    }

    public Object getPlaneType(){
        return this.planeType;
    }

    public int getSeats(){
        return this.planeType.getCapacity();
    }

    public int getWeight(){
        return this.planeType.getReservedWeight();
    }
}
