public class Temp{
    Temp()
    {
        System.out.println("default");
    }
    Temp(int x)
    {
        this();
        System.out.println(x);
    }
    Temp(int x, int y)
    {
        this(5);
        System.out.println(x * y);
    }
    public static void main(String[] args) {

        new Temp(8, 10);
    }
      
}
        
        
        
        
        
        
        
        
        
        
        
        
       
    

