public class BubbleSort {
    public static void main(String[] args){
        int[] a = {36, 19, 29, 12, 5};
        int temp;

        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a.length; j++ ){
                try{
                    if(a[j] < a[j+1]){
                        temp = a[j];
                        a[j] = a[j+1];
                        a[j+1] = temp;
                    }

                }catch (Exception e){

                }
            }
        }
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i] + " ");
        }
    }
}
