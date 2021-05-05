public class SubContractor extends Worker{
    private int dailyRate;

    public SubContractor(String firstName, String lastName, int dailyRate){
        this.firstName = firstName;
        this.lastName = lastName;
        this.dailyRate = dailyRate;
    }

    public String toString(){
        return this.firstName + " " + this.lastName + "\n€" + this.dailyRate + "/day";
    }
}
