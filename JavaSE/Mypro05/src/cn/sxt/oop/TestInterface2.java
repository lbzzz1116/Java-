package cn.sxt.oop;

public class TestInterface2 {

}
interface A {
    void testa();
}
interface B {
    void testb();
}
//��ֻ�е��̳У��ӿ��ж�̳�
/**�ӿڿ��Զ�̳У��ӿ�C�̳нӿ�A��B*/
interface C extends A, B {
    void testc();
}
class Mysubclass implements C {
    public void testc() {
    }
    public void testa() {
    }
    public void testb() {
    }
}