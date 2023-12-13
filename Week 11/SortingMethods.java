import java.util.*;

interface Sortable{
    public void sort(int[] array);
}

class BubbleSort implements Sortable {
    public void sort(int[] array) {
        int swap;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    swap = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = swap;
                }
            }
        }
    }
}

class SelectionSort implements Sortable {
    public void sort(int[] array) {
        int temp;
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }
}

class SortingMethods{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Sortable bubblesort = new BubbleSort();
        Sortable selectionsort = new SelectionSort();

        int mainmenuoption = 0;

        int[] thisarrayneedstobesorted;
            
        System.out.print("Enter the number of elements: ");
        int numberofelements = sc.nextInt();
        sc.nextLine();
            
        thisarrayneedstobesorted = new int[numberofelements];

        for (int i = 0; i < numberofelements; i++){
            System.out.print("Enter the element: ");
            thisarrayneedstobesorted[i] = sc.nextInt();
        }

        while (mainmenuoption != 3) {
            System.out.print("\n\n\n\t\t\t\tMain Menu\n1. Use BubbleSort to sort an array \n2. Use Selectionsort to sort an array\n3. Exit\nEnter your choice: ");
            mainmenuoption = sc.nextInt();
            sc.nextLine();

            if (mainmenuoption == 1){
                System.out.println("Sorted by BubbleSort\nSorted Array");
                bubblesort.sort(thisarrayneedstobesorted);
                displaysortedarray(thisarrayneedstobesorted);
            }

            else if (mainmenuoption == 2){
                System.out.println("Sorted by SelectionSort\nSorted Array");
                selectionsort.sort(thisarrayneedstobesorted);
                displaysortedarray(thisarrayneedstobesorted);
            }

            else{
                break;
            }
        }
        sc.close();
    }

    static void displaysortedarray(int[] arrayaftersortoperation){
        for (int i = 0; i < (arrayaftersortoperation.length); i++){
            System.out.println(arrayaftersortoperation[i]);
        }
    }
}
