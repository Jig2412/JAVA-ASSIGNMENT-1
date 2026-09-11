public class CampusManagementApp {
     public static void main(String[] args) {

        CampusRegistry registry = new CampusRegistry(5);

        Student s1 = new Student("Rahul", new int[]{80, 75, 90});
        Student s2 = new Student("Aman", new int[]{70, 85, 78}) ;
        Student s3 = new Student("Riya", new int[]{92, 88, 95});

        Instructor i1 = new Instructor("Ankit");
        Coach c1 = new Coach("Vikas");

        registry.addPerson(s1);
        registry.addPerson(s2);
        registry.addPerson(s3);
        registry.addPerson(i1);
        registry.addPerson(c1);

        System.out.println(registry.searchByName("Rahul"));
        System.out.println("Students: " + registry.countStudents());

        registry.displayRoles();
        registry.showStudentMarks();
    }
    
}
