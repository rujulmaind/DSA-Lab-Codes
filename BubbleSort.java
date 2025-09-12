package test;


public class BubbleSort 
{
public static void bubblesort(int[] arr) 
{
int n=arr.length;
for(int i=0;i<n;i++) 
{
for(int j=0;j<n-i-1;j++) 
{
if(arr[j]>arr[j+1]) 
{
int temp=arr[j];
arr[j]=arr[j+1];
arr[j+1]=temp;
}
}
}
}
public static void main(String[] args) 
{
int[] arr = {1,3,5,7,9,2,4,6,8,0};
bubblesort(arr);
for (int num : arr) 
{
System.out.print(" "+num);
}
}
}
