import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
	    ReportWriter2 report = new ReportWriter2("Great Report");
	    report.workers.add(new Employee("Steve", "Jobs",2000, 20));
	    report.workers.add(new Employee("Warren", "Buffet",999999999, 365));
	    report.workers.add(new Student("Bill", "Gates", "Supinfo"));
	    report.workers.add(new SubContractor("Donald", "Trump", 15));
        report.workers.add(new Student("Mickey", "Mouse", "Cheese"));
        report.workers.add(new Student("Donald", "Duck", "Pound"));
        report.workers.add(new Employee("Terry", "Davids",666, 999));
        report.workers.add(new SubContractor("Hillary", "Clinton", 1));
        report.workers.add(new Volounteer("Ronflex", "Pokémon"));
        report.workers.add(new Volounteer("Pickachu", "Pokémon"));



        System.out.print(report.toStringt());
        report.write();
    }
}
