/*Program to get second smallest element from the arra
author-L.S.Kanishka*/

package com.cg.Exercise1;

import java.util.Arrays;

public class App {

	public int getSecondSmallest(int[] numbers) {
		if(isEmpty(numbers)) {
			return 0;
		}
		else if(numbers.length==2) {
			return Math.max(numbers[0], numbers[1]);
		}
		else if(numbers.length==1)
		{
			return numbers[0];
		}
		else
		{
			Arrays.sort(numbers);
			return numbers[1];
		}
	}

	private boolean isEmpty(int[] numbers) {
		return numbers.length==0;
	}

}

