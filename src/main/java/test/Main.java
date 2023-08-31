package test;

import org.apache.commons.text.WordUtils;

public class Main {
    public static void main(String[] args) {
        Foo foo = new FooImpl();

        System.out.println(foo.bar("hello world"));

        System.out.println(WordUtils.capitalize("foo bar"));
    }

}
