package interview;

public class Remainder {
    public static void main(String[] args) {
        int res = remainder1(30,13);
        System.out.println(res);
    }

    private static int remainder1(int a, int b) {
        while (a>=b){
            a=a-b;
        }
        return a;
    }

    private static int remainder(int a, int b) {
        return a-b*(a/b);
    }

}
