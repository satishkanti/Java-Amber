import java.util.Scanner;
public class ArrayMenuDrivenExample {

    static void bubbleSort(int[] arr){
        int n = arr.length;
        int temp = 0;
        for(int i=0;i<n;i++){
            for(int j=1;j<(n-i);j++){
                if(arr[j-1]>arr[j]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < arr.length; j++){  
                if (arr[j] < arr[index]){  
                    index = j; 
                }  
            }  
            int smallerNumber = arr[index];   
            arr[index] = arr[i];  
            arr[i] = smallerNumber;  
        }  
    }

    static void binarySearch(int[] arr, int first, int last, int key){
        int mid = (first + last)/2;  
        while( first <= last ){  
            if ( arr[mid] < key ){  
                first = mid + 1;     
            }else if ( arr[mid] == key ){  
                System.out.println("Element is found at index: " + mid);  
                break;  
            }else{  
                last = mid - 1;  
            }  
            mid = (first + last)/2;  
        }  
        if ( first > last ){  
            System.out.println("Element is not found!");  
        } 
    }

    static void mergeArray(){
        int a[] = {30, 25, 40,};
        int b[] = {45, 50, 44, 60, 67};

        int a1 = a.length;
        int b1 = b.length;

        int c1 = a1 + b1;

        int c[] = new int[c1];

        for (int i = 0; i < a1; i = i + 1) { 
            c[i] = a[i]; 
        } 
  
        for (int i = 0; i < b1; i = i + 1) { 
            c[a1 + i] = b[i]; 
        } 
   
        for (int i = 0; i < c1; i = i + 1) { 
              
            System.out.println(c[i] + " "); 
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {3,60,35,2,45,32,5};
        int key = 1;
        int last = arr.length-1;
        int ch = 0;
        while(ch!=5){
            System.out.println("\n===== MENU =====\n1.Bubble Sort\n2.Selection Sort\n3.Binary Search\n4.Merge Two Arrays\n5.Exit\n");
            ch = sc.nextInt();
            System.out.println();
            switch(ch){
                case 1:
                    bubbleSort(arr);
                    for(int i=0; i < arr.length; i++){  
                        System.out.print(arr[i] + " ");  
                    }  
                    break;
                case 2:
                    selectionSort(arr);
                    for(int i:arr){  
                        System.out.print(i+" ");  
                    }  
                    break;
                case 3:
                    binarySearch(arr, 0, last, key);
                    break;
                case 4:
                    mergeArray();
                    break;
                case 5: 
                    System.out.println("Exiting the Menu.....");
                    break;
                default:
                    System.out.println("Inavlid choice!\nPlease enter a valid number between 1 and 5!");
            }
        }
        sc.close();
    }
}