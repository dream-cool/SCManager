package com.clt;


import java.io.Serializable;
import java.util.Scanner;
public class Grade implements Serializable {
	public static double grade[][]=new double[100][100];//i����γ���Ϣ��j����ѧ����Ϣ
	public void kclr(Student stu,Course  cou){//���γ�¼��ѧ���ɼ�
		int m=0,n=0;
		Scanner in=new Scanner(System.in);
		Scanner in1=new Scanner(System.in);
		Scanner in2=new Scanner(System.in);
	    System.out.print("������γ�����");
		String t=in.nextLine();
	    for(int i=0;i<cou.C;i++){//Ѱ�ҿγ�
	    	if(t.equals(cou.c[i].couName)){m=1;
	    		for(int j=0;j<stu.S;j++){//������ѧ�����гɼ�¼��
	    			n=1;
	    			if(grade[i][j]>0){
	    				System.out.println("�ÿγ�ѧ��Ϊ"+stu.s[j].stuNo+"��ѧ�����гɼ�"+grade[i][j]+"���Ƿ�����¼�룬1������¼��          0��¼����һһѧ���ɼ�");
	    				int xz=in1.nextInt();
	    				if(xz==1){
	    					System.out.print("������ѧ��Ϊ"+stu.s[j].stuNo+"��ѧ���µĳɼ�");
	    	    			double c=in2.nextDouble();
	    	    			while(c<0) {
	    	    				System.out.println("¼��ĳɼ�����Ϊ������������¼��");
	    	    				c=in2.nextDouble();
	    	    			}
	    					grade[i][j]=c;//���ɼ�����ά����Ķ�Ӧλ��
	    			 System.out.println("¼��ɹ���ѧ��:"+stu.s[j].stuNo+"   �ɼ���"+grade[i][j]);
	    				}
	    			}
	    			else{
	    			System.out.print("������ѧ��Ϊ"+stu.s[j].stuNo+"��ѧ���ɼ�");
	    			double c=in2.nextDouble();
	    			while(c<0) {
	    				System.out.println("¼��ĳɼ�����Ϊ������������¼��");
	    				c=in2.nextDouble();
	    			}
	    			grade[i][j]=c;//���ɼ�����ά����Ķ�Ӧλ��
	    			System.out.println("¼��ɹ���ѧ��:"+stu.s[j].stuNo+"   �ɼ���"+grade[i][j]);}
	    		}
	    	}
	    }if(m==0) {System.out.println("û���ҵ���Ӧ�γ���Ϣ");{//�жϿγ��Ƿ�Ϊ��
	    	for(int j=0;j<stu.S;j++){//�γ���ϢΪ��ʱ�޷�����ѭ�������޷��ж�ѧ����Ϣ�Ƿ�Ϊ����Ҫ�����ж�
    			n=1;}
	    if(n==0){System.out.print("û���ҵ�ѧ����Ϣ");return;	}//�ж�ѧ���Ƿ�Ϊ��
	    }{for(int j=0;j<stu.S;j++){
			n=1;}
         if(n==0) System.out.print("û���ҵ�ѧ����Ϣ");	   	
	    }
	    }
		}
	public void xslr(Student stu,Course  cou){//��ѧ��¼��γ̳ɼ�
		int m=0,n=0,pd=0;
		Scanner in=new Scanner(System.in);
		Scanner in1=new Scanner(System.in);
		Scanner in2=new Scanner(System.in);
	    System.out.print("������ѧ��ѧ�ţ�");
		String t=in.nextLine();
	    for(int j=0;j<stu.S;j++){//Ѱ��ѧ��
	    	if(t.equals(stu.s[j].stuNo)){
	    		m=1;
	    		System.out.print("��ѡ���ȫ���γ�¼�����ѡ��ĳһ�γ�¼��");
	    		System.out.print("1:ȫ���γ�¼��             2��ѡ��γ�¼��");
	    		int lr=in1.nextInt();
	    		if(lr==2){
	    			System.out.print("��������Ҫѡ��¼��Ŀγ�");
	    			String kc=in.nextLine();
	    			for(int i=0;i<cou.C;i++){
		    			if(kc.equals(cou.c[i].couName)){
		    				    pd=1;
		    					if(grade[i][j]>0){
				    				System.out.println("��ѧ���ÿγ����гɼ�"+grade[i][j]+"���Ƿ�����¼�룬1������¼��          0���˳�");
				    				int xz=in1.nextInt();
				    				if(xz==1){
				    					System.out.print("������ѧ��Ϊ"+stu.s[j].stuNo+"�γ�Ϊ"+cou.c[i].couName+"�µĳɼ�");
					    			    double c=in2.nextDouble();
					    				while(c<0) {
				    	    				System.out.println("¼��ĳɼ�����Ϊ������������¼��");
				    	    				c=in2.nextDouble();
				    	    			}
				    					grade[i][j]=c;//���ɼ�����ά����Ķ�Ӧλ��
				    			      System.out.println("¼��ɹ���ѧ��:"+stu.s[j].stuNo+"   �ɼ���"+grade[i][j]);
				    				}
				    			}
							 else{
							 System.out.print("������ѧ��Ϊ"+stu.s[j].stuNo+"�γ�Ϊ"+cou.c[i].couName+"�ĳɼ�");
							 double c=in2.nextDouble();
								while(c<0) {
		    	    				System.out.println("¼��ĳɼ�����Ϊ������������¼��");
		    	    				c=in2.nextDouble();
		    	    			}
							 grade[i][j]=c;
							 System.out.println("¼��ɹ���ѧ��:"+stu.s[j].stuNo+"   �γ�:"+cou.c[i].couName+"   �ɼ���"+grade[i][j]);
							 }
		    			}
		        }if(pd==0)System.out.print("û���ҵ���Ҫ¼��Ŀγ�");
	    			}
	    		else{
	    		for(int i=0;i<cou.C;i++){//���ҵ���ѧ�������пγ̳ɼ�����¼��
	    			n=1;
	    			if(grade[i][j]>0){
	    				System.out.println("��ѧ����"+cou.c[i].couName+"�γ����гɼ�"+grade[i][j]+"���Ƿ�����¼�룬1������¼��          0��¼����һ�ųɼ�");
	    				int xz=in1.nextInt();
	    				if(xz==1){
	    					System.out.print("������"+cou.c[i].couName+"�γ��µĳɼ�");
		    			    double c=in2.nextDouble();
		    				while(c<0) {
	    	    				System.out.println("¼��ĳɼ�����Ϊ������������¼��");
	    	    				c=in2.nextDouble();
	    	    			}
	    					grade[i][j]=c;//���ɼ�����ά����Ķ�Ӧλ��
	    			      System.out.println("¼��ɹ���ѧ��:"+stu.s[j].stuNo+"   �ɼ���"+grade[i][j]);
	    				}
	    			}
	    			else{
	    			System.out.print("������"+cou.c[i].couName+"�γ̳ɼ�");
	    			double c=in2.nextDouble();
	    			while(c<0) {
	    				System.out.println("¼��ĳɼ�����Ϊ������������¼��");
	    				c=in2.nextDouble();
	    			}
	    			grade[i][j]=c;                    
	    			System.out.println("¼��ɹ����γ�:"+cou.c[i].couName+"   �ɼ���"+grade[i][j]);}
	    		}
	    	}}
	    }if(m==0) {System.out.println("û���ҵ���Ӧѧ����Ϣ");
	    for(int i=0;i<cou.C;i++){n=1;}
	   if(n==0) {System.out.print("û���ҵ��γ���Ϣ");return;}	
	    }{for(int i=0;i<cou.C;i++){n=1;}
		   if(n==0) {System.out.print("û���ҵ��γ���Ϣ");}	
	    }
		}
	public void drlr(Student stu,Course  cou){//¼��ĳ��ѧ����ĳ�ſγ̳ɼ�
		Scanner in=new Scanner(System.in);
		Scanner in1=new Scanner(System.in);
		Scanner in2=new Scanner(System.in);
		System.out.print("��ֱ�������Ҫ¼��ѧ����ѧ�źͿγ�����:");
		String xh=in.nextLine();
		String kc=in.nextLine();
		int m=0,n=0;
		 for(int i=0;i<cou.C;i++){
			 if(kc.equals(cou.c[i].couName)){//Ѱ�ҿγ�
				 m=1;
				 for(int j=0;j<stu.S;j++){
					 if(xh.equals(stu.s[j].stuNo)){//Ѱ��ѧ��
						 n=1;
						 if(grade[i][j]>0){
			    				System.out.println("��ѧ���ÿγ����гɼ����Ƿ�����¼��"+grade[i][j]+"��1������¼��          0���˳�");
			    				int xz=in1.nextInt();
			    				if(xz==1){
			    					System.out.print("������ѧ��Ϊ"+stu.s[j].stuNo+"�γ�Ϊ"+cou.c[i].couName+"�µĳɼ�");
				    			    double c=in2.nextDouble();
				    			    while(c<0) {
			    	    				System.out.println("¼��ĳɼ�����Ϊ������������¼��");
			    	    				c=in2.nextDouble();
			    	    			}
			    					grade[i][j]=c;//���ɼ�����ά����Ķ�Ӧλ��
			    			      System.out.print("¼��ɹ���ѧ��:"+stu.s[j].stuNo+"   �ɼ���"+grade[i][j]);
			    				}
			    			}
						 else{
						 System.out.print("������ѧ��Ϊ"+stu.s[j].stuNo+"�γ�Ϊ"+cou.c[i].couName+"�ĳɼ�");
						 double c=in2.nextDouble();
						 while(c<0) {
	    	    				System.out.println("¼��ĳɼ�����Ϊ������������¼��");
	    	    				c=in2.nextDouble();
	    	    			}
						 grade[i][j]=c;
						 System.out.println("¼��ɹ���ѧ��:"+stu.s[j].stuNo+"   �γ�:"+cou.c[i].couName+"   �ɼ���"+grade[i][j]);
						 } }
					 }
				 }
			 }
			 if(m==0){ System.out.println("û���ҵ���Ӧ�γ���Ϣ");
			 for(int j=0;j<stu.S;j++){
				 if(xh.equals(stu.s[j].stuNo)){n=1;}
			 }if(n==0) {System.out.print("û���ҵ���Ӧѧ����Ϣ");}return;
			 }{for(int j=0;j<stu.S;j++){
				 if(xh.equals(stu.s[j].stuNo)){n=1;}}
			 if(n==0) {System.out.print("û���ҵ���Ӧѧ����Ϣ");}}
	}
	public void xgcj(Student stu,Course  cou){
		Scanner in=new Scanner(System.in);
		Scanner in2=new Scanner(System.in);
		System.out.print("��ֱ�������Ҫ�޸ĵ�ѧ����ѧ�źͿγ�����:");
		String xh=in.nextLine();
		String kc=in.nextLine();
		int m=0,n=0;
		 for(int i=0;i<cou.C;i++){
			 if(kc.equals(cou.c[i].couName)){//Ѱ�ҿγ�
				 m=1;
				 for(int j=0;j<stu.S;j++){
					 if(xh.equals(stu.s[j].stuNo)){//Ѱ��ѧ��
						 n=1;
						 System.out.print("������ѧ��Ϊ"+stu.s[j].stuNo+"�γ�Ϊ"+cou.c[i].couName+"���µĳɼ�");
						 double c=in2.nextDouble();
						 while(c<0) {
	    	    				System.out.println("¼��ĳɼ�����Ϊ������������¼��");
	    	    				c=in2.nextDouble();
	    	    			}
						 grade[i][j]=c;
						 System.out.println("�޸ĳɹ���ѧ��:"+stu.s[j].stuNo+"   �γ�:"+cou.c[i].couName+"   �ɼ���"+grade[i][j]);
						 } }
					 }
				 }
			 if(m==0){ System.out.println("û���ҵ���Ӧ�γ���Ϣ");
			 for(int j=0;j<stu.S;j++){
				 if(xh.equals(stu.s[j].stuNo)){n=1;}
			 }if(n==0) {System.out.print("û���ҵ���Ӧѧ����Ϣ");}return;
			 }{for(int j=0;j<stu.S;j++){
				 if(xh.equals(stu.s[j].stuNo)){n=1;}}
			 if(n==0) {System.out.print("û���ҵ���Ӧѧ����Ϣ");}}
	}
	public void xscjcz(Student stu,Course  cou) {//��ѧ������ÿ�ſγ̳ɼ�
		 int t=-1,m=0,n=0,x=0;
		 System.out.print("��������Ҫ���ҳɼ���ѧ��ѧ�ţ�");
		 Scanner in=new Scanner(System.in);
		 String xh=in.nextLine();
		 for(int j=0;j<stu.S;j++) {
			 if(xh.equals(stu.s[j].stuNo)) {//ѧ��ѧ�������ҵ����ѧ����¼��ѧ��λ��
	             m=1;
				 t=j;//�����ҵ���ѧ��ѧ�ŵ�λ��
				 break;
			 }
		 }
		 for(int i=0;i<cou.C&&t!=-1;i++) {//�ҵ�ѧ��ѧ��λ�ú�Ը�ѧ�������пγ̳ɼ����������ʾ
			 n=1;
			 if(grade[i][t]==0){
				 System.out.println("��ѧ��"+cou.c[i].couName+"�γ��޳ɼ�");
			 }
			 else
			 {System.out.println("�γ̣�"+cou.c[i].couName+"\t"+"�ɼ���"+grade[i][t]);}
		 }
		 if(m==0) {System.out.println("û���ҵ�ѧ����Ϣ");{
			 for(int i=0;i<cou.C;i++) {
				 n=1;}
		    if(n==0){System.out.print("û���ҵ��γ���Ϣ");return;	}
		    }}
		 {
			 for(int i=0;i<cou.C;i++) {
				 n=1;}
			 if(n==0){System.out.print("û���ҵ��γ���Ϣ");
		 }
	 }
	}
	public void kccjcz(Student stu,Course  cou) {//���γ̲���ÿ��ѧ���ɼ�
		 int t=-1,m=0,n=0,x=0,y=0;
		 System.out.print("��������Ҫ���ҳɼ��Ŀγ����ƣ�");
		 Scanner in=new Scanner(System.in);
		 String kc=in.nextLine();
		 for(int i=0;i<cou.C;i++){
			 if(kc.equals(cou.c[i].couName)) {
				 m=1;
				 t=i;
				 break;
			 }
		 }
		 for(int j=0;j<stu.S&&t!=-1;j++){
			 n=1;
			 if(grade[t][j]==0){
				 System.out.println(""+stu.s[j].stuName+"ѧ���ÿγ��޳ɼ�");
			 }
			 else
		 {System.out.println("������"+stu.s[j].stuName+"\t"+"�ɼ���"+grade[t][j]);}
		 }
		 if(m==0) {System.out.println("û���ҵ��γ���Ϣ");{
			 for(int j=0;j<stu.S;j++){
				 n=1;}
			    if(n==0){System.out.print("û��ѧ����Ϣ");return;}
			    }}
		 {
		 for(int j=0;j<stu.S;j++){
				 n=1;}
		 if(n==0){System.out.print("û��ѧ����Ϣ");
		 }
		 }	
	}
	public void drcjcz(Student stu,Course  cou){//����ĳ��ѧ��ĳ�ſγ̳ɼ�
		Scanner in=new Scanner(System.in);
		System.out.print("��ֱ�������Ҫ����ѧ����ѧ�źͿγ�����:");
		String xh=in.nextLine();
		String kc=in.nextLine();
		int m=0,n=0;
		 for(int i=0;i<cou.C;i++){
			 if(kc.equals(cou.c[i].couName)){//Ѱ�ҿγ�
				 m=1;
				 for(int j=0;j<stu.S;j++){
					 if(xh.equals(stu.s[j].stuNo)){//Ѱ��ѧ��
						 n=1;
						 if(grade[i][j]==0)
							 {System.out.println("��ѧ�����ſγ�û�гɼ�");return;}
						 System.out.println("���ҳɹ���ѧ��:"+stu.s[j].stuNo+"   �γ�:"+cou.c[i].couName+"   �ɼ���"+grade[i][j]);
					 }
					 }
				 }
			 }
			 if(m==0){ {System.out.println("û���ҵ���Ӧ�γ���Ϣ");}
			 for(int j=0;j<stu.S;j++){
				 if(xh.equals(stu.s[j].stuNo)){n=1;}}
				 if(n==0) {System.out.print("û���ҵ���Ӧѧ����Ϣ");return;}
			 }{for(int j=0;j<stu.S;j++){
				 if(xh.equals(stu.s[j].stuNo)){
					 n=1;}}
				 if(n==0) {System.out.print("û���ҵ���Ӧѧ����Ϣ");}
			 }
	}
	public void highestcj(Student stu,Course  cou){//ͳ��ÿ�ſγ̵���߳ɼ�
		double pd=0;int t = 0;
		int j,k=0;
		for(int x=0;x<cou.C;x++) {
			for(int y=0;y<stu.S;y++) {
				if(grade[x][y]>0) pd=1;
			}
		}
		if(pd==0) {System.out.print("û�гɼ�");return;}
		for(int i=0;i<cou.C;i++) {
			double max=0;
			for(j=0;j<stu.S;j++) {
				if(grade[i][j]>max) {
					max=grade[i][j];
					k=j;}
			}
			System.out.println(""+cou.c[i].couName+"�γ̵���߷���:"+max+"\t"+"ѧ��:"+stu.s[k].stuNo);
		}
	}
	public void kcpjcj(Student stu,Course  cou) {//ͳ��ÿ�ſγ̵�ƽ���ɼ�
		int i,j;
		double pd=0;
		for(int x=0;x<cou.C;x++) {
			for(int y=0;y<stu.S;y++) {
				if(grade[x][y]>0) pd=1;
			}
		}
		if(pd==0) {System.out.print("û�гɼ�");return;}
		for(i=0;i<cou.C;i++) {
			double t=0;
			int r=0;
			for( j=0;j<stu.S;j++) 
				t=t+grade[i][j];
			System.out.println(""+cou.c[i].couName+"�γ̵�ƽ������:"+t/stu.S);
			for(j=0;j<stu.S;j++) {
				if(grade[i][j]>t/stu.S)
					r++;
			}
		}
	}
	public void cgpjrs(Student stu,Course  cou) {//ͳ�Ƴ���ƽ���ɼ�������
		int i,j;
		double pd=0;
		for(int x=0;x<cou.C;x++) {
			for(int y=0;y<stu.S;y++) {
				if(grade[x][y]>0) pd=1;
			}
		}
		if(pd==0) {System.out.print("û�гɼ�");return;}
		for(i=0;i<cou.C;i++) {
			double t=0;
			int r=0;
			for( j=0;j<stu.S;j++) {
				if(grade[i][j]>0){
				t=t+grade[i][j];}
			}
			for(j=0;j<stu.S;j++){
				if(grade[i][j]>t/stu.S)
					r++;
			}
			System.out.println(""+cou.c[i].couName+"�γ̳���ƽ���ֵ������ǣ�"+r+"��");		}}
}
