
public class Teat1 {
	public static void main(String[] args) {
		int i = (int)(6*Math.random()) + 1;
		int j = (int)(6*Math.random()) + 1;
		int k = (int)(6*Math.random()) + 1;
		int count = i + j +k;
		if(count > 15) {
			System.out.println("今天天气不错");
		}
		if(count >= 10 && count <=15) {
			System.out.println("今天手气一般");
		}
        if(count < 10) {
            System.out.println("今天手气不怎么样");
        }
        System.out.println("得了" + count + "分");
	}
}
