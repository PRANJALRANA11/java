					import java.util.*;
					

					public class Abc{ 
					class Solution {
						static void swap(int arr[],int j){
							int temp=arr[j];
									arr[j]=arr[j+1];
									arr[j+1]=temp;
							for(int k:arr)
								{
									System.out.println(k+ " ");
								}		
						}
						
						static int  jump(int arr[],int idx){
							int count=0;	
							// base case 
							if(idx==arr.length-1)return count;
							// self work
							for(int i=0;i<arr.length;i++){
							
									
										int ju=arr[i];
										idx=ju;
										count++;
									}
									// relation
							jump(arr,idx);
							return count;
								}	
								
								
							
							

						
						public static void main(String[] args) {
							int target=3;
							int col=3;
							int matrix[][]={{1,2,3},{4,5,6},{7,8,9}};
							Scanner sc = new Scanner(System.in);
							// int n = sc.nextInt();
							 int [] arr={2,3,1,1,4};
							int idx=0;
							int  currans=1;
							System.out.println(jump(arr,idx)); 
						}
					}
				}
