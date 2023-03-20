package OOP.封装;

public class Teacher {

    private String name;
    private Integer age;

    public Teacher() {
    }

    public Teacher(String name, Integer age){
        this.name = name;
        this.age = age;
    }

    public String getName(){return name;}
    public Integer getAge(){return age;}

    public void setName(String name){this.name = name;}
    public void setAge(Integer age){this.age = age;}

}
