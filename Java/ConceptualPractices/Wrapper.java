public class Wrapper {
    

    public static void main(String[] args){

        // //primitive datatype to object
           
        // //1.int to Integer

           int a=10;// datatype-int
           Integer obj=Integer.valueOf(a);//datatype-object
           System.out.println(obj);

        // //2.char to Character

        char c='b';
        Character obj2=Character.valueOf(c);
        System.out.println(obj2);
        
        // //object to primitive datatype

        // //1.Integer to int

        
        Integer obj1 = 1;
        int var1 = obj1;// auto unboxing
        //int var1=obj1.intValue(); //unboxing
        System.out.println(var1);

        // //2.Character to char
            
        Character obj3='A';
        char var2=obj3;
        System.out.println(var2);


        //adding two objects Integer and Character
        
        System.out.println(obj1+obj3);

        //adding two primitive datatypes int and char

        System.out.println(var1+var2);


    }
}
