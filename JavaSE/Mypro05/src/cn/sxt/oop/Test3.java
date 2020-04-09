package cn.sxt.oop;

public class Test3 {
    public static void main(String[] args) {
    	Actor a = new Actor("刘德华");
    	a.showMovie();
    	a.showTV();
    	a.singSong();
    }
}

class Actor implements Movie,TV,Song{	//上述接口的实现		演员类
//构造方法
    public Actor(String name) {
    	System.out.println("大家好我是" + name);
   }	
//普通方法
    public void showMovie() {
    	System.out.println("我能演电影");
    }
    public void showTV() {
    	System.out.println("我能眼电视剧");
    }
    public void singSong() {
    	System.out.println("我会唱歌");
    }
}

interface Movie{
	public abstract void showMovie();
}

interface TV{
	public abstract void showTV();
}

interface Song{
	public abstract void singSong();
}