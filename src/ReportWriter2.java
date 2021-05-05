import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ReportWriter2 {
    private String title;
    public ArrayList<Worker> workers;

    public ReportWriter2(String title){
        this.title = title;
        this.workers = new ArrayList<>();
    }

    public String toStringt() {
        String result = "";
        result += this.title + "\n";
        for (int i = 0; i<title.length(); i++){
            result += "-";
        }
        result += "\n";
        int i = 0;
        for (Worker worker : workers){
            i++;
            result += "\n" + worker.toString() + "\n" + ((i%2==0) ? "\n\tConsume more, and you will so much more happy!\n" : "");
        }
        result += ((i%2==0) ? "" : "\n\tConsume more, and you will so much more happy!");
        return result;
    }

    public void write() throws IOException{
        File report = new File("report.txt");

        FileWriter writeReport = new FileWriter(report);
        writeReport.write(this.toStringt());
        writeReport.close();

    }
}
