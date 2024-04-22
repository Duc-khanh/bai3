import java.util.Arrays;

public class themphantu {
    public static void main(String[] args) {
        // tao 1 mang
        int [] array= {1,2,3,4,5};
        // tang do dai mang them 1 pt
        int [] arr = new int[array.length+1];
        // vi tri muon the vao
        int indext=3;
        // gan tat ca gt truoc indext
        for (int i=0;i<indext;i++){
           arr[i]=array[i];
        }
        // them so muoon them va gan tat ca pt conf laij vaf hieenr thij ra manf hinh
        arr[indext] = 6;
        for (int i= indext+1;i<arr.length;i++){
            arr[i]=array[i-1];
        }
        System.out.println(Arrays.toString(arr));
    }

}
