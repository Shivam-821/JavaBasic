import java.util.Scanner;
class Multisort
{
	static void selectionSort(int[] arr,int n){	//Selection Sort
		System.out.println("Using Selection Sort:");
		for(int i=0;i<n-1;i++){
			int mini=i;
			for(int j=i+1;j<n;j++){
				if(arr[j]<arr[mini]) mini=j;
			}
			int temp=arr[mini];
			arr[mini]=arr[i];
			arr[i]=temp;
		}
	}
	static void bubbleSort(int[] arr, int n){	//Bubble Sort
		System.out.println("Using Bubble Sort:");
		for(int i=1;i<n;i++){
			for(int j=0;j<n-i;j++){
				if(arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			
		}
	}
	static void insertionSort(int[] arr,int n){	//Insertion Sort
		System.out.println("Using Insertion Sort");
		for(int i=0;i<n;i++){
			int j=i;
			while(j>0 && arr[j-1]>arr[j]){
				int temp=arr[j];
				arr[j]=arr[j-1];
				arr[j-1]=temp;
			} 
		}
	}
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the value of no. of elements: ");	int n= s.nextInt();
		int[] sort= new int[n];
		System.out.print("Enter the elements in array:  ");
		for(int i=0;i<n;i++){
			sort[i] = s.nextInt(); 
		}
		System.out.print("Original array: ");
		for(int i=0;i<n;i++){
			System.out.print(sort[i]+" "); 
		}
		System.out.println();
		//Apply Sorting: ///////////////\\\\\\\\\\\\\\\\/////////////////
		System.out.print("Enter 1 for Selection Sort, 2 for Bubble Sort and 3 for Insertion Sort: ");
		int optn = s.nextInt();
		switch(optn){
			case 1: selectionSort(sort,n);
				break;
			case 2: bubbleSort(sort,n);
				break;
			case 3: insertionSort(sort,n);
				break;
		}
		System.out.println("Sorted Array:  ");
		for(int i=0;i<n;i++){
			if(i==0)System.out.println("Using for loop");
			System.out.print(sort[i]+" "); 
		}
		System.out.println("\n"+"Using for each loop: ");
		for(int ar:sort){
			System.out.print(ar+" ");
		}
	}
}