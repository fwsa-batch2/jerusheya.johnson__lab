package com.Encapsulation2;

import com.Encapsulation1.AccessSpecifiers;

public class Access {
    
       public static void main(String[] args){
     System.out.println(A1.methods());
      System.out.println(A2.methods());
      System.out.println(A3.methods());
 
}
}


 class A1 extends Access{
     static int methods(){
         int result=AccessSpecifiers.num2;
         return result;
     }
}

class A2 extends AccessSpecifiers{
    static int methods(){
        int result=AccessSpecifiers.num2+AccessSpecifiers.num4;
        return result;
    }
}

class A3{
    static int methods(){
        int result=AccessSpecifiers.num2;
         return result;
    }
}