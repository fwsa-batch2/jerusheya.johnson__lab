public class SingletonPattern {
    private static SingletonPattern obj;

    private SingletonPattern(){}

    public static SingletonPattern getInstance(){
        return obj;
    }
}
