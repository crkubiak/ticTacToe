import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.IntStream;

public class Test {
    public static void main(String[] args) {
        Integer[] iHave = {0,0,3,0,5,0,7,0,0};
        int needCount = 0;
        Integer[][] lookThrough = {{1,2,3},{4,5,6},{7,8,9},{1,4,7},{2,5,8},{3,6,9}, {1,5,9},{3,5,7}};

        for (int i = 0; i < 8; i++) {
            HashSet<Integer> victory = new HashSet<>();
            victory.addAll(Arrays.asList(iHave));
            victory.retainAll(Arrays.asList(lookThrough[i]));
            if (victory.size() == 3){
                System.out.println(victory);

            }
        }



        //convert to array
//        Integer[] intersection = {};
//        intersection = set.toArray(intersection);
//
//        System.out.println(Arrays.toString(intersection));
    }
}
