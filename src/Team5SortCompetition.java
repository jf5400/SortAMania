public class Team5SortCompetition extends SortCompetition   {

    public int median(int[] arr){
        int len = arr.length;
        int median = arr[(int)(len/2)];
        if(len%2==0){
            median = arr[(len/2)-1]+arr[len/2];
            median = median/2;
        }
        return median;
    }
    public static void swap(String[] arr,int i, int j){
        String t = arr[i];
        arr[i] = arr[j];
        arr[j]=t;
    }
    public static void swap(int[] arr,int i, int j){
        int t = arr[i];
        arr[i] = arr[j];
        arr[j]=t;
    }

    public static void SelectionSort (String[] arr){
        int curPos = 0;
        int minPos = 0;
        String minValue = arr[curPos];
        while(curPos<arr.length){
            minPos = curPos;
            minValue = arr[curPos];
            for(int i = curPos +1;i<arr.length;i++){

                if(arr[i].compareTo(minValue)<0){
                    minValue = arr[i];
                    minPos = i;
                }
            }
            swap(arr,minPos,curPos);
            curPos++;
        }
    }
    public static void SelectionSort (int[] arr){
        int curPos = 0;
        int minPos = 0;
        int minValue = arr[curPos];
        while(curPos<arr.length){
            minPos = curPos;
            minValue = arr[curPos];
            for(int i = curPos +1;i<arr.length;i++){

                if(arr[i]<minValue){
                    minValue = arr[i];
                    minPos = i;
                }
            }
            swap(arr,minPos,curPos);
            curPos++;
        }
    }
    public static void BubbleSort(String[] arr){
        int x = arr.length-1;
        int stop;
        int swaps = 1;
        while(swaps>0){
            swaps = 0;
            stop = x;
            for(int i = 0;i<stop;i++){
                if(arr[i].compareTo(arr[i+1])>0){
                    swap(arr,i,i+1);
                    swaps++;
                    x = i;
                }
            }
        }
    }
    public static void BubbleSort(int[] arr){
        int x = arr.length-1;
        int stop;
        int swaps = 1;
        while(swaps>0){
            swaps = 0;
            stop = x;
            for(int i = 0;i<stop;i++){
                if(arr[i]>arr[i+1]){
                    swap(arr,i,i+1);
                    swaps++;
                    x = i;
                }
            }
        }
    }
    public static void InsertionSort (String[] arr){
        for(int i = 0;i<arr.length;i++){
            for(int j = i;j>0;j--){
                if(arr[j].compareTo( arr[j-1])<0){
                    swap(arr,j,j-1);
                }
                else{
                    break;
                }
            }
        }
    }
    public static void InsertionSort (int[] arr){
        for(int i = 0;i<arr.length;i++){
            for(int j = i;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
                else{
                    break;
                }
            }
        }
    }

    public static void mergeSort(int[] arr) {
        int length = arr.length;
        int[] temp = new int[length];
        mergeSortHelper(arr, 0, length-1, temp);
    }

    private static void mergeSortHelper(int[] arr, int low, int high, int[] temp)
    {
        if (low < high)
        {
            int mid = (low + high) / 2;
            mergeSortHelper(arr, low, mid, temp);
            mergeSortHelper(arr, mid + 1, high, temp);
            merge(arr, low, mid, high, temp);
        }
    }

    private static void merge(int[] arr, int low, int mid, int high, int[] temp)
    {
        int i = low;
        int j = mid + 1;
        int k = low;
        while (i <= mid && j <= high)
        {
            if (arr[i] < arr[j])
            {
                temp[k] = arr[i];
                i++;
            }
            else
            {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i <= mid)
        {
            temp[k] = arr[i];
            i++;
            k++;
        }
        while (j <= high)
        {
            temp[k] = arr[j];
            j++;
            k++;
        }
        for (k = low; k <= high; k++)
        {
            arr[k] = temp[k];
        }
    }



    public int challengeOne(int[] arr){
        return 4;
    }

    public int challengeTwo(String[] arr, String query){
        return 3;
    }

    public int challengeThree(int[] arr){
        return 2;
    }

    public int challengeFour(int[][] arr){
        return 1;
    }

    public int challengeFive(Comparable[] arr, Comparable query){
        return 0;
    }

    //Add a custom greeting so your sorter can introduce itself
    public String greeting(){
        return ("i hate jazmine");
    }

}
