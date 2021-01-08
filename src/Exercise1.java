/* second smallest element
 * author-L.S.Kanishka
 */

import java.util.Arrays;

public class Exercise1 {
public static void main(String[]args)
{
	int []arr= {1,7,2,4,9,8};
	getSeconSmallest(arr);
}

private static int getSeconSmallest(int[] arr) {
	Arrays.sort(arr);
	if(arr.length==0)
	{
		return 0;
	}
	else
	{
		System.out.println(arr[1]);
	}
	
	return 0;
}
}
