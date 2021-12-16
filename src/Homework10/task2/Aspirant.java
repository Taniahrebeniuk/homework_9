package Homework10.task2;

public class Aspirant extends Student {
    String work;

    public Aspirant(String firstName, String lastName, String group, double avgMark, String work) {
        super(firstName, lastName, group, avgMark);
        this.work = work;
    }

    @Override
    public double getScholarship() {
        return avgMark == 5.0 ? 250 : 150;
    }

    void print() {
        System.out.println(firstName);
    }

    public static void main(String[] args) {
        Student student = new Student("John", "Lennon",
                "Group1", 4.3);

        Aspirant aspirant1 = new Aspirant("George", "Harrison",
                "Group2", 4.5, "Rock culture as a musical trend");

        Student aspirant2 = new Aspirant("Ringo", "Starr",
                "Group3", 5.0, "Music as an object of scientific research");

        Student[] students ={student, aspirant1, aspirant2};
        for(Student s:students){
            System.out.println(s.getScholarship());

        }
    }
}
