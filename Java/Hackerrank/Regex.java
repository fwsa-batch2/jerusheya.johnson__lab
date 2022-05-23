import java.util.regex.*;

public class Regex {
    public static void main(String[] args) {
        Pattern pattern=Pattern.compile(".xx.");//checks whether it is a pattern
        Matcher matcher=pattern.matcher("AxxB");
        System.out.println("String that matches the given Regex " +matcher.matches());

        Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
        if(testCases>0){
		for(int i=0;i<3;i++){
			String pattern1 = in.nextLine();
        
          	//Write your code
            try {
                Pattern.compile(pattern1);
                System.out.println("Valid");
            } catch(PatternSyntaxException e) {
                System.out.println("Invalid");
            }
       
		}
        }
    }
}
