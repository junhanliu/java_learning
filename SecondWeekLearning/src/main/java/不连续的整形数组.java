import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
public class 不连续的整形数组 {
    public static void main( String[ ] args ) {

        int sourceNumber[] = new int[1000];
        long startTime = System.nanoTime();

        Random random=new Random();
        for(int i=1;i<1000;i++){
            sourceNumber[i]=random.nextInt(1000);
        }
        long endTime = System.nanoTime();

        System.out.print("处理时间:"+(endTime-startTime));

        for(int j =1;j<sourceNumber.length;j++){
            System.out.print(sourceNumber[j]+",");
        }
    }
}
