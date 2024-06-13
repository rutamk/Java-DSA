public class quickSort {
    public static int partition(int arr[],int low, int high){
        int i = low-1; // track space creation in the array
        int pivot = arr[high];
        for (int j = low; j < high; j++) {
            if(arr[j]<pivot){ // for descending order change <  into >
                i++;// create space
                //swap
                int temp = arr[i];
                arr[i]= arr[j];
                arr[j] = temp;
            }
        }
        //swap largest value and pivot element so that pivot is put in its correct place
        i++;
        //swap
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i; //index of pivot
    }

    public static void quicksort(int arr[],int low, int high){
         if(low<high){
         int pidx = partition(arr,low,high);
         quicksort(arr, low, pidx-1);
         quicksort(arr, pidx+1, high);
        }
    }
public static void main(String[] args) {
    int arr[] = {2,1,4,2,7};
    int n = arr.length;
    quicksort(arr, 0, n-1);
    
    //print
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
    }
    System.out.println();
}    
}

