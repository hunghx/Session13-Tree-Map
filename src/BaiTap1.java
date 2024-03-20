import java.util.HashMap;
import java.util.Map;

public class BaiTap1 {
    public static void main(String[] args) {

        int[] arr = {1,3,6,8,9,3,6,6,8,0,4,4,3,8,9};
        Map<Integer,Integer> map = new HashMap<>();

        // duyet cac phan tu va dua vao map
        for (int number : arr){
            if (map.containsKey(number)){
                // ton tai roi
                map.put(number,map.get(number)+1);
            }else {
                map.put(number,1);
            }
        }

        for ( Map.Entry<Integer,Integer> entry : map.entrySet()){
            System.out.println("Value : "+ entry.getKey() +" | Count : "+entry.getValue());
        }
    }
}
