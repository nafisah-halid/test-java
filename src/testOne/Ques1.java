package testOne;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

public class Ques1 {

	
	public static void main(String[] args)  throws IOException {
		
		
        File file = new File("C:/Test-One/WriteReverseConvert/src/testOne/A.CSV");
        
       
        if(!Desktop.isDesktopSupported()){
            System.out.println("Desktop is not supported");
            return;
        }
        
        Desktop desktop = Desktop.getDesktop();
        if(file.exists()) desktop.open(file);
        
   
}

	}


