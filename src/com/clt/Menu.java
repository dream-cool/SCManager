package com.clt;

//610314681
import java.util.*;
import java.io.*;
class MainMenu {
	static Course cou=new Course();
	static Grade gra=new Grade();
	static Student stu=new Student(); 
	static boolean up=false;
	public int mainMemu(){
		System.out.println("\n\t\t�༶ѧ������ϵͳ");
		System.out.println("\n");
		System.out.println("\t******************");
		System.out.println("\t*1:ѧ����Ϣ����*******");
		System.out.println("\t*2:�γ���Ϣ����*******");
		System.out.println("\t*3:ѧ���ɼ�����*******");
		System.out.println("\t*4:�ɼ�ͳ�ƽ��*******");
		System.out.println("\t*5:��ʼ����Ϣ   *******");
		System.out.println("\t*0:�˳�ϵͳ**********");
		System.out.println("\t******************");
		System.out.println("��ѡ�������ţ�");
		Scanner in=new Scanner(System.in);
		int choice=in.nextInt();
		while(choice<0||choice>5){
			System.out.println("���ѡ�������������ȷ�ı�ţ�");
			choice=in.nextInt();
		}
		return choice;
		}
	public int xuesgl() throws FileNotFoundException, IOException, ClassNotFoundException{
		System.out.println("\n\t\tѧ����Ϣ����ϵͳ");
		System.out.println("\n");
		System.out.println("\t*******************");
		System.out.println("\t*1:����ѧ����Ϣ");
		System.out.println("\t*2:�޸�ѧ����Ϣ");
		System.out.println("\t*3:ɾ��ѧ����Ϣ");
		System.out.println("\t*4:��ѯѧ����Ϣ");
		System.out.println("\t*5:���ѧ����Ϣ");
		System.out.println("\t*0:������һ��");
		System.out.println("\t********************");
		System.out.println("��ѡ�������ţ�");
		Scanner in=new Scanner(System.in);
		int choice=in.nextInt();
		while(choice<0||choice>5){
			System.out.println("���ѡ�������������ȷ�ı�ţ�");
			choice=in.nextInt();
		}
		switch(choice){
		case 1:{{stu.inputStu();up=true;}xuesgl();break;}
		case 2:{{stu.xgxs();up=true;}xuesgl();break;}
		case 3:{{stu.scxs(cou,gra);up=true;}xuesgl();break;}
		case 4:{{stu.czxs();}xuesgl();break;}
		case 5:{{stu.showallStu(cou,gra);}xuesgl();break;}
		}
		selectOperat();
		return choice;
	}
	public int kecgl() throws FileNotFoundException, IOException, ClassNotFoundException{
		System.out.println("\n\t\t�γ���Ϣ����ϵͳ");
		System.out.println("\n");
		System.out.println("\t*******************");
		System.out.println("\t*1:���ӿγ���Ϣ");
		System.out.println("\t*2:��ѯ�γ���Ϣ");
		System.out.println("\t*3:�޸Ŀγ���Ϣ");
		System.out.println("\t*4:ɾ���γ���Ϣ");
		System.out.println("\t*5:����γ���Ϣ");
		System.out.println("\t*0:������һ��");
		System.out.println("\t********************");
		System.out.println("��ѡ�������ţ�");
		Scanner in=new Scanner(System.in);
		int choice=in.nextInt();
		while(choice<0||choice>5){
			System.out.println("���ѡ�������������ȷ�ı�ţ�");
			choice=in.nextInt();
		}
			switch(choice){
			case 1:{{cou.inputcou();up=true;}kecgl();break;}
			case 2:{cou.czkc();kecgl();break;}
			case 3:{{cou.xgkc();up=true;}kecgl();break;}
			case 4:{{cou.sckc(stu,gra);up=true;}kecgl();break;}
			case 5:{cou.showallcou(stu,gra);kecgl();break;}
			}
		selectOperat();
		return choice;
	}
	public int chengjgl() throws FileNotFoundException, IOException, ClassNotFoundException{
		System.out.println("\n\t\tѧ���ɼ�����ϵͳ");
		System.out.println("\n");
		System.out.println("\t***********************");
		System.out.println("\t*1:���γ���¼��ѧ���ɼ�");
		System.out.println("\t*2:��ѧ��ѧ��¼��ɼ�");
		System.out.println("\t*3:¼��ĳ�ſγ�ĳ��ѧ���ĳɼ�");
		System.out.println("\t*4:��ѧ��ѧ�Ų���ѧ���ɼ�");
		System.out.println("\t*5:���γ����Ʋ���ѧ���ɼ�");
		System.out.println("\t*6:����ĳ�ſγ�ĳ��ѧ���ĳɼ�");
		System.out.println("\t*7:�޸�ĳ�ſγ�ĳ��ѧ���ĳɼ�");
		System.out.println("\t*0:������һ��");
		System.out.println("\t***********************");
		System.out.println("��ѡ�������ţ�");
		Scanner in=new Scanner(System.in);
		int choice=in.nextInt();
		while(choice<0||choice>7){
			System.out.println("���ѡ�������������ȷ�ı�ţ�");
			choice=in.nextInt();
		}
			switch(choice){
			case 1:{{gra.kclr(stu,cou);up=true;}chengjgl();break;}
			case 2:{{gra.xslr(stu,cou);up=true;}chengjgl();break;}
			case 3:{{gra.drlr(stu,cou);up=true;}chengjgl();break;}
			case 4:{gra.xscjcz(stu,cou);chengjgl();break;}
			case 5:{gra.kccjcz(stu,cou);chengjgl();break;}
			case 6:{gra.drcjcz(stu,cou);chengjgl();break;}
			case 7:{{gra.xgcj(stu,cou);up=true;}chengjgl();break;}
			}
		selectOperat();	
		return choice;
	}
	public int chengjtj() throws FileNotFoundException, IOException, ClassNotFoundException{
		System.out.println("\n\t\t�ɼ�ͳ��ϵͳ");
		System.out.println("\n");
		System.out.println("\t*******************");
		System.out.println("\t*1:��������Ϣ");
		System.out.println("\t*2:ÿ�ſγ̵�ƽ���ɼ�");
		System.out.println("\t*3:����ĳ�ſγ�ƽ���ɼ�������");
		System.out.println("\t*0:������һ��");
		System.out.println("\t********************");
		System.out.println("��ѡ�������ţ�");
		Scanner in=new Scanner(System.in);
		int choice=in.nextInt();
		while(choice<0||choice>3){
			System.out.println("���ѡ�������������ȷ�ı�ţ�");
			choice=in.nextInt();
		}
			switch(choice){
			case 1:{gra.highestcj(stu,cou);chengjtj();break;}
			case 2:{gra.kcpjcj(stu,cou);chengjtj();break;}
			case 3:{gra.cgpjrs(stu,cou);chengjtj();break;}
			}
		selectOperat();	
		return choice;
	}
	public void selectOperat() throws FileNotFoundException, IOException, ClassNotFoundException {
		int choice;
		choice=mainMemu();
		switch(choice){
		case 1:{xuesgl();break;}
		case 2:{kecgl();break;}
		case 3:{chengjgl();break;}
		case 4:{chengjtj();break;}
		case 5:{new file().clear();break;}
		case 0:{System.out.println("ллʹ�ñ�ϵͳ���ټ���");
		System.exit(0);}
		}
	}
}
    public class Menu{
	 public static void main(String[]args) throws FileNotFoundException, IOException, ClassNotFoundException{
		File a=new File("f:/student.txt");
		File b=new File("f:/course.txt");
		File c=new File("f:/grade.txt");
		File d=new File("f:/studentnum.txt");
		File e=new File("f:/coursenum.txt");
		MainMenu m=new MainMenu();
		new Thread(new mythread()).start();
		if(a.length()==0||b.length()==0||c.length()==0||d.length()==0||e.length()==0) {
			m.selectOperat();
		}
		else {
			new file().read();
			m.selectOperat();
		}
	}
}
