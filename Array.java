/*
This will just be a public Array class with getters and setters to first allow the user
to decide on the length of the array and creates a random array

We created a few methods to sort the array accordingly as well!
For the sorting methods, I have also added the run times so you will be able to compare how quickly an array will be sorted based on the Sorting Method of choice
 */

import java.util.*;


public class Array {

    private int userLength;
    Random random = new Random();
    private int[] arrayLength;

    public void setLength(int Length) {
        if (Length > 0) {
            this.userLength = Length;

        } else {
            System.out.println("Please input a value that is greater than 0");
        }
        arrayLength = new int[userLength];
    }



    public void randomArrayValue() {
        for (int i = 0; i < arrayLength.length; i++) {

            arrayLength[i] = (int)(Math.random()*userLength+1);


        }
    }

        public void  getArray(){
            for (int i = 0; i<arrayLength.length; i++ ) {
                System.out.println(arrayLength[i]);
            }
        }


        //Simple Sort
       public void selectionSort ()
       {
        // Selection sort has O(n^2) time Complexity, traverse entire array to swap elements


        int currentIndex;
        int nextIndex;
           int placeholder;

        for (int i = 0; i <= arrayLength.length; i++) {
            for (int j = i + 1; j < arrayLength.length; j++) {

                currentIndex = i;

                nextIndex = j;

                        if (arrayLength[currentIndex] > arrayLength[nextIndex]) {

                                placeholder = arrayLength[currentIndex];
                                arrayLength[currentIndex] = arrayLength[nextIndex];
                                arrayLength[nextIndex] = placeholder;
                             }

                             }

        }  for (int i = 0; i<arrayLength.length; i++ ) {
               System.out.println(arrayLength[i]);
        }


    }


    public int partition(int[] array, int low, int high){

        int pivotPoint = array[high];
        int  index = (low - 1);

        for(int i = index; i< high;i++)
        {
            if(array[i] < pivotPoint)
            {
                index++;
                int placeholder = array[index];
                array[index] = array[i];
                array[i] = placeholder;

            }
        }

        int placeholder = array[index + 1];
        array[index+1] = array[high];
        array[high] = placeholder;

        return index+1;
    }

    public void QuickSort(int[] array, int low, int high){


        if ( low<high){

            int partitionIndex = partition(arrayLength,low,high);

            QuickSort(arrayLength,low, partitionIndex -1);
            QuickSort(arrayLength,partitionIndex +1, high);

        }

        for(int i =0; i< arrayLength.length; i++){
            System.out.println(arrayLength[i]);
        }
    }



}
