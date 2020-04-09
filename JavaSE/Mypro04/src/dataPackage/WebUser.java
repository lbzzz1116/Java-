package dataPackage;

public class WebUser {
	int id; //id
	String pwd; //密码
	String email;//email地址
	
	//构造方法1
	WebUser(int id,String pwd){
		this.id = id;
		this.pwd = pwd;
	}
	//构造方法2
	WebUser(int id,String pwd,String emial){
		this(id,pwd);
		this.email = email;
	}
	
	public void login() {//成员方法
		System.out.println("email地址是："+id+"@gameschool.com");
	}
	
	
	public static void main(String[] args) {
		WebUser WU = new WebUser(110,"123456");
		WU.login();
		}
	}

