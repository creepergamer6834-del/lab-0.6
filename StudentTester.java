public class StudentTester {
    public static void main(String[] args) {
        Student a = new Student("John", 10);
        System.out.println(a.toString());
        System.out.println("Equal: " + a.equals(a));
        Student b = new Student("Jane", 11);
        System.out.println(b.toString());
        System.out.println("Grade: " + b.getGrade());
        System.out.println("Id: " + b.getId());
        System.out.println("Equal: " + b.equals(a));
        Student c = new Student("Jack", 12);
        System.out.println("Name: " + c.getName());
        System.out.println("Grade: " + c.getGrade());
        System.out.println("Id: " + c.getId());
        System.out.println("Equal: " + c.equals(b));
        Student d = new Student("Peter", 9);
        System.out.println("Name: " + d.getName());
        System.out.println("Grade: " + d.getGrade());
        System.out.println("Id: " + d.getId());
        System.out.println("Equal: " + d.equals(a));
    }
}
