package com.Encapsulation1;
import java.util.Scanner;

class userData {
    private int accountNum;
    private String password;

    public int getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(int accountNum) {
        this.accountNum = accountNum;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}

public class Encapsulation{
       public static void main(String[] args) {
           System.out.println("Enter your account number");
           Scanner scan=new Scanner(System.in);
           int inputAccount=scan.nextInt();
           System.out.println("Enter your password");
           String inputPassword=scan.next();
           userData obj=new userData();
           obj.setAccountNum(inputAccount);
           obj.setPassword(inputPassword);
           System.out.println("AccountNum=" +obj.getAccountNum() +"  " +"Password=" +obj.getPassword());
           scan.close();
       }
}
