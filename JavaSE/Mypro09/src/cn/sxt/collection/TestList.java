package cn.sxt.collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestList {
	public static void main(String[] args) {
		Collection<String> c = new ArrayList<>();
		
		System.out.println(c.size());
		System.out.println(c.isEmpty());
		c.add("���ϴ�");
		c.add("���϶�");
		System.out.println(c);
		System.out.println(c.size());
		
		Object[] objs = c.toArray();
		System.out.println(objs);
		
		c.remove("���϶�");
		System.out.println(c);
		
		c.clear();
		System.out.println(c);
		
		
		
		
	}
}
