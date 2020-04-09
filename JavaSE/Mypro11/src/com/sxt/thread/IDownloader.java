package com.sxt.thread;
/*
 * 多线程下载图片
 */
public class IDownloader implements Runnable{
	private String url;//远程路径
	private String name;//存储名字
	
	public IDownloader(String url, String name) {
		super();
		this.url = url;
		this.name = name;
	}
	
	@Override
	public void run() {
		WebDownloader wd = new WebDownloader();
		wd.download(url, name);
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		IDownloader td1 = new IDownloader("http://image.baidu.com/search/detail?ct=503316480&z=0&ipn=d&word=%E5%9B%BE%E7%89%87&hs=0&pn=0&spn=0&di=115280&pi=0&rn=1&tn=baiduimagedetail&is=0%2C0&ie=utf-8&oe=utf-8&cl=2&lm=-1&cs=1518682579%2C4064448354&os=137800112%2C210415073&simid=4232648521%2C779489696&adpicid=0&lpn=0&ln=30&fr=ala&fm=&sme=&cg=&bdtype=0&oriquery=&objurl=http%3A%2F%2Fpic27.nipic.com%2F20130313%2F9252150_092049419327_2.jpg&fromurl=ippr_z2C%24qAzdH3FAzdH3Fooo_z%26e3Bgtrtv_z%26e3Bv54AzdH3Ffi5oAzdH3F9AzdH3F8acAzdH3F0mc0nnbhvd9ab8bl_z%26e3Bip4s&gsm=&islist=&querylist=","风景");
		IDownloader td2 = new IDownloader("http://image.baidu.com/search/detail?ct=503316480&z=0&ipn=d&word=%E5%9B%BE%E7%89%87&hs=0&pn=6&spn=0&di=100980&pi=0&rn=1&tn=baiduimagedetail&is=0%2C0&ie=utf-8&oe=utf-8&cl=2&lm=-1&cs=2241344963%2C3314667459&os=1609153566%2C7968812&simid=4100879561%2C540132533&adpicid=0&lpn=0&ln=30&fr=ala&fm=&sme=&cg=&bdtype=0&oriquery=&objurl=http%3A%2F%2Fphotocdn.sohu.com%2F20120323%2FImg338614056.jpg&fromurl=ippr_z2C%24qAzdH3FAzdH3F65ss_z%26e3Bf5i7_z%26e3Bv54AzdH3Fda8dandnAzdH3Fgnnbm89acn_z%26e3Bfip4s&gsm=&islist=&querylist=","彩虹");
		IDownloader td3 = new IDownloader("http://image.baidu.com/search/detail?ct=503316480&z=0&ipn=d&word=%E5%9B%BE%E7%89%87&hs=0&pn=8&spn=0&di=165770&pi=0&rn=1&tn=baiduimagedetail&is=0%2C0&ie=utf-8&oe=utf-8&cl=2&lm=-1&cs=4171436242%2C424026319&os=3593382307%2C342905541&simid=159451110%2C867223818&adpicid=0&lpn=0&ln=30&fr=ala&fm=&sme=&cg=&bdtype=0&oriquery=&objurl=http%3A%2F%2Fimg01.3dmgame.com%2Fuploads%2Fallimg%2F130417%2F153_130417091610_1.jpg&fromurl=ippr_z2C%24qAzdH3FAzdH3Fooo_z%26e3Bn142w4j_z%26e3Bv54AzdH3FgjofAzdH3Fda8na9AzdH3F90mmd8_z%26e3Bip4s&gsm=&islist=&querylist=","梅西");
		
		//启动三个线程
		new Thread(td1).start();
		new Thread(td2).start();
		new Thread(td3).start();
	}
}


















