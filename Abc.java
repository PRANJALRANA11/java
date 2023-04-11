					import java.util.Scanner;
					

					public class Abc{
						static int sumOfno(int sum){
						// base case
						if(sum==0)
						return 1 ;
						// recurrsive relation
						if(sum%2==0){
							return sumOfno(sum-1)+sum; 
						}
						else{
							return sumOfno(sum-1)-sum;
						}
					}
				
						static void printarray(int[] arr, int idx){
							// base case
							if(idx==arr.length){
								return;
							}
							// self work
							System.out.println(arr[idx]);
							// recurence relation
							printarray(arr,idx+1);
						}
						
						static void nof_1(int[][] array,int row, int col){
							int count=1;
							int ans=0;
							for(int i=0; i<row;i++){
								for(int j=0;j<col;j++){
									if(array[i][j]!=0){
										if(count>j){
											count=j;
											ans =i;
										}	
								}
							}
						}System.out.println(ans);
					}
						static void maxofj_i(int arr[]){
							int ans=0;
							for(int i=0;i<arr.length;i++){
								for(int j=1;j<arr.length;j++){
									if(arr[i]<=arr[j]&&i<j){
										int max=j-i;
										
										if(max>ans){
											ans=max;
										}
									}
								}

							}System.out.println(ans);
						}
							static void majority(int arr[]){
								int n=arr.length,count=0;
								for(int i=0;i<arr.length;i++){
									for(int j=1;j<arr.length;j++){
										if(arr[i]==arr[j]){
											 count++;}
											if(count>n){             
												count=arr[i];
												System.out.println(count);
									}	
									}
								    }if(count==0)System.out.println("-1");
								
							}

							static void addSubarray(int subarr[]){
								int target=9;
								for(int i=0;i<subarr.length;i++){
									for(int j =0;j<subarr.length;j++){
										if(subarr[i]+subarr[j]==target&&i<j)System.out.println(i+" ,"+j);
									}
									
								}
							}
							static void addsum(int arr[]){
								int sum=0;
								for(int i=0;i<arr.length;i++){
									for(int j =1;j<arr.length;j++){
										int add=arr[i]+arr[j];
										if(sum<add){
											sum=add;
										}
									}
								}System.out.println(sum);
							}static int arraylist(int arr[],int target,int idx){
								int ans[]=new int[arr.length];
								if(idx>=arr.length)return ans();
							}
							
						public static void main(String[] args) {
							int target=3;
							int col=3;
							// int array[][]=new int[row][col];
							Scanner sc = new Scanner(System.in);
							// int n = sc.nextInt();
							int  arr[]={1,2,6,3,3};
							int idx=0;
							int array=arraylist(arr,target,idx);
							
						}
					}
