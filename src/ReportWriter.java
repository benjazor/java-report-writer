import com.sun.deploy.util.StringUtils;

import java.io.*;
import java.util.*;

public class ReportWriter {
    private String title;
    public ArrayList<Worker> workers;

    public ReportWriter(String title){
        this.title = title;
        this.workers = new ArrayList<>();
    }

    public String toStringt() {
        //  The String that we are going to return
        String result = "";

        //  Add the Title
        result += this.title + "\n";

        //  Add the Bar
        for (int i=0; i<title.length(); i++){ result += "-"; }
        result += "\n";

        //  Add the Workers
        int i = 0;
        for (Worker worker : workers){
            i++;
            result += "\n" + worker.toString() + "\n" + ((i%3==0) ? "\t\t\tpage " + i/3 :"");
        }
        result += ((i%3==0) ? "" : "\t\t\tpage " + (i/3 + 1));

        //  Return the result String
        return result;
    }

    public void write() throws IOException{
        File report = new File("report.txt");
        FileWriter writeReport = new FileWriter(report);
        writeReport.write(this.toStringt());
        writeReport.close();
    }
}
