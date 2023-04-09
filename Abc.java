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
						public static void main(String[] args) {
							int row=3;
							int col=3;
							int array[][]={{0,0,1},{0,1,1},{1,1,1}};
							
						

								
							Scanner sc = new Scanner(System.in);
							// int n = sc.nextInt();
							int arr[]={1,2,3,4,5};
							int idx=0;
							
							nof_1(array,row,col);
							// System.out.println("2 raise to the power "+n+" is : "+abc);
					}
					}
