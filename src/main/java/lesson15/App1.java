package lesson15;

public class App1 {
    public static void main(String[] args) throws CloneNotSupportedException {
        int a = 10;
        int b=0;
        int[]numbers = {1,2,3};

        try{
            System.out.println("In try before error");
            int x = a/b;
            numbers[1] = 29;
            System.out.println("In try after error");
//            throw new CloneNotSupportedException("XXX");
        }catch(ArithmeticException err){
            System.out.println("In catch block");
        } catch (ArrayIndexOutOfBoundsException err){
            System.out.println("in the Second catch block");
        } catch (Exception err){
            System.out.println("Catch every error");
            throw err;
        } finally {
            System.out.println("I will run in any case");
        }



        System.out.println("Program finished successfully");

    }

}
