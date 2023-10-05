import java.util.ArrayList;
import java.util.Random;
import java.util.Iterator;

public class ArrayListTest{
    public static void main(String[] args) {
        
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        Random random = new Random();
        int i = 0;
        while (i!=200000000){
            arrayList.add(random.nextInt(10));
            i++;
        }
        int sum = 0;
        Iterator<Integer> iterator = arrayList.iterator();
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
