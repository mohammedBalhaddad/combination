import java.util.ArrayList;
import java.util.Arrays;

public class Combination {

    private static final int n = 5 ; // total options , evaluation
    private static final int r = 10 ; // pickings , # of employees
    private static ArrayList<int[]> all = new ArrayList<>();

    public static void main(String[] args) {
        generate(all,new int[r],0,1,n);

        System.out.println(" ================= Size ==================");
        System.out.println( all.size() + " Combinations .");
        System.out.println(" ================= Values ==================");
        all.forEach((arr) -> System.out.println(Arrays.toString(arr)));

    }


    public static void generate(ArrayList<int[]> all , int [] data, int index , int value , int r){
        for (int i = value; i <= r; i++) {
            data[index] = i ;
            if(index + 1 == data.length)
                all.add(data.clone());
            else
                generate(all ,data , index + 1 , i , r);
        }
    }


}
