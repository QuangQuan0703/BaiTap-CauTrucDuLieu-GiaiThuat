package ThuatToanSapXep;

public class QuickSort {
    int [] arr;
    public QuickSort(int [] arr){
        this.arr = arr;
    }
    public void Sort (int low, int hight){
        int i = low;
        int j = hight;
        int povit = arr[hight];
        int temp;
        while (i <= j){
            while (arr[i] < povit){
                i++;
            }
            while (arr[j] > povit){
                j--;
            }
            if (i <= j){
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        if (low < hight){
            Sort(low, j);
            Sort(i, hight);
        }

    }
    public void print(){
        System.out.println("Quick Sort");
        for (int i =0; i < arr.length; i++){
            System.out.print(this.arr[i] + " ");
        }
        System.out.println();
    }
}
