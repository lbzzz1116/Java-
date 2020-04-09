package sn.sxt.oo;
import java.util.Arrays;
public class TestArray {
    public static void main(String[] args) {
        Object[] a1 = {1001,"高淇",18,"讲师","2006-2-14"};
        Object[] a2 = {1002,"高小七",19,"助教","2007-10-10"};
        Object[] a3 = {1003,"高小琴",20,"班主任","2008-5-5"};
        Object[][]  emps = new Object[3][];
        emps[0] = a1;
        emps[1] = a2;
        emps[2] = a3;
        System.out.println(Arrays.toString(emps[0]));
        System.out.println(Arrays.toString(emps[1]));
        System.out.println(Arrays.toString(emps[2]));  
    }
}
