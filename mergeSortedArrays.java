package dsa;

public class mergeSortedArrays {

	public static void main(String[] args) {
		int a[] = new int[7];
		a[0]=3;a[1]=5;a[2]=8;a[3]=10;
		int m = 4;
		int b[] = {1, 2, 6};
		int n = 3;
		sorted(a, m, b, n);
		System.out.println("The sorted array is:");
		for (int i = 0; i < m+n; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public static void sorted(int a[], int m, int b[], int n) {
		int k = m+n-1;
		int i = m-1;
		int j = n-1;

		while (i >= 0 && j >= 0) {
			if (a[i] > b[j]) {
				a[k--] = a[i--];
			} else {
				a[k--] = b[j--];
			}
		}

		while (i >= 0) {
			a[k--] = a[i--];
		}

		while (j >= 0) {
			a[k--] = b[j--];
		}
	}
}