public class Generics<T> {
    private T t;
    public void set(T t){
        this.t=t;
    }
    public T get(){
        return t;
    }
    public static void main(String[] args) {
        //same memory space with different datatypes
        Generics<String> name=new Generics<>();
        Generics<Integer> number=new Generics<>();

        name.set("Jerusheya");
        number.set(2);

        System.out.print(name.get() +"- ");
        System.out.println(number.get());
    }
}
