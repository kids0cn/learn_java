package OOP.多态;

public class testAPP {
    public static void main(String[] args) {
        Son s1 = new Son();
        s1.testFather();
        s1.testSon();
        //s1.testFatherPrivate();
        s1.testRewrite();
        System.out.println(s1.name);

        Father s2 = new Son();
        s2.testFather();
        //s2.testFatherPrivate();
        //s2.testSon();
        s2.testRewrite();
        System.out.println(s2.name);
        //System.out.println(s2.age);
    }
}
