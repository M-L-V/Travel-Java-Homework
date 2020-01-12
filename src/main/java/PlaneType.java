public enum PlaneType {

    GHOPPER( 2, 100),
    BLETCHLEY(2, 60);


    private final int seats;
    private final int reservedWeight;

    private PlaneType(int seats, int reservedWeight){
        this.seats = seats;
        this.reservedWeight = reservedWeight;
    }

    public int getCapacity(){
        return this.seats;
    }

    public int getReservedWeight(){
        return this.reservedWeight;
    }
}
