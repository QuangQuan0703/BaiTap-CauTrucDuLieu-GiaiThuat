package ThuatToanSapXep;

public class SelectionSort {
    int []arr;
    public SelectionSort(int [] arr){
        this.arr = arr;
    }
    public void print (){
        System.out.println("Bubble Sort");
        for (int i =0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public void Sort (){
        int temp;
        int lenght = this.arr.length;
        for (int i = 0; i < lenght -1; i++){
            int low = this.arr[i];
            for (int j = i + 1; j < lenght; j++){
                if (low > arr[j]){
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        print();
    }
}
