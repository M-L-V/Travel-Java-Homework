public enum PlaneType {

    GHOPPER(4, 100),
    BLETCHLEY(2, 60);


    private final int capacity;
    private final int reservedWeight;

    private PlaneType(int capacity, int reservedWeight){
        this.capacity = capacity;
        this.reservedWeight = reservedWeight;
    }


}
