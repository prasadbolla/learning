package java8learning.search;

import java.util.Arrays;

class BinarySearchExample{  
 public static void binarySearch(int arr[], int first, int last, int key){  
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
   
   int arra[] = {1, 2, 3, 4, 5, 7, 6, 9, 8};
   Arrays.sort(arra);
   search(arra, 0, arra.length, 7);
   
   
 }  
 
 public static void search(int a[], int first, int last, int searchKey) {
	 int mid = (first + last)/2;
	 while(first <= last) {
		 if(a[mid] < searchKey) {
			 first = mid + 1;
		 }else if(a[mid]==searchKey) {
			 System.out.println("Element found::"+mid);
			 break;
		 }else {
			 last = mid-1;
		 }
		 mid=(first+last)/2;
	 }
	 if (first > last) {
		 System.out.println("Element not found");
	 }
 }
 public static void main(String args[]){  
        int arr[] = {10,20,30,40,50};  
        int key = 30;  
        int last=arr.length-1;  
        binarySearch(arr,0,last,key);     
 }  
}  