public class Pilot {

    private String name;
    private String rank;
    private String pilotLicence;

    public Pilot(String name, String rank, String pilotLicence) {
        this.name = name;
        this.rank = rank;
        this.pilotLicence = pilotLicence;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getPilotLicence() {
        return pilotLicence;
    }

    public void setPilotLicence(String pilotLicence) {
        this.pilotLicence = pilotLicence;
    }

    public String flyPlane(){
        return "Weeeeeee!";
    }
}
