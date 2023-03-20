package 多线程.lamda表达式;

public class testLamda {
    /*
    static class Like implements ILike{
        @Override
        public void lambda() {
            System.out.println("这是静态内部类实现接口");
        }
    }
    */
    public static void main(String[] args) {
        /*
        局部内部类
        class Like implements ILike{
            @Override
            public void lambda() {
                System.out.println("这是局部内部类实现接口");
            }
        }
        Like like = new Like();
        like.lambda();

         */

        /*
        ILike like = new ILike(){
            @Override
            public void lambda() {
                System.out.println("这是你们内部类实现接口");
            }
        };
        like.lambda();

         */

        ILike like = () ->{
            System.out.println("这是lamda实现接口");
        };
        like.lambda();



    }
}

//1.定义一个函数式接口
interface ILike{
    void lambda();
}

/*
//2.定义一个实现类
class Like implements ILike{
    @Override
    public void lambda(){
        System.out.println("lambda接口实现类");
    }
}

*/