public class overriding {
    //parent and child class has same method name
    public static void main(String[] args){
  
        child obj=new child();
        // called child class
        System.out.println(obj.method1());
  
      }
  }
  
  class parent {
      String method1(){
          String jeru="jeru";
          return jeru;
      }
  }
  
  // a parent and child class has same method names so it is method overriding- runtime polymorphism
  
  class child extends parent{
      String method1(){
          String sess="sess";
          System.out.println(super.method1());// called parent class 
         return sess;
      }
  }


