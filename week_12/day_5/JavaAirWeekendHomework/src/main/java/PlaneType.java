public enum PlaneType {
    AIRBUS_A380(853, 560.00),
    BOEING_757(200, 99.790),
    CESSNA_CARAVAN(14, 3.985);

    private int capacity;
    private double totalWeight;

    PlaneType(int capacity, double totalWeight){
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getCapacity(){
        return this.capacity;
    }
}
