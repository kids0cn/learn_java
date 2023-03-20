package OOP.静态变量;

public class Student {
    private static int count;
    private int num;
    public Student(){
        count++;
        num++;
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();

        System.out.println(s1.num);
        System.out.println(s2.num);
        System.out.println(s3.num);
        System.out.println(s4.num);

        System.out.println(Student.count);
        System.out.println(s1.count);
        System.out.println(s2.count);
        System.out.println(s3.count);
        System.out.println(s4.count);

        Father f1 = new Father();
        Father f2 = new Father();
        System.out.println(f1.name);
        System.out.println(f2.name);

        f1.name = "李四";
        System.out.println(f2.name);
    }

}
