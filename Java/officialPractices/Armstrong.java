import java.util.Scanner;


public class Armstrong {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int number=scan.nextInt();
        String numToString=Integer.toString(number);
        Double cubenum=0.0;
        int result=0;
        for(int i=0;i<numToString.length();i++){
            int lengthofstring=numToString.length();
            Character digit=numToString.charAt(i);
            int value=Integer.parseInt(String.valueOf(digit));
            cubenum+=Math.pow(value,lengthofstring);
            result = cubenum.intValue();
        } 
        scan.close();
    
        if(result==number){
            System.out.print("This is an armstrong number");
        }
        else{
            System.out.print("This is not an armstrong number");
        }
    }
}
