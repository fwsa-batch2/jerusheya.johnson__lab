
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriter {
    private static String file="";
    public BufferedWriter(FileWriter writer) {
    }
    public static void main(String[] args) throws IOException{
        FileWriter Writer=new FileWriter(file);
        BufferedWriter buffer=new BufferedWriter(Writer);
        buffer.write("jeru");
        buffer.close();
    }
    void close() {
    }
    void write(String string) {
    }
    public void newLine() {
    }
}
