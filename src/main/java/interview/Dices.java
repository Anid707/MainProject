package interview;

import java.util.Random;

public class Dices {
    public static void main(String[] args) {
        int number = 5;
        int[] dices = throwDices(number);

        for (int i = 0; i<number;i++){
            System.out.println(dices[i]);
        }

        int count = count6(dices);
        System.out.println("count = "+count);
    }

    private static int count6(int[] dices) {
        int c = 0;

        for (int dice:dices){
            if(dice==1){
                c=c+2;
                continue;
            }
            if (dice==6){
                continue;
            }
            c++;
        }
        return c;
    }

    private static int[] throwDices(int number) {
        Random random = new Random();
        int[]dices = new int[number];
        for (int i=0;i<number;i++){
            dices[i] = random.nextInt(6)+1;
        }
        return dices;
    }
}
