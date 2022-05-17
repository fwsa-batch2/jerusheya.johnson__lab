package IO;
import java.io.*;

public class FileFolderDemo{
    public static void main(String[] args) throws IOException{

        
        File file=new File("//home//jerusheyajohnson//model");
        if(file.exists()){
            System.out.println("folder exists");
            File file1=new File("//home//jerusheyajohnson//model//model.txt");
            if(file1.exists()){
                System.out.println("File already exits");
            }
            else{
                //creates a file
                file1.createNewFile();
            }
        }
        else{
            //creates a folder
            file.mkdir();
            File file1=new File("//home//jerusheyajohnson//model//model.txt");
            if(file1.exists()){
                System.out.println("File already exits");
            }
            else{
                file1.createNewFile();
            }
        }

        //creates a folder inside a folder inside a folder
        File file2=new File("//home//jerusheyajohnson//model//jeru//john//jeyam");
        file2.mkdirs();
        if(file2.exists()){
            System.out.println("folders created");
        }

        //deletes a file
        File file3=new File("//home//jerusheyajohnson//model//model2.txt");
        file3.createNewFile();
        file3.delete();
        if(file3.exists()==false){
            System.out.println("deleted file");
        }

        //rename a file 
        File file4= new File("//home//jerusheyajohnson//model//model3.txt");
        file4.createNewFile();
        File newnamefile4=new File("//home//jerusheyajohnson//model//renamedFile.txt");
        file4.renameTo(newnamefile4);
       
        //get file name
        System.out.println(newnamefile4.getName());

        //checking restrictions
        System.out.println(file4.canExecute());//if can execute prints true
        System.out.println(file4.canRead());//if can read prints true
        System.out.println(file4.canWrite());//if can write prints true

        //listing out files and folders inside a folder
        File listFile=new File("//home//jerusheyajohnson//jeru");
        String[] ListOfFilesFolders= listFile.list();//returns filesandfolders' name only
        for(String i:ListOfFilesFolders){
              System.out.println(i);
        }

        //to check whether file or folder
        File[] ListOfFiles=listFile.listFiles();//returns files and folders as object
        for(File e:ListOfFiles){
           if(e.isFile()){// checks whether is an file
               System.out.println(e);
               //e.isDirectory(); //checks whether is a folder
           }

        //to check whether the file is a text file
        File practiceList=new File("//home//jerusheyajohnson//practice");
        File[] practiceListArray=practiceList.listFiles();
        for(File f:practiceListArray){
            String filename=f.getName();
            int lastWord=filename.lastIndexOf(".");
            String extension=filename.substring(lastWord+1);
            // System.out.println(extension);
            if(extension.equals("js")){
                System.out.println(filename + " size : " +f.length());
                
            }
        }
        }
    }
}
     

