import java.util.*;

public class Baitap2 {
    public static void main(String[] args) {

        // tao mang ngau nhien 100 phan tuw
        Random random = new Random();

        int[] arr = new int[100];
        for (int i = 0; i < 100; i++) { // lap 100 lan
            // i la vi tri cua
            // voi moi 1 phan tu trong mang , tao ra gia tri ngau nhien
            arr[i] = random.nextInt(100); // cos the trung lap
        }


        // tim gia tri lon thu 2 torng mang
        // tree map
        TreeMap<Integer,Integer> map = new TreeMap<>(Comparator.reverseOrder());

        for (int number : arr){
            if (map.containsKey(number)){
                // ton tai roi
                map.put(number,map.get(number)+1);
            }else {
                map.put(number,1);
            }
        }
        System.out.println(map);
        System.out.println(Arrays.toString(arr));
        Integer max = map.lastKey();
        Integer secondMax = map.lowerKey(max);
        Integer thirstMax = map.lowerKey(secondMax);
        System.out.println("Gias tri lon thu 2 la = "+secondMax +"| so phan tu lon thu 2 = "+map.get(secondMax));

        // tim kiem phan tu lown thu n trong mang
        int n = 8;
        for (int i = 0; i < n-1; i++) {
            max = map.lowerKey(max);
        }
        System.out.println("Gia tri lonw thu "+n+" = "+ max+ " | so phan tu cung gia tri = "+map.get(max));
    }
}
