// package com.jeru;

public class AccessSpecifiers {

    private static int num1=1;
    public static int num2=2;
    int num3=3;
    protected static int num4=4; 
   
    public static void main(String[] args){
        
    System.out.println(num1);
    Access1 mainobj=new Access1();
    System.out.println(mainobj.method());
    Access2 mainobj1=new Access2();
    System.out.println(mainobj1.method());
    
    }
}

class Access1 extends AccessSpecifiers{

      int method(){
         int result=num2+num3+num4;
      return result;
    }
}

class Access2 {

    AccessSpecifiers obj2=new AccessSpecifiers();
    
    int num3=obj2.num3;
    

    int method(){
     int result=AccessSpecifiers.num2+num3+AccessSpecifiers.num4;
     return result;
}
    
}
