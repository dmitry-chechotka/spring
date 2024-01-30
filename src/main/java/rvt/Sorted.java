package rvt;

public class Sorted {

    // a class method smallest that takes an integer array as a parameter. It should return the smallest value in the array.
    public static int smallest(int[] array){

        int smallest = array[0];

        for (int i = 0; i < array.length; i++){
            if (array[i] < smallest){
                smallest = array[i];
            }
        }
        return smallest;
    }

    // returns the index of the smallest value in the array
    public static int indexOfSmallest(int[] array){
            
            int smallest = array[0];
            int index = 0;
    
            for (int i = 0; i < array.length; i++){
                if (array[i] < smallest){
                    smallest = array[i];
                    index = i;
                }
            }
            return index;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int smallest = table[startIndex];
        int index = startIndex;

        for (int i = startIndex; i < table.length; i++){
            if (table[i] < smallest){
                smallest = table[i];
                index = i;
            }
        }
        return index;
    }

    
}
