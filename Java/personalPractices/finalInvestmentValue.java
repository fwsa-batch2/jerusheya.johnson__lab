import java.util.Scanner;

public class finalInvestmentValue {

    public static void main(String[] args){

    Scanner scan=new Scanner(System.in);

    System.out.println("enter the present investment value");
    int presentAmount=scan.nextInt();

    System.out.println("enter the rate of interest");
    int ROF=scan.nextInt();

    System.out.println("enter the no.of years for investment");
    int investmentYears=scan.nextInt();
    double RateOfInvest=ROF/100d;
    double MonthlyRateOfInvest=RateOfInvest/12d;

    for(int i=1;i<=investmentYears;i++){
   
    double Step1=1+MonthlyRateOfInvest;
    double Step2=Math.pow(Step1,i*12);
    double result=presentAmount*Step2;

    System.out.println("result of " + i  +"st year = " +result);
}
   scan.close();

    }


}
