package sb1;

import java.security.PublicKey;
import java.util.Scanner;

public class Goodgoodstudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    System.out.println("hello world!");
	    Student student = new Student();
	    System.out.println(student.name);
	    System.out.println(student.score);
	    student.printName();
	    student.printScore();
	    student.changeName();
	    student.changeScore();
	    student.printName();
	    student.printScore();
	}

}
class Student {
	public String name;
	public double score;
	private Scanner in;
	public String changeName() {
//		String name;
		in = new Scanner(System.in);
		System.out.print("请输入学生姓名：");
		this.name = in.next();
		return this.name;

	}
	public double changeScore() {
		double score;
		in = new Scanner(System.in);
		System.out.print("请输入学生分数：");
		this.score = in.nextInt();
		return this.score ;

	}
	public void printName() {
		System.out.println("这个学生的名字为：" + this.name + "\n");
	}
	public void printScore() {
		System.out.println(name + "的分数为：" + this.score + "\n");
	}
	public void read() {
		// dosomething
		
	}
}


