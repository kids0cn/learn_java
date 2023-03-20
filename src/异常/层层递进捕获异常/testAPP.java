package 异常.层层递进捕获异常;



public class testAPP {
    int a = 1;
    //int a = 2;
    public static void main(String[] args) {
        try{
            if ((new testAPP()).a == 1){
                throw new ArithmeticException("a=1");
            }
            if ((new testAPP()).a == 2){
                throw new ArrayIndexOutOfBoundsException("a=2");
            }
        }catch (ArithmeticException e){
            System.out.println("A=1"+"\n"+e);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("A=2");
        }catch (Exception e){
            System.out.println("Exception");
        }catch (Throwable e){
            System.out.println("Throwable");
        }finally {
            System.out.println("finally");
        }
    }
}
