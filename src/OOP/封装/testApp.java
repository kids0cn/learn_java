package OOP.封装;

public class testApp {
    public static void main(String[] args) {
        Student s = new Student("张三",21);
        System.out.println(s.getName());
        System.out.println(s.getAge());
        s.setName("名字");
        s.setAge(19);
        System.out.println(s.getAge());
        System.out.println(s.getName());

        Teacher t = new Teacher("李四",49);
        System.out.println(t.getName());
        System.out.println(t.getAge());
        t.setName("老哥");
        t.setAge(78);
        System.out.println(t.getName());
        System.out.println(t.getAge());
    }
}
