package cn.sxt.oo2;

public class TeatEquals {
	public static void main(String[] args) {
		Object obj;
		String str;
		User u1 = new User(1000,"hehe","123456");
		User u2 = new User(1000,"hehehe","123456");
		
		System.out.println(u1 = u2);//不是同一个对象
		System.out.println(u1.equals(u2));//id相同则认为两个对象内容相同
		
		String str1 = new String("sxt");
		String str2 = new String("sxt");
		System.out.println(str1 = str2);//错误，不是同一个对象
		System.out.println(str1.equals(str2));//字符相同，内容相同
	}
}

class User{
	int id;
	String name;
	String pwd;

	public User(int id,String name,String pwd) {
		super();
		this.id = id;
		this.name = name;
		this.pwd = pwd;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (id != other.id)
			return false;
		return true;
	}

	
}	

