public class Student {
    private String name;
    private String id;
    private int grade;

    public Student(String name) {
        this.name = name;
        this.grade = 10;
        this.id = generateId();
    }

    public String generateId() {
        int firstId = (int) (Math.random() * (899 - 100 + 1) + 100);
        int secondId = (int) (Math.random() * (9999 - 1000 + 1) + 1000);
        return firstId + "-" + secondId;
    }

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
        this.id = generateId();
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = "Jack";
    }

    public String getId() {
        return id;
    }

    public void setId(String newId) {
        this.id = id;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int newGrade) {
        this.grade = grade;
    }

    public String toString() {
        return name + " is in grade " + grade + " and has id " + id + ".";
    }

    public boolean equals(Student other) {
        if (name.equals(other.name) && id.equals(other.id) && grade == other.grade) {
            return true;
        } else {
            return false;
        }

    }
}
