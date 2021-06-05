package stack;

import java.util.Arrays;

public class TwoStacks {
	private int maxSize, top1, top2;
	private String[] array;

	public TwoStacks(int maxSize) {
		this.maxSize = maxSize;
		this.top1 = -1;
		this.top2 = maxSize;
		array = new String[maxSize];
	}

	public String[] getStack() {
		return array;
	}

	public int getTop1() {
		return top1;
	}

	public int getTop2() {
		return top2;
	}

	public void push1(String value) {
		if (top1 < top2 - 1) {
			array[++top1] = value;
		}
	}

	public void push2(String value) {
		if (top1 < top2 - 1) {
			array[--top2] = value;
		}
	}

	public String pop1() {
		String popStr = null;
		if (top1 > -1) {
			popStr = array[top1];
			array[top1] = null;
			top1--;

		}
		return popStr;
	}

	public String pop2() {
		String popStr = null;
		if (top2 < maxSize) {
			popStr = array[top2];
			array[top2] = null;
			top2++;
		}
		return popStr;
	}

	public static void main(String[] args) {
		TwoStacks t = new TwoStacks(5);
		t.push1("5");
		t.push1("2");
		t.push2("Hello");
		t.push2("Matthew");
		t.push2("Li");
		t.push2("A");
		System.out.println(Arrays.toString(t.getStack()));
		t.pop1();
		System.out.println(Arrays.toString(t.getStack()));
		t.push2("A");
		System.out.println(Arrays.toString(t.getStack()));
		t.pop2();
		System.out.println(Arrays.toString(t.getStack()));
		t.pop2();
		System.out.println(Arrays.toString(t.getStack()));
		t.push1("100");
		t.push1("45");
		System.out.println(Arrays.toString(t.getStack()));

	}
}
