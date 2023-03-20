package 方法.引用传递;

public class test {
    public static void changeName(Student s){
        s.name = "test";
    }

    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.name);
        changeName(student);
        System.out.println(student.name);
    }
}

class Student{
    String name;
}
