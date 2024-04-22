import java.util.Arrays;

public class gopmang {
    public static void main(String[] args) {
        // tạo 2 mảng
        // tạo mảng thứ 3 để goppjo mảng
        // dùng đk để lap mảng t1 vào mảng t3
        //hiển thị ra màn hình để xem kết quả
        // dùng đk để lap mảng t2 vào mảng t3
        //hiển thị ra màn hình để xem kết quả
        int [] arr1={2,3,4,5};
        int [] arr2= {6,7,8,9};
        int [] arr3 = new int[arr1.length+ arr2.length];
        for (int i=0;i<= arr1.length-1;i++){
            arr3[i]=arr1[i];
        }
        System.out.println(Arrays.toString(arr3));
        for (int i = 0; i<= arr2.length-1; i++){
            arr3[i+arr1.length]=arr2[i];

        }
        System.out.println(  Arrays.toString(arr3));


    }
}
