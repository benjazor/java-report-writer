public class Employee extends Worker{
    private int monthlySalary;
    private int remainingHoliday;

    public Employee(String firstName, String lastName, int monthlySalary, int remainingHoliday){
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthlySalary = monthlySalary;
        this.remainingHoliday = remainingHoliday;
    }

    public String toString(){
        return this.firstName + " " + this.lastName + "\n€" + this.monthlySalary + "/month, " + this.remainingHoliday + " day" + ((this.remainingHoliday == 0) ? "" : "s");
    }
}
