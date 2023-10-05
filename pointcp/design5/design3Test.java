package design5;

import java.util.Random;

public class design3Test {

    public static void main(String[] args){
        Random random = new Random();
        char type = (random.nextBoolean()) ? 'C' : 'P';
        int i = 0;
        long start = System.nanoTime();

        while(i != 45000000){
            PointCP3 pointcp = new PointCP3(type, random.nextDouble(), random.nextDouble());
            pointcp.convertStorageToCartesian();
            pointcp.convertStorageToPolar();
            pointcp.getDistance(pointcp);
            pointcp.rotatePoint(random.nextDouble());
            i++;

        }
        long end = System.nanoTime();
        long time = end - start;
        double timeInSeconds = (double) time / 1000000000;
        System.out.println(timeInSeconds);



    }
}


