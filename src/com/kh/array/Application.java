package com.kh.array;

import com.kh.array.team.merge;

public class Application {

	public static void main(String[] args) {
//		A_Array arr = new A_Array();
//		arr.method1();
//		arr.method2();
//		arr.method3();
//		arr.method4();
//		arr.practice1();
//		arr.practice2();
		
//		new B_ArrayCopy().method1();
//		new B_ArrayCopy().method2();
//		new B_ArrayCopy().method3();
//		new B_ArrayCopy().method4();
//		new B_ArrayCopy().method5();
		
//		new C_ArraySort().method1();
//		new C_ArraySort().method2();
		
		merge a = new merge();
		
		int[] arr = {4, 7, 5, 33, 9, 10, 1, 2, 6};
		int startPoint = 0;  //시작지점을 저장하기 위한 변수
		int endPoint = arr.length-1; // 끝 지점을 저장하기 위한 변수
		
		a.printMerge(arr);
		a.mergeDiv(arr, startPoint, endPoint);
		a.printMerge(arr);
	}
}
