import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] myArr = {1, 4, 4,  4, 1, 7};
        int[] myArr1 = {1, 4, 4,  4, 1, 7};
        int[] arr = {4, 4,4,4,4};
        int[] a = {1,1,1,1,1};
        int[] aaa = {1, 1, 4, 3};


        WorkWithArrays ar = new WorkWithArrays();

        System.out.println(ar.method_2(aaa, 1, 4));

//        System.out.println(Arrays.toString(ar.method_1(myArr, 4)));
    }
}
