package arraylistpractice;

import java.util.ArrayList;

public class Example1 {
	ArrayList<Integer> hi = new ArrayList<Integer>();

	public ArrayList<Integer> addElementsToArrayList() {
		for (int i = 0; i < 10; i++) {
			hi.add(i * i);
		}
		return hi;

	}

	public static void swap(ArrayList<Integer> list, int i, int j) {
		Integer temp = list.get(i);
		list.set(i, list.get(j));
		list.set(j, temp);
	}

	public static void main(String[] args) {
		Example1 e = new Example1();
		ArrayList<Integer> a = e.addElementsToArrayList();
		System.out.println(a);
		int l = a.get(4);
		System.out.println(l);
		a.set(0, 100);
		System.out.println(a);
		a.remove(4);
		System.out.println(a);
		System.out.println(a.size());
		a.add(4, 5);
		System.out.println(a);
		System.out.println(a.size());

		for (int z = 0; z < a.size(); z++) {
			a.set(z, a.get(z) - 1);
		}
		System.out.println(a);
		swap(a, 4, 3);
		System.out.println(a);

	}

}
