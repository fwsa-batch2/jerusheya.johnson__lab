

import java.util.StringTokenizer;

public class stringTokenizer {
    public static void main(String[] args) {
        
    //creating stringtokenizer:

    //1.parameter:string
    StringTokenizer st=new StringTokenizer("this is a test");
    while(st.hasMoreTokens()){
        System.out.println(st.nextToken());
    }

    //2.parameter:string,delimiter

    //3.parameter:string,delimiter,boolean

    //if true---> includes delimiter as an token
    //if false---> doesnot include delimiter as a token

    StringTokenizer st1=new StringTokenizer("this is not your work","i",true);
    while(st1.hasMoreTokens()){
        System.out.println(st1.nextToken());
    }

    String[] result = "this is a test".split("\\s");
     for (int x=0; x<result.length; x++){
         System.out.println(result[x]);
    }

    System.out.println(st.countTokens());

    
}
}
