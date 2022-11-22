package min_heap;

import java.util.Scanner;

public class Min_heap {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		System.out.println("how many");
		int count=in.nextInt();
		int[] min=new int[count];
		int x;
		int temp;
		for(int i=1;i<count;i++) {
			x=i;
			//create or take input for data collection
			int num=in.nextInt();
			if(i==1) {
				min[i]=num;
			}
			else {
				//Store the input in min heap using array
				if(num<min[x/2]) {
					while(num<min[x/2]) {
						temp=min[x/2];
						min[x/2]=num;
						min[x]=temp;
						x=x/2;
					}
				}
				else {
					min[x]=num;
				}
			}
		}
		
		
		//to print contents in min heap
		int xy=1;
		int y=1;
		for(int i=1;i<count;i++) {
			System.out.print("\t"+min[i]);
			if(y==xy) {
				System.out.println("");
				xy=xy*2;
				y=0;
			}
			y++;
		}
		

	}

}
