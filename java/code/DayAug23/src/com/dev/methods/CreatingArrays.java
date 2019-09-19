package com.dev.methods;

public class CreatingArrays {

	public static void main(String[] args) {
		//declaration
		int []array;
		int	[]array1;
		int array2[];
		int []arr;
		char[]charr;
		byte[]b;
		
		arr=new int[10];
		charr=new char[5];
		b=new byte[5];
		
		//intialization
		
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		arr[5]=6;
		arr[6]=7;
		arr[7]=8;
		arr[8]=9;
		arr[9]=10;
		charr[0]=1;
		charr[1]=2;
		charr[2]=3;
		charr[3]=4;
		charr[4]=5;
		b[0]=1;		
		b[1]=2;		
		b[2]=3;		
		b[3]=4;		
		b[4]=5;
		int res[];
		System.out.println(arr[4] + b[4]);
		System.out.println(arr[4]-b[4]);
		System.out.println(arr[4]*b[4]);
		System.out.println(arr[4]/b[4]);
		System.out.println(arr[4]%b[4]);
		
	}

}
