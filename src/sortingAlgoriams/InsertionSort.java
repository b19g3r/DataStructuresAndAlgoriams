/**   
 * @Package: sortingAlgoriams -- InsertionSort
 * @author: Shane  	Usage: 插入排序
 * @date: 2018年4月1日 下午8:40:49 
 */
package sortingAlgoriams;

import java.util.Arrays;

public class InsertionSort {

	/**
	 * Usage: 插入排序  -- InsertionSort
	 * Input: An array of n numbers  a[]
	 * Output: A permutation (reordering) a1[]
	 */
	public static void main(String[] args) {
		int[] a = {4,6,8,7,9,6,2,1,10,65,3,45};
		System.out.println(Arrays.toString(a));
		int j;
		for (int i=1;i<a.length;i++) {
			int key = a[i];
			for (j=i-1;j>=0;j--) {
				if(a[j] > key)
					a[j+1] = a[j];
				else {
					a[j+1] = key;
					break;
				}
			}
			if (j<0)
				a[0] = key;
		}
		System.out.println(Arrays.toString(a));		
	}
}
