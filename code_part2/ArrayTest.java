import java.util.Random;


public class ArrayTest{
    public static void main(String[] args) {
        
        int[] array = new int[200000000];
        Random random = new Random();
        int i = 0;
        while (i!=200000000){
            array[i] = (random.nextInt(10));
            i++;
        }
        int sum = 0;
        long start = System.nanoTime();
        for (int j=0; j<array.length; j++){
            sum += array[j];
        }
        long end = System.nanoTime();
        long time = end - start;
        double timeInSeconds = (double) time / 1000000000;
        System.out.println("It took "+timeInSeconds+" seconds total to get the sum. The sum was "+sum);

    }
}
