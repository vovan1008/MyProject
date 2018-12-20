package lesson8;

public class Aspirant extends Student {
    private String sciWork;

    public Aspirant(String firstName, String lastName, String group, double avgMark, String sciWork) {
        super(firstName, lastName, group, avgMark);
        this.sciWork = sciWork;
    }

    public Aspirant(String sciWork) {
        this.sciWork = sciWork;
    }

    public Aspirant() {

    }

    public String getSciWork() {
        return sciWork;
    }

    public void setSciWork(String sciWork) {
        this.sciWork = sciWork;
    }

    public int getScollarship() {
        return getAvgMark() == 5 ? 200 : 180;
    }

    public static void main(String[] args) {
        Student student = new Student("Ivan", "Petrov", "group1", 2);
        Student aspirant1 = new Aspirant("Nikita", "Dekar", "KITВм-18-1", 2, "Work123");
        Aspirant aspirant2 = new Aspirant("Vova", "Kudinov", "КІТПВм-18-1", 5, "LOLeeNet");
        Student[] students = {student, aspirant1, aspirant2};
        System.out.println(student.getFirstName() + " "+student.getLastName()+" "+student.getGroup()+" "+student.getAvgMark());
        System.out.println(aspirant1.getFirstName() + " " + aspirant1.getLastName()
                + " " + aspirant1.getGroup() + " " + aspirant1.getAvgMark()+" "+((Aspirant) aspirant1).getSciWork());
        System.out.println(aspirant2.getFirstName() + " " + aspirant2.getLastName()
                + " " + aspirant2.getGroup() + " " + aspirant2.getAvgMark() + " " + aspirant2.getSciWork());

        for (Student st : students) {
            System.out.println(st.getLastName() + " " + st.getScollarship());
        }
    }
}
