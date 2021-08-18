
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
    }
    
    public static int smallest(int[] array){
        int small = 999999;
        for(int buffer:array){
            if(small>buffer){
                small = buffer;
            }
        }
        if (small == 999999){
            return 0;
        }
        return small;
    }
    
    public static int indexOfSmallest(int[] array){
        int small = smallest(array);
    for(int i=0;i< array.length;i++){
        if(small == array[i]){
            return i;
        }
    }
    return 0;
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int small = 99999999;
        int counter = 0;
        for(int i=startIndex;i< table.length;i++){
            if(small>table[i]){
                small = table[i];
                counter = i;
            }
        }
        if (counter==0){
            return 0;
        } else return counter;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int buffer = array[index1];
        array[index1] = array[index2];
        array[index2] = buffer;
    }
    
    public static void sort(int[] array) {
        for(int j=0;j<array.length;j++){
            for(int i=1;i<array.length;i++){
                if(array[i]<array[i-1]){
                    swap(array, i-1, i);
                }
            }
        }
    }

}
