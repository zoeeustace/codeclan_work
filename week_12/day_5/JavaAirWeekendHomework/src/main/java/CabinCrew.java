public class CabinCrew {
    private String name;
    private CabinCrewRank rank;

    public CabinCrew(String name, CabinCrewRank rank) {
        this.name = name;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CabinCrewRank getRank() {
        return rank;
    }

    public void setRank(CabinCrewRank rank) {
        this.rank = rank;
    }

    public String relayMessages(){
        return "Chicken or beef?";
    }
}
