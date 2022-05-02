public class abstraction {
    public static void main(String[] args){
        relations f=new relations();
        System.out.println(f.father());
        System.out.println(f.mother());
        System.out.println(f.sister());

    }

}

abstract class family{
    String grandparents;

    //abstract methods
    abstract String father();
    public abstract String mother();

    //abstract class can have a constructor
     family(){
         this.grandparents="thatha patti";
    }

    public String sister(){
        return "sess";
    }

}

class relations extends family{
    String relation;
    
    String father(){
        return "Johnson Jeyakumar";
    }
    public String mother(){
        System.out.println(this.grandparents);
        return "ruby";
    }

    
}
