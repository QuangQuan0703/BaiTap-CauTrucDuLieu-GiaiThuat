package ThuatToanSapXep;

public class BubbleSort {
    int [] arr;
    public BubbleSort(int [] arr){
        this.arr = arr;
    }
    public void print(){
        System.out.println("Bubble Sort");
        for (int i =0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public void Sort (){
        int length = this.arr.length;
        int temp;
        for (int i =0; i < length -1; i++){
            for (int j = 0; j< length - i - 1; j++){
                if (arr[j] > arr[j + 1]){
                    temp = arr[j];
                    arr[j]= arr[j + 1];
                    arr[j +1] = temp;
                }
            }
        }
        print();
    }
}
