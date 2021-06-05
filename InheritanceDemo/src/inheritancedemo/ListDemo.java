package inheritancedemo;

import java.util.LinkedList;

public class ListDemo {
	public static void main(String[] args) {
		LinkedList<Integer> arrayList = new LinkedList<>();
		arrayList.add(15);
		arrayList.add(4);
		arrayList.add(20);
		arrayList.add(66);
		arrayList.add(500);
		arrayList.add(20);
		arrayList.add(14);
		System.out.println(arrayList);
		arrayList.add(2, 50);
		System.out.println(arrayList);
		System.out.println(arrayList.contains(30));
		System.out.println(arrayList.get(4));
		arrayList.add(4, 150);
		System.out.println(arrayList);
		arrayList.remove(5);
		System.out.println(arrayList);
		System.out.println(arrayList.poll());
		System.out.println(arrayList.getFirst());
		System.out.println(arrayList.getLast());
		System.out.println(arrayList);
		arrayList.clear();
		System.out.println(arrayList);
		arrayList.getLast();
	}

}
