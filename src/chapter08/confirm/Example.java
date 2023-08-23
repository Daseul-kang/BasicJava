package chapter08.confirm;

import chapter07.confirm.Parent;

public class Example {
    public static void action(A a) { // A a = new B();
        a.method1();
        if (a instanceof C c) {
            //C c = (C) a;
            c.method2();
        }
    }

    public static void main(String[] args) {
        action(new B());
        action(new C());
    }
}
