package com.clt;

import java.io.Serializable;
import java.util.*;
class Student implements Serializable{
	     /**
		 * 
		 */
	    String stuNo;//����ѧ��
	    String stuName;//����
	    String Sex;//�Ա�
	    String age;//����
		public static int S=0;//ѧ������
	    static Student[] s=new Student[100];//ѧ����Ϣ����
		public void inputStu(){//���ѧ����Ϣ
			System.out.println("��������Ҫ��ӵ�ѧ����Ϣ��");
			s[S]=new Student();
			Scanner in=new Scanner(System.in);
			Scanner in1=new Scanner(System.in);
			System.out.print("ѧ��:");
			String x=in.nextLine();
			for(int i=0;i<S;i++) {
				if(x.equals(s[i].stuNo)) {
					System.out.println("���и�ѧ����ѧ����Ϣ");
					return;
				}
			}
			s[S].stuNo=x;
			System.out.print("����:");
			s[S].stuName=in.nextLine();
			System.out.print("�Ա�:");
			String xb=in.nextLine();
			while(!xb.equals("��")&&!xb.equals("Ů")) {
				System.out.print("��������ȷ���Ա�");
				xb=in.nextLine();
			}
			s[S].Sex=xb;
			System.out.print("����:");
			String nl=in.nextLine();
			s[S].age=nl;
			System.out.print("ѧ����Ϣ��ӳɹ�!");
			S++;
		}
		public void showStu(int j){//��ʾѧ����Ϣ
			System.out.println("ѧ�ţ�"+s[j].stuNo+"\t"+"������"+s[j].stuName+"\t"+"�Ա�:"+s[j].Sex+"\t"+"����:"+s[j].age);
		}
		public void czxs() {//����ѧ����Ϣ
			System.out.print("��������Ҫ���ҵ�ѧ��ѧ��:");
			Scanner in=new Scanner(System.in);
			String x=in.nextLine();
			for(int i=0;i<S;i++)
			{
				if(x.equals(s[i].stuNo)){
					System.out.print("���ҳɹ�");
					showStu(i);
					return;
				}
			}
			System.out.print("û���ҵ���Ҫ���ҵ�ѧ����Ϣ");
		}
		public void scxs(Course cou,Grade gra){//ɾ��ѧ����Ϣ
			int j=0,k=0;
			System.out.print("��������Ҫɾ����ѧ��ѧ��:");
			Scanner in=new Scanner(System.in);
			String x; x=in.nextLine();
			for(j=0;j<S;j++)
			{
				if(x.equals(s[j].stuNo)){
					k=1;
					break;
				}
			}
			if(k==1){
				for(;j<=S;j++){
				s[j]=s[j+1];//����ɾ��
				for(int i=0;i<cou.C;i++)
				{
				gra.grade[i][j]=gra.grade[i][j+1];//�ɼ����н���
					}
			}
			System.out.print("ɾ���ɹ�");
			S--;
			}
			else{
				System.out.print("û���ҵ���Ҫɾ����ѧ����Ϣ");
			}
				
		}
		public void xgxs() {//�޸�ѧ����Ϣ
			int i=0,k=0;
			String xh;
			System.out.print("��������Ҫ�޸ĵ�ѧ��ѧ��:");
			Scanner in=new Scanner(System.in);
			Scanner in1=new Scanner(System.in);
			xh=in.nextLine();
			for(i=0;i<S;i++)
			{
				if(xh.equals(s[i].stuNo)){
					k=1;
					break;
				}
			}
			if(k==1){
				System.out.println("��ѡ����Ҫ�޸ĵ�ѧ������Ϣ");
				System.out.println("0��ȫ���޸�"+"\t"+"1:ѧ�ţ�"+s[i].stuNo+"\t"+"2:������"+s[i].stuName+"\t"+"3:�Ա�:"+s[i].Sex+"\t"+"4:����:"+s[i].age);
				int choice=in1.nextInt();
				while(choice<0||choice>6){
					System.out.println("���ѡ�������������ȷ�ı�ţ�");
					choice=in1.nextInt();
				}	
				switch(choice){
				case 0:{System.out.println("�������µ�ѧ����Ϣ");
				        System.out.print("ѧ��:");
				        String x=in.nextLine();
				        for(int j=0;j<S;j++) {
							if(x.equals(s[j].stuNo)) {
								System.out.println("���и�ѧ����ѧ����Ϣ");
								return;
							}
						}
				        s[i].stuNo=x;
				        System.out.print("����:");
				        s[i].stuName=in.nextLine();
				        System.out.print("�Ա�:");
				        String xb=in.nextLine();
						while(!xb.equals("��")&&!xb.equals("Ů")) {
							System.out.print("��������ȷ���Ա�");
							xb=in.nextLine();
						}
						s[i].Sex=xb;
				        System.out.print("����:");
				        String nl=in.nextLine();
						s[i].age=nl;
				        System.out.print("ѧ����Ϣ�޸ĳɹ�");break;}
				case 1:{
				        System.out.print("ѧ��:");
				        String xh1=in.nextLine();
				        for(int m=0;m<S;m++) {
							if(xh1.equals(s[m].stuNo)) {
								System.out.println("���и�ѧ����ѧ����Ϣ");
								return;
							}
						}
				        s[i].stuNo=xh1;
		                System.out.print("ѧ����Ϣ�޸ĳɹ�");break;}
				case 2:{
				        System.out.print("����:");
		                s[i].stuName=in.nextLine();
		                System.out.print("ѧ����Ϣ�޸ĳɹ�");break;}
				case 3:{
				        System.out.print("�Ա�:");
				        String xb=in.nextLine();
						while(!xb.equals("��")&&!xb.equals("Ů")) {
							System.out.print("��������ȷ���Ա�");
							xb=in.nextLine();
						}
						s[i].Sex=xb;
		                System.out.print("ѧ����Ϣ�޸ĳɹ�");break;}
				case 4:{
				        System.out.print("����:");
				        String nl=in.nextLine();
						s[i].age=nl;
		                System.out.print("ѧ����Ϣ�޸ĳɹ�");break;}
				
			}}
			else{
				System.out.print("û���ҵ���Ҫ�޸ĵ�ѧ����Ϣ");
			}		
		}
		public void showallStu(Course  cou,Grade gra) {//���ѧ����Ϣ
			if(S==0){
				System.out.println("û��ѧ����Ϣ");
			}
			for(int j=0;j<S;j++) {
			System.out.println("ѧ�ţ�"+s[j].stuNo+"\t"+"������"+s[j].stuName+"\t"+"�Ա�:"+s[j].Sex+"\t"+"����:"+s[j].age+"hashֵ:"+s.hashCode());
				for(int i=0;i<cou.C;i++) {
					System.out.println("�γ�:"+cou.c[i].couName+"\t"+"�ɼ���"+gra.grade[i][j]);
				}
			}
		}
}