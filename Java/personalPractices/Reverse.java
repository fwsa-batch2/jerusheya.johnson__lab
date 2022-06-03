public class Reverse {
    public static void main(String[] args) {
        String j="jeru";
        char ch;
        String s="";
    
        for(int i=0;i<j.length();i++){
           ch = j.charAt(i);
           s=ch +s;
        }
        System.out.println(s);

        int i=0;
        String b="";
        char ch1;
        do {
           ch1 = j.charAt(i) ;
           b= ch1 +b;
           i++;
        } while (i<j.length());
        System.out.println(b);
        
    }
    }


