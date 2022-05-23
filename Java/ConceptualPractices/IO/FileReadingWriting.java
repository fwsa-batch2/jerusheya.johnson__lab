package IO;
import java.io.CharArrayReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadingWriting {
    public static void main(String[] args) {
        File file=new File("//home//jerusheyajohnson//jeru//filewriter.txt");
    
        try{
            file.createNewFile();
            FileWriter writer=new FileWriter("//home//jerusheyajohnson//jeru//filewriter.txt");
            // filewriter object can be created for existing file also
            writer.write("jeru is working\n");
            writer.write(97);//prints the ascii value
            writer.flush();
            writer.close();


            FileReader reader=new FileReader(file);
            int output=reader.read();
            if(output!=-1){
                System.out.println(output);
                output=reader.read();
            }

            char[] ch=new char[(int) file.length()];
            System.out.println(ch.length);
            reader.read(ch);
            for(char i:ch){
                System.out.print(i);
            }

            reader.close();

        }
        catch(IOException e){
            e.printStackTrace();
        }

    }
}
