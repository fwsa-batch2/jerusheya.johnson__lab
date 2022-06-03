package Design Patterns.com.observerpattern.com.observerpattern;

public class Youtuber {
    public static String channelname = "FWSA";

    public static void main(String[] args) {
        channel FWSA = new channel();

        subscriber s1 = new subscriber("Prasanna");
        subscriber s2 = new subscriber("Venkatesh");
        subscriber s3 = new subscriber("Madhan");
        subscriber s4 = new subscriber("Keerthi");
        subscriber s5 = new subscriber("Mukil");

        FWSA.subscribe(s1);
        FWSA.subscribe(s2);
        FWSA.subscribe(s3);
        FWSA.subscribe(s4);
        FWSA.subscribe(s5);

        s1.subchannel(FWSA);
        s2.subchannel(FWSA);
        s3.subchannel(FWSA);
        s4.subchannel(FWSA);
        s5.subchannel(FWSA);

        FWSA.unsubscribe(s2);

        FWSA.upload("Java design patten tutorial");
    }
}
