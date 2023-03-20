package 多线程.静态代理;

public class testAPP {

    public static void main(String[] args) {
        WeddingCompany weddingCompanyB = new WeddingCompany(new bride());
        WeddingCompany weddingCompanyG = new WeddingCompany(new groom());
        weddingCompanyB.HappyMarry();
        weddingCompanyG.HappyMarry();

    }

}

interface Marry{
    void HappyMarry();  //只有抽象方法
}

class WeddingCompany implements Marry{
    private Marry target;
    //有参构造进行传参
    public WeddingCompany(Marry target){
        this.target = target;
    }

    @Override
    public void HappyMarry() {
        before();  // 做些前期工作
        this.target.HappyMarry();  // 调用正常的方法
        after(); //做些善后的工作
    }

    private void before(){
        System.out.println("做些结婚前的准备工作");
        System.out.println("恋爱");

    }

    private void after(){
        System.out.println("做些结婚后的善后工作");
    }
}

class bride implements Marry{
    @Override
    public void HappyMarry() {
        System.out.println("买房");
    }
}

class groom implements Marry{
    @Override
    public void HappyMarry() {
        System.out.println("买车");
    }
}