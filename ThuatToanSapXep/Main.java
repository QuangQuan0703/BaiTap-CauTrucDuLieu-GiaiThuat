package ThuatToanSapXep;

public class Main {
    public static void main(String[] args) {
        int [] arr1 = {4,2,5,44,3,1,6,7,4,12,986,4,523};
        int [] arr2 = {4,2,5,44,3,1,6,7,4,12,986,4,523};
        int [] arr3 = {4,2,5,44,3,1,6,7,4,12,986,4,523};
        BubbleSort bubbleSort = new BubbleSort(arr1);
        bubbleSort.Sort();
        SelectionSort selectionSort = new SelectionSort(arr2);
        selectionSort.Sort();
        QuickSort quickSort = new QuickSort(arr3);
        int lenght = arr3.length -1;
        quickSort.Sort(0, lenght );
        quickSort.print();
    }
}
