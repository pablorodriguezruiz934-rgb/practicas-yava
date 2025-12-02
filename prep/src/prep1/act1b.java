package prep1;

import java.util.Scanner;

public class act1b {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int [] nums = new int [100];
	for(int i=0;i<nums.length;i++) {
		nums[i] = (int) ((Math.random() * 501));
	}
	for(int i=0;i<nums.length;i++) {
		System.out.print(nums[i]+" ");
	}
	System.out.println();
	System.out.println("1 = destacar minimo");
	System.out.println("2 = destacar maximo");
	int selec=sc.nextInt();
	if(selec==1) {
		int min= nums[0];	
		for(int i =0;i<nums.length;i++) {
			if(nums[i]<min) {
				min=nums[i];
				
			}
			
		}
		for (int i = 0; i < nums.length; i++) {
		    if (nums[i] == min) {
		        System.out.print("**" + nums[i] + "** ");
		    } else {
		        System.out.print(nums[i] + " ");
		    }
		}
	}
	if(selec==2) {
		int max=nums[0];	
		for(int i =0;i<nums.length;i++) {
			if(nums[i]>max) {
				max=nums[i];

			}
		}
		for (int i = 0; i < nums.length; i++) {
		    if (nums[i] == max) {
		        System.out.print("**" + nums[i] + "** ");
		    } else {
		        System.out.print(nums[i] + " ");
		    }
		}
	}
	sc.close();
}
}
