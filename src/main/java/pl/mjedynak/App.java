package pl.mjedynak;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        SomeClass foo = (SomeClass) context.getBean("foo");
        SomeClass bar = (SomeClass) context.getBean("bar");
    }
}
