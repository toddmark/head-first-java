package Song;

import java.util.ArrayList;

class Song {
  String title;

  public static void main(String[] args) {
    System.out.println("abcdefg".toCharArray());
    ArrayList<Object> a1 = new ArrayList<Object>();
    a1.add("asdf");
    a1.add("adf");
    a1.add("asf");
    ArrayList<Object> a2 = new ArrayList<Object>();
    a2.add("asdf");
    a2.add("adf");
    a2.add("asf1");
    System.out.println(a1.retainAll(a2));
    System.out.println(a1);
  }
}
