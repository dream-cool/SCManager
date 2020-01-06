package com.clt;


import java.io.*;
import java.util.Scanner;
public class file {
	public file() throws IOException {
		File a=new File("f:/student.txt");
		if(!a.exists())
			a.createNewFile();
		File b=new File("f:/course.txt");
		if(!b.exists())
			b.createNewFile();
		File c=new File("f:/grade.txt");
		if(!c.exists())
			c.createNewFile();
		File d=new File("f:/studentnum.txt");
		if(!d.exists())
			d.createNewFile();
		File e=new File("f:/coursenum.txt");
		if(!e.exists())
			e.createNewFile();
	}
	public void clear() {
		Scanner in=new Scanner(System.in);
		System.out.println("�Ƿ�ȷ��ɾ��������Ϣ�� 1.��  2.��");
		int i=in.nextInt();
		if(i==1) {
		File a=new File("f:/student.txt");
		if(a.exists())
			a.delete();
		File b=new File("f:/course.txt");
		if(b.exists())
			b.delete();
		File c=new File("f:/grade.txt");
		if(c.exists())
			c.delete();
		File d=new File("f:/studentnum.txt");
		if(d.exists())
			d.delete();
		File e=new File("f:/coursenum.txt");
		if(e.exists())
			e.delete();
		System.out.println("������Ϣ�ѱ�ɾ����");
		}
	}
	public void write() throws IOException {
		ObjectOutputStream a=new ObjectOutputStream(new FileOutputStream("f:/student.txt"));
		a.writeObject(MainMenu.stu.s);
		if(a!=null)
			a.close();
		ObjectOutputStream b=new ObjectOutputStream(new FileOutputStream("f:/course.txt"));
		b.writeObject(MainMenu.cou.c);
		if(b!=null)
			b.close();
		ObjectOutputStream c=new ObjectOutputStream(new FileOutputStream("f:/grade.txt"));
		c.writeObject(MainMenu.gra.grade);
		if(c!=null)
			c.close();
		ObjectOutputStream d=new ObjectOutputStream(new FileOutputStream("f:/studentnum.txt"));
		d.writeObject(MainMenu.stu.S);;
		if(d!=null)
			d.close();
		ObjectOutputStream e=new ObjectOutputStream(new FileOutputStream("f:/coursenum.txt"));
		e.writeObject(MainMenu.cou.C);
	    if(e!=null)
			e.close();
}

	public void read() throws IOException, ClassNotFoundException {
			ObjectInputStream a = new ObjectInputStream(new FileInputStream("f:/student.txt"));
			MainMenu.stu.s = (Student[])a.readObject();
			if(a!=null)
				a.close();
			ObjectInputStream b = new ObjectInputStream(new FileInputStream("f:/course.txt"));
			MainMenu.cou.c = (Course[])b.readObject();
			if(b!=null)
				b.close();
			ObjectInputStream c = new ObjectInputStream(new FileInputStream("f:/grade.txt"));
			MainMenu.gra.grade = (double[][])c.readObject();
			if(c!=null)
				c.close();
			ObjectInputStream d =new ObjectInputStream(new FileInputStream("f:/coursenum.txt"));
			MainMenu.cou.C = (int)d.readObject();
			if(d!=null)
			d.close();
			ObjectInputStream e =new ObjectInputStream(new FileInputStream("f:/studentnum.txt"));
			MainMenu.stu.S = (int)e.readObject();
			if(e!=null)
				e.close();
		}
	}
