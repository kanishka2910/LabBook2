/*Reverse and Sort Array
 * author-L.S.Kanishka
 */
import java.util.*;
public class Exercise3 {

	public static void main(String[] args) {
		int [] array = getInputArray();
		int length = array.length;
		array = getSorted(array);
		System.out.print("Sorted Array---> ");
		for(int index=0;index<length;index++) {
			System.out.print(array[index]+" ");
		}
	}

	private static int[] getSorted(int[] array) {
		int length = array.length;
		for(int index=0;index<length;index++) {
			StringBuilder sb = new StringBuilder();
			sb.append(array[index]+"");
			sb.reverse();
			array[index]=Integer.parseInt(sb.toString());
		}
		Arrays.sort(array);
		return array;
	}

	private static int[] getInputArray() {
		Scanner sc = new Scanner(System.in);
		int size;
		System.out.println("Enter the size of  array");
		size = sc.nextInt();
		int [] array = new int[size];
		System.out.println("Enter the elements");
		for(int index=0;index<size;index++) {
			array[index]=sc.nextInt();
		}
		sc.close();
		return array;
	}

}