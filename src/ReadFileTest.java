import java.io.BufferedReader;
import java.io.FileReader;
/**
 * author:lxc 20200807
 * changed form Readers for a function realization
 * change method test() to a standard function with input and output
 */

class ReadFile {
    //variables for output
    public String sOutput="whatever";
    public String sFileName="";
    //method to search and get context of the file
    public void cfgFileRead(int row,int col,String fileName) {
        try {
            BufferedReader reade = new BufferedReader(new FileReader(fileName));//change to your file  name
            String line = null;
            int index=0;
            while((line=reade.readLine())!=null){
                String item[] = line.split(",");//
                if(index==row-1){
                    //System.out.println(item.length);
                    if(item.length>=col-1){
                        String last = item[col-1];//
                        // System.out.println(last);
                        sOutput=last;       //lxc 20200806
                        sFileName=fileName;
                    }
                }
                //int value = Integer.parseInt(last);//
                index++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class ReadFileTest {
    public static void main(String[] args) {
        ReadFile test = new ReadFile();
        test.cfgFileRead(7,1,"D:\\TempTest\\COMTRADE_0A050001.CFG");
        System.out.println(test.sFileName);
        System.out.println(test.sOutput);

    }
}
