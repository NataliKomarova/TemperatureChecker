package web.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class SetTemperature {
	public String changeTemperature(String fname) {
	       if(fname.equals("да")){
	        String line = null;
	        File f1=new File("D:\\IdeaProject\\temp.txt");
	        File f2=new File("D:\\IdeaProject\\newt.txt");
	        try(BufferedReader br = new BufferedReader(new FileReader(f2))) {
	            while((line = br.readLine()) != null){
	                System.out.println(line);
	                try(FileWriter writer = new FileWriter(f1, false))
	                {	                 
	                    writer.write(line);
	                    // запись по символам
	                    writer.append('\n');                                     
	                    writer.flush();
	                    writer.close();
	                }
	                catch(IOException ex){
	                     
	                    System.out.println(ex.getMessage());
	                } 
	                try {
						Thread.sleep(7000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	            }
	        } catch (FileNotFoundException e) {

	        } catch (IOException e) {

	        }
	       }
	       return "Готово!";
    }

}
