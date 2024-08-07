public class nextGreaterElement {

    public static void main(String[] args) {

        int arr[] = {1, 5, -3, 7 ,1};

        int newarr[] = new int[arr.length];

    for(int  i= 0; i < arr.length; i++){
        for(int j=i; j<arr.length; j++){
            if(arr[j] > arr[i]){
                newarr[i] = arr[j]; 
                break;
        }


    }
        
    }
    
}
