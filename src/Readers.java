
import java.io.BufferedReader;
import java.io.FileReader;
public class Readers {
    /**author:
     *
     *
     *
     *
     */
    static String sOutput="whatever";   //lxc 20200806
    public  void test(int row,int col){
        try {
            BufferedReader reade = new BufferedReader(new FileReader("D:\\TempTest\\FTPServerRootFolder\\FileInput45.cfg"));//change to your file  name
            String line = null;
            int index=0;
            while((line=reade.readLine())!=null){
                String item[] = line.split(",");//
                if(index==row-1){
                    //System.out.println(item.length);
                    if(item.length>=col-1){
                        String last = item[col-1];//
                        System.out.println(last);
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
        Readers test = new Readers();
        test.test(7,2);
        System.out.println(sOutput);        //lxc 20200806
    }
}
