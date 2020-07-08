import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WorkWithArrays {


//    2. Написать метод, который проверяет состав массива из чисел 1 и 4. Если в нем нет хоть
//    одной четверки или единицы, то метод вернет false; Написать набор тестов для этого метода
//    (по 3-4 варианта входных данных).
//            [ 1 1 1 4 4 1 4 4 ] -> true
//            [ 1 1 1 1 1 1 ] -> false
//            [ 4 4 4 4 ] -> false
//            [ 1 4 4 1 1 4 3 ] -> false

    public boolean method_2(int[] arr, int value1, int value2){
        int num1 = 0;
        int num2 = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != value1 && arr[i] != value2){
                return false;
            }
            if (arr[i] == value1){
                num1++;
            }
            if (arr[i] == value2){
                num2++;
            }
        }
        if (num1 == 0 || num2 == 0){
            return false;
        }
        return true;
    }




}
