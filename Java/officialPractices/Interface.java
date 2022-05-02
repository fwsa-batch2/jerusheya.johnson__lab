public class Interface {
        public static void main(String[] args){
    
            mom m=new mom();
            m.method();
        //    jeru.method();
        }
    }
    
    interface jeru {
       
        int y=6;
       //tells what methods are used.
    
       void method();
    }
    
    class mom implements jeru{
    
    
        // extends the property of class jeru that means don't want to create separate object while calling
        
    
         public void method(){
               System.out.println("this is the value of y" +y);
        }
    }
    
    

