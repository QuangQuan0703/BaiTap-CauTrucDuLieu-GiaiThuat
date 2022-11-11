package ThuatToanSapXep;

public class QuickSort {
    int [] arr;
    public QuickSort(int [] arr){
        this.arr = arr;
    }
    public int Sort (int low, int hight){
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
        return j;
    }
    public void quickSort(int low, int hight){
        if (low < hight){
            int povit = Sort(low,hight);
            int povit1 = Sort(low,hight) + 1;
            quickSort(low, povit);
            quickSort(povit1 , hight);
        }
        if(low >= hight){
            return;
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
