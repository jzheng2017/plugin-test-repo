package test;

import org.apache.commons.text.WordUtils;

public class FooImpl implements Foo {

    @Override
    public String bar(String foo, String bar) {
        return WordUtils.capitalize(foo + bar);
    }
}
