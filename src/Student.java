public class Student extends Worker{
    private String school;

    public Student(String firstName, String lastName, String school){
        this.firstName = firstName;
        this.lastName = lastName;
        this.school = school;
    }

    public String toString(){
        return this.firstName + " " + this.lastName + "\n" + this.school;
    }
}
