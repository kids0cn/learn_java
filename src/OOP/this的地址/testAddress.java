package OOP.this的地址;

public class testAddress {
    public testAddress getThis(){
        return this;
    }

    public void test(){
        System.out.println(this);
    }

    public static void main(String[] args) {
        testAddress s1 = new testAddress();
        testAddress s2 = s1.getThis();
        System.out.println((s1 == s2));

        testAddress s3 = new testAddress();
        testAddress s4 = new testAddress();
        s3.test();
        s4.test();
    }
}
