package notebook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class Notebook {

    private ArrayList<String> notes = new ArrayList<String>();

    public void add(String s) {
        notes.add(s);
    }

    public void add(String s, int location) {
        notes.add(location, s);
    }

    public int getSize() {
        return notes.size();
    }

    public String getNote(int index) {
        return notes.get(index);
    }

    public void removeNote(int index) {
        notes.remove(index);
    }

    public String[] list() {
        String[] a = new String[notes.size()];
//        for (int i=0; i<notes.size(); i++ ){
//            a[i] = notes.get(i);
//        }
        notes.toArray(a);
        return a;
    }

    public static void main(String[] args) {
        Notebook nb = new Notebook();
        nb.add("first");
        nb.add("second");
        nb.add("first");
        System.out.println(nb.getSize());
//        System.out.println(nb.getNote(1));
//        nb.add("third", 1);
//        System.out.println(nb.getNote(1));
//        nb.removeNote(0);
//        String[] a = nb.list();
        ArrayList<String> a = new ArrayList<String>();
        a.add("first");
        a.add("second");
        a.add("first");

        for (String s: a) {
            System.out.println(s);
        }
        System.out.println(a);

        System.out.println("--------");

        HashSet<String> s = new HashSet<String>();
        s.add("first");
        s.add("second");
        s.add("first");
        s.add("third");
        for (String t: s) {
            System.out.println(t);
        }
        System.out.println(s);


    }
}
