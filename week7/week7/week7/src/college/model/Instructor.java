package college.model;

public class Instructor extends Person {

    @Override
    public void describeRole() {
        System.out.println("I am an Instructor");
    }

    public void conductClass() {
        System.out.println("Instructor is conducting class");
    }
}