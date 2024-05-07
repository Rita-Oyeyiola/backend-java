package exception_handling;

public class TestException {
    static int divide (int a, int b) {
        try{
            return a/b;
        }catch (ArithmeticException e){
            System.out.println("Error: cannot be divide by zero");
            return 0;
        }finally {
            System.out.println("Division operation attempted");
        }
    }

    public static void main(String[] args){
        System.out.println(divide (10,0));
    }
}
