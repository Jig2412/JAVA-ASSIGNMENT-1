import java.util.Arrays;
public class CampusRegistry{
    private Person[] people;
     private int size;
     CampusRegistry(int capacity){
        this.people = new Person[capacity];
         this.size = 0;
     }
     public void addPerson(Person person){
        if(size<people.length){
            people[size]=person;
            size++;
            
        }
        
     }
     public Person searchByName(String name) {
    for (int i = 0; i < size; i++) {
        if (people[i].getName().equalsIgnoreCase(name)) {
            return people[i];
        }
    }
    return null;
}
public int countStudents() {
    int count = 0;

    for (int i = 0; i < size; i++) {
        if (people[i] instanceof Student) {
            count++;
        }
    }

    return count;
}
public void displayRoles() {
    for (int i = 0; i < size; i++) {
        System.out.println(people[i].getRole() + ": " + people[i].getName());
    }
}
public void showStudentMarks() {
    for (int i = 0; i < size; i++) {
        if (people[i] instanceof Student) {
            Student s = (Student) people[i];
            System.out.println(Arrays.toString(s.getMarks()));
        }
    }
}

}
