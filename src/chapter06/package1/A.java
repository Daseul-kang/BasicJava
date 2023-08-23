package chapter06.package1;

public class A {
    public A(boolean b){} //공개 public
    A(int i){} //default
    private A(String s){} //private
    A a = new A("abc");
}

