package com.Collections.Set;

import java.util.LinkedHashSet;

public class linkedHashSet {

   public static void main(String[] args) {
      LinkedHashSet<Integer>set = new LinkedHashSet<Integer>();
      set.add(20);
      set.add(60);
      set.add(80);
      set.add(120);
      set.add(150);
      set.add(200);
      set.add(220);
      set.add(260);
      set.add(380);
      System.out.println("Set = "+set);
      set.remove(150);
      set.remove(260);
      System.out.println("Updated Set = "+set);
      set.remove(60);
      System.out.println("Updated Set = "+set);
   }
}

