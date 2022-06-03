import java.io.*;
import java.util.*;


public class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
    
            int arCount = Integer.parseInt(bufferedReader.readLine().trim());
    
            String[] arTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
    
            List<Integer> ar = new ArrayList<>();
    
            for (int i = 0; i < arCount; i++) {
                int arItem = Integer.parseInt(arTemp[i]);
                ar.add(arItem);
            }

            System.out.println(ar);
    
            // int result = Result.simpleArraySum(ar);
    
            // bufferedWriter.write(String.valueOf(result));
            // bufferedWriter.newLine();
    
            bufferedReader.close();
            bufferedWriter.close();
        }
    }

