package testOne;

import java.io.*;

public class Ques3 {

			    public static void main(String[] args) throws IOException  {
		        StringBuilder sb = new StringBuilder();
		    try (BufferedInputStream is = new BufferedInputStream(new FileInputStream("C:/Test-One/WriteReverseConvert/src/testOne/B.txt"))) {
		        PrintStream ps = new PrintStream(new File("C:/Test-One/WriteReverseConvert/src/testOne/C.bin"));
		        
		        for (int b; (b = is.read()) != -1;) {
		            String s = "0000000" + Integer.toBinaryString(b);
		            s = s.substring(s.length() - 8); 
		            sb.append(s).append(' ');
		            }
		            //sb.append(s).append(' ');
		            System.setOut(ps);
		            System.out.println(sb);
		        }
		    }
		    
		      

	}


