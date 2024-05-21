package com.Anuja;

import java.util.ArrayList;
import java.util.TreeSet;

public class PrintSecnodMaxNumber {
	public static void secondMaxNum() {
		int[] x = { 5, 48, 78, 96, 45, 78, 78, 62, 54 };
		TreeSet ax = new TreeSet();
		for (int i = 0; i < x.length; i++) {
			ax.add(x[i]);
		}
		System.out.println(ax.floor(78));

		System.out.println(ax);
		System.out.println(ax.pollLast());
		System.out.println(ax.last());
		System.out.println(ax.headSet(ax.last()).last());

	}

	public static void main(String[] args) {
		secondMaxNum();
	}

}
