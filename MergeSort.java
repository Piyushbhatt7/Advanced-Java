public class MergeSort {
    
    public static void conquer(int arr[], int mid, int si, int ei)
    {
        
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
