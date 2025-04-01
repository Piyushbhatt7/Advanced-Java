public class MergeSort {
    
    public static void conquer(int arr[], int mid, int si, int ei)
    {
        int merged[] = new int[ei - si + 1];

        int index1 = si;
        int index2 = mid + 1;

        int x = 0;
        while (index1 <= mid && index2 <= ei) {
            if(arr[index1] <= arr[index2])
            {
                merged[x++] = arr[index1++];
            }
            else{
                merged[x++] = arr[index2++];
            }
        }

        while(index1 <= mid)
        {
            merged[x++] = arr[index1++];
        }

        while(index2 <= ei)
        {
            merged[x++] = arr[index2++];
        }

        for(int i = 0; i< merged.length; i++, j++)
        {
            if(si >= ei)
            {
                return;
            }
        }
    }
   public static void divide(int arr[], int si, int ei)
   {

    if(si >= ei)
    {
        return;
    }
     int mid = si + (ei - si) / 2;
     divide(arr, si, ei);
     divide(arr, mid + 1, ei);
   }

    public static void main(String args[])
    {
        int arr[] = {6,2,9,5,2,8};
        int n = arr.length;
    }
}
