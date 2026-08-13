public class program15 {
    public static void main(String[] args) {
        int arr[]={10,11,20,21,30,21,41,40};
        int size = arr.length;
        int temp=0;
        for(int process = 0 ;process <= size-2;process+=1){
            for(int cmp=0;cmp <size-2-process;cmp+=1){
                if(arr[cmp]>arr[cmp+1]){
                    temp=arr[cmp];
                    arr[cmp]=arr[cmp+1];
                    arr[cmp+1]=temp;
                }
            }
        }
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
}