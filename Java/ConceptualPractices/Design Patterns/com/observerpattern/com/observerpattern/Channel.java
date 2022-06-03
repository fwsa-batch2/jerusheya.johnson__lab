package Design Patterns.com.observerpattern.com.observerpattern;

public class Channel {
    public static String title;
    private List<S> subs = new ArrayList<>();

    public void subscribe(Subscriber sub){
        subs.add(sub);
    }

    public void unsubscribe(S sub){
        subs.remove(sub);
    }

    public void SNotify(){
        for(S sub : subs){
            sub.update();
        }
    }

    public void upload(String title){
        channel.title = title;
        SNotify();
    }
}
