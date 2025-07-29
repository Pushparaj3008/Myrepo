public class LinearSearch {

    public static int toFindelement(int[] arr,int target) {
           for( int i=0;i<arr.length;i++) {
               if (arr[i] == target) {
                   return i;
               }

           }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] ={10,25,21,89,19,101};
        int target = 89;

        int result = toFindelement(arr,target);
        if(result == -1){
            System.out.println("element is not found");

        }
        else{
            System.out.println("element found at the position:" + result);;
        }

    }
}
