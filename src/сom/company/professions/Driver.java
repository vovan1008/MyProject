package сom.company.professions;

public class Driver {
    private String fistLastName;
    private int drivingSkill;

    public Driver(String fistLastName, int drivingSkill) {
        this.fistLastName = fistLastName;
        this.drivingSkill = drivingSkill;
    }

    public Driver() {
    }

    public String getFistLastName() {
        return fistLastName;
    }

    public void setFistLastName(String fistLastName) {
        this.fistLastName = fistLastName;
    }

    public int getDrivingSkill() {
        return drivingSkill;
    }

    public void setDrivingSkill(int drivingSkill) {
        this.drivingSkill = drivingSkill;
    }
}
