package dataPackage;

public class WebUser {
	int id; //id
	String pwd; //����
	String email;//email��ַ
	
	//���췽��1
	WebUser(int id,String pwd){
		this.id = id;
		this.pwd = pwd;
	}
	//���췽��2
	WebUser(int id,String pwd,String emial){
		this(id,pwd);
		this.email = email;
	}
	
	public void login() {//��Ա����
		System.out.println("email��ַ�ǣ�"+id+"@gameschool.com");
	}
	
	
	public static void main(String[] args) {
		WebUser WU = new WebUser(110,"123456");
		WU.login();
		}
	}

