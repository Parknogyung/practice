package com.kh.array.team;

import com.kh.array.team.*;
import java.util.Arrays;
/*
 * [병합 정렬] 절반으로 나누고 병합하면서 정렬한다
mergeSort(a, m, middle); (left는 왼쪽으로 나눌게 없어질때까지 실행된다)
mergeSort(a, middle + 1, n); (right는 left가 끝나면 실행된다)
merge(a, m, middle, n);  (right가 끝나면 병합이 실행된다)

예시 7 6 5 8 3 5 9 1

1. left가 실행된다 7 6 5 8 -> 7 6 -> 7
2. left가 끝났으니 right가 실행된다 6
3. right가 끝났으니 merge함수가 실행된다 7과 6을 비교 후 6 7로 정렬
4. 정렬될 때까지 반복한다

전체적인 실행순서

7 6 5 8 -> 7 6 -> 7 -> 6 -> merge(6, 7) -> 5 8 -> 5 -> 8 -> merge(5, 8) -> merge(5, 6, 7, 8)
                                                                                                                                                      -> merge(1, 3, 5, 5, 6, 7, 8, 9) -> 1 3 5 5 6 7  8 9
3 5 9 1 -> 3 5 -> 3 -> 5 -> merge(3, 5) -> 9 1 -> 9 -> 1 -> merge(1, 9) -> merge(1, 3, 5, 9)
 */
public class merge {

	// a= 원본배열, p = 시작지점, r = 끝 지점
	public void mergeDiv(int[] a, int m, int n) {
		if(m < n) { //쪼개는 과정
			int mid = (m+n)/2;    //쪼개기 위한 중간 값
			
			mergeDiv(a, m, mid);
			mergeDiv(a, mid+1, n);
			merge(a, m, mid, n);
		}
	}
	// (m)****(mid)****(n)
	public void merge(int[] a, int m, int mid, int n) {
		int[] sort = new int[a.length];
		int i = m;        // 왼쪽의 처음
		int j = mid+1;    // 
		int idx = m;

		while((i <= mid) && (j <= n)) {
			if(a[i] <= a[j]) {
				sort[idx] = a[i];
				idx ++;
				i++;
			}
			else {
				sort[idx] = a[j];
				idx++;
				j++;
			}
		}
		if(i > mid) {
			for(int t = j; t <= n ; t++) {
				sort[idx] = a[t];
				idx++;
			}
		}
		else {
			for(int t = i; t <= mid; t++) {
				sort[idx] = a[t];
				idx++;
			}
		}
		for(int t = m; t <= n ; t++) {
			a[t] = sort[t];
		}
	}
	
	public void printMerge(int[] arr) {
		System.out.println(Arrays.toString(arr));
	}
}

