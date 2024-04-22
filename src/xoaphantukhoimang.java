import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class xoaphantukhoimang {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        int[] newarray = new int[array.length -1];
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập giá trị cần xoa");
        int input = sc.nextInt();
        for (int i = 0, k = 0 ; i < array.length; i++) {
            if (array[i] != input) {
                newarray[k] = array[i];
                k++;
            }
        }
        System.out.println(Arrays.toString(newarray));

    }
}





























//        int[] array = {1,2,3,4,5,6};
//        int[] arr = new int[array.length-1];
//        int j=3;
//        for (int i=0,k = 0;i < array.length; i++){
//            if(i!=j){
//                arr[k]= array[i];
//                k++;
//            }
//
//        }
//        System.out.println(Arrays.toString(array));
//        System.out.println(Arrays.toString(arr));
//
//
//    }
//}

