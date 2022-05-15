
class automobile{
    private String drive(){
        return "Driving vehicle";
    }
}
class car extends automobile{
    protected String drive(){
        return "Driving car";
    }
}
public class Electriccar extends car{
    @override public final String drive(){
             return "driving electric car"; 
    }
    public static void main(String[] args){
         Electriccar c = new Electriccar();
        System.out.println(c.drive());
    }
}
