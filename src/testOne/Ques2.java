package testOne;

import java.io.*;
import java.util.*;

public class Ques2 {

	public static void main(String[] args) throws FileNotFoundException {
 
        ArrayList<String> revFile = new ArrayList<String>();

        File sourceFile=new File("C:/Test-One/WriteReverseConvert/src/testOne/A.CSV");
        Scanner content=new Scanner(sourceFile);
        PrintStream o = new PrintStream("C:/Test-One/WriteReverseConvert/src/testOne/B.txt");
            while (content.hasNextLine()){
                revFile.add(content.nextLine()); 
            }
            for(int i = (revFile.size()-1); i >=0 ; i--){
                String ar[]=revFile.get(i).split(" ");

                for(int j = (ar.length-1); j >=0; j--){
                	System.setOut(o);
                	System.out.print(ar[j] + " "); 
                }
                System.out.println(" ");
                ar=null;
            }

            content.close();
            o.close();
            
           
        }
	
}
	



