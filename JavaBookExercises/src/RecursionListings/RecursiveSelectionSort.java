package RecursionListings;

public class RecursiveSelectionSort {

    /* main sort method */
    public static void sort(double[] list) {



    }

    /* recursive helper sort method */
    public static void sort(double[] list, int low, int high) {

        if (low < high) {

            //Find the smallest number and its index in list[low .. high]
            int indexOfMin = low;
            double min = list[low];

            for (int i = low + 1; i <= high; i++) {
                if (list[i] < min) {

                    min = list[i];
                    indexOfMin = i;

                }
            }

            //Swap the smallest in list[low .. high] with list[low]
            list[indexOfMin] = list[low];
            list[low] = min;

            //Sort the remaining list
            sort(list, low + 1, high);


        }

    }


}
