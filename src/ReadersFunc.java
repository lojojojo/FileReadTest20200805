import java.io.BufferedReader;
import java.io.FileReader;
/**
 * author:lxc 20200807
 * changed form Readers for a function realization
 * change method test() to a standard function with input and output
 */

public class ReadersFunc {
    private int row;
    private int col;
    public String sOutput="whatever";
    public ReadersFunc(int row, int col){
        this.row=row;
        this.col=col;
    }
   //getters
    public int getCol() {
        return this.col;
    }
    public int getRow(){
        return this.row;
    }
    //setters
    public void setCol(int col) {
        this.col = col;
    }
    public void setRow(int row) {
        this.row = row;
    }

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
                    }
                }
                //int value = Integer.parseInt(last);//
                index++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public static void main(String[] args) {
        ReadersFunc test = new ReadersFunc(7,2);
        test.cfgFileRead(7,3,"D:\\TempTest\\FTPServerRootFolder\\FileInput45.cfg");
        System.out.println(test.sOutput);
    }

}