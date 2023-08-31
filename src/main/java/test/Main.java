package test;

public class Main {
    public static void main(String[] args) {
        Foo foo = new FooImpl();

        System.out.println(foo.bar("hello world"));
    }

}
