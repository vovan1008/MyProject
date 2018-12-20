package сom.company.professions;

public class Person extends Driver {
    private String personType;

    public Person(String fistLastName, int drivingSkill, String personType) {
        super(fistLastName, drivingSkill);
        this.personType = personType;
    }

    public Person(String personType) {
        this.personType = personType;
    }

    public Person() {
    }

    public String getPersonType() {
        return personType;
    }

    public void setPersonType(String personType) {
        this.personType = personType;
    }
}
