import java.util.Vector;
import java.util.Random;
import java.util.Iterator;

public class VectorTest{
    public static void main(String[] args) {
        
        Vector<Integer> vector = new Vector<Integer>();
        Random random = new Random();
        int i = 0;
        while (i!=200000000){
            vector.add(random.nextInt(10));
            i++;
        }
        int sum = 0;
        Iterator<Integer> iterator = vector.iterator();
        long start = System.nanoTime();
        while (iterator.hasNext()){
            sum += iterator.next();
        }
        long end = System.nanoTime();
        long time = end - start;
        double timeInSeconds = (double) time / 1000000000;
        System.out.println("It took "+timeInSeconds+" seconds total to get the sum. The sum was "+sum);

    }
}

