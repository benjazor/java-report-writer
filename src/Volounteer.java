public class Volounteer extends Worker {
    Volounteer(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String toString(){
        return this.firstName + " " + this.lastName + "\nLife is beautiful!";
    }
}
