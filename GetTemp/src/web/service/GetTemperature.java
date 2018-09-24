package web.service;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class GetTemperature {
	public String getTemperature(String name) {
        char[] buffer = new char[0];
        File f=new File("D:\\IdeaProject\\temp.txt");
        try(FileReader reader = new FileReader(f))
        {
            buffer = new char[(int)f.length()];
            // считаем файл полностью
            reader.read(buffer);
            System.out.println(new String(buffer));
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
        return "Привет, " + name + "!"+"Температура "+new String(buffer)+"градусов C";
    }
}
