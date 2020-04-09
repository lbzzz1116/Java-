package cn.sxt.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * ≤‚ ‘∑∫–Õ
 * 
 */
public class TestGeneric {
	public static void main(String[] args) {
		MyCollection<String> mc = new MyCollection<String>();
		mc.set("∏ﬂ∆È", 0);
		mc.set(8888, 1);
		
		Integer a = (Integer)mc.get(1);
		String b = (String)mc.get(0);
		
		List list = new ArrayList();
		Map map = new HashMap(); 
		
	}
}
class MyCollection<E>{
	Object[] objs = new Object[5];
	
	public void set(Object obj,int index) {
		objs[index] = obj;
	}
	
	public Object get(int index) {
		return objs[index];
	}
}
