import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadCsv {
    /*
     *
     */
    public static void main(String[] args) {
        // 1. .csv path\\
        File csv = new File(
                "D:\\TempTest\\COMTRADE_0A050001.CFG"); // CSV file path
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(csv));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String line = "";
        String everyLine = "";
        try {
            List<String> allString = new ArrayList<>();
            while ((line = br.readLine()) != null) //
            {
                everyLine = line;
                System.out.println(everyLine);
                allString.add(everyLine);
            }
            System.out.println("csv table lines: " + allString.size());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
