package test;

import org.apache.commons.text.WordUtils;

public class Main {
    public static void main(String[] args) {
        Foo a = new FooImpl();

        System.out.println(a.bar("foo", "bar"));

        System.out.println(WordUtils.capitalize("foo bar"));
    }

}
