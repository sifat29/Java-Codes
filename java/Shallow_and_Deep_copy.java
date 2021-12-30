
public class Shallow_and_Deep_copy {

	public static void main(String[] args) {
		int[] a;
		int[] b = { 1, 2, 3, 4, 5 };
		a = b;

		System.out.println("For SHALLOW COPY\nArray 'a' is: ");
		for (int i : a) {
			System.out.print(i + ", ");
		}
		System.out.println("\nArray 'b' is: ");
		for (int i : b) {
			System.out.print(i + ", ");
		}
		a[2] = 300;
		System.out.println("\nAfter changing a[2]=300:\nArray 'a' is: ");
		for (int i : a) {
			System.out.print(i + ", ");
		}
		System.out.println("\nArray 'b' is: ");
		for (int i : b) {
			System.out.print(i + ", ");
		}

		a = b.clone();
		System.out.println("\nFor DEEP COPY\nArray 'a' is: ");
		for (int i : a) {
			System.out.print(i + ", ");
		}
		System.out.println("\nArray 'b' is: ");
		for (int i : b) {
			System.out.print(i + ", ");
		}
		a[2] = 3;
		System.out.println("\nAfter changing a[2]=3\nArray 'a' is: ");
		for (int i : a) {
			System.out.print(i + ", ");
		}
		System.out.println("\nArray 'b' is: ");
		for (int i : b) {
			System.out.print(i + ", ");
		}

	}

}
