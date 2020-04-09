package cn.sxt.oo2;

public class Test {
    public static void main(String[] args) {
        Person p=new Person();
        p.age=20;
        p.name="Àî¶«";
        System.out.println("info:"+p);
         
        Test t = new Test();
        System.out.println(t);
    }
}

class Person {
    String name;
    int age;
    @Override
    public String toString() {
        return name+",ÄêÁä£º"+age;
    }
}