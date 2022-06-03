

import java.util.*;


public class subscriber {
    private String name;
    private channel ch = new channel();

    public subscriber(String name) {
        this.name = name;
    }

    public void update(){
        System.out.println("Hey "+ name +" "+ channel.title +" in video uploaded in " + youtuber.channelname + " channel");
    }

    public void subchannel(channel cha){
        ch = cha;
    }