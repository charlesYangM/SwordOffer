/**
 * Created by CharlesYang on 2018/5/11.
 */
public class test {
    public static void main(String[] args) {
        int[][] arr = {{2,5},{1},{3,2,4},{1,7,5,9}};

        System.out.println("the arr row length is " + arr.length);
        System.out.println("the arr col 4 length is " + arr[3].length);
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.println(arr[i][j]);
            }
        }
    }
}
