package com.clt;

import java.io.Serializable;
import java.util.Scanner;

class Course implements Serializable {
    String couNo;//����γ̱��
    String couName;//�γ�����
    String counumber;//�ν���
    String couxz;//�γ�����
    String couxf;//�γ�ѧ��
    String couteacher;//�ڿ���ʦ
    public static int C;//�γ�����
    static Course[] c = new Course[100];//�γ���Ϣ����

    public void inputcou() {//��ӿγ���Ϣ
        System.out.println("��������Ҫ��ӵĿγ���Ϣ");
        c[C] = new Course();
        Scanner in = new Scanner(System.in);
        System.out.print("�γ̱��:");
        String x = in.nextLine();
        for (int i = 0; i < C; i++) {
            if (x.equals(c[i].couNo)) {
                System.out.println("���иÿγ̵Ŀγ���Ϣ");
                return;
            }
        }
        c[C].couNo = x;
        System.out.print("�γ�����:");
        c[C].couName = in.nextLine();
        System.out.print("��ʱ��:");
        c[C].counumber = in.nextLine();
        System.out.print("�γ�����:");
        String xz = in.nextLine();
        while (!xz.equals("ѡ��") && !xz.equals("����")) {
            System.out.print("��������ȷ�Ŀγ����ʣ�");
            xz = in.nextLine();
        }
        c[C].couxz = xz;
        System.out.print("�γ�ѧ��:");
        c[C].couxf = in.nextLine();
        System.out.print("�ڿ���ʦ:");
        c[C].couteacher = in.nextLine();
        System.out.print("�γ���Ϣ��ӳɹ�");
        C++;
    }

    public void showcou(int i) {//��ʾ�γ���Ϣ
        System.out.println("�γ̱�ţ�" + c[i].couNo + "\t" + "�γ����ƣ�" + c[i].couName + "\t" + "��ʱ��:" + c[i].counumber + "\t" + "�γ�����:" + c[i].couxz + "\t" + "�γ�ѧ�֣�" + c[i].couxf + "\t" + "�ڿ���ʦ��" + c[i].couteacher);
    }

    public void czkc() {
        int i = 0;
        String x;
        System.out.print("��������Ҫ���ҵĿγ̱��;");
        Scanner in = new Scanner(System.in);
        x = in.nextLine();
        for (i = 0; i < C; i++) {
            if (x.equals(c[i].couNo)) {
                System.out.print("���ҳɹ�");
                c[i].showcou(i);
                return;
            }
        }
        System.out.print("û���ҵ���Ҫ���ҵĿγ���Ϣ");
    }

    public void sckc(Student stu, Grade gra) {//ɾ���γ���Ϣ
        int i = 0, k = 0;
        String x;
        System.out.print("��������Ҫɾ���Ŀγ̱��;");
        Scanner in = new Scanner(System.in);
        x = in.nextLine();
        for (i = 0; i < C; i++) {
            if (x.equals(c[i].couNo)) {
                k = 1;
                break;
            }
        }
        if (k == 1) {
            for (; i <= C; i++) {
                c[i] = c[i + 1];
                for (int j = 0; j < stu.S; j++) {
                    gra.grade[i][j] = gra.grade[i + 1][j];
                }
            }
            System.out.print("ɾ���ɹ�");
            C--;
        } else {
            System.out.print("û���ҵ���Ҫɾ���ڿγ���Ϣ");
        }
    }

    public void xgkc() {//�޸Ŀγ���Ϣ
        int i = 0, k = 0;
        String x;
        System.out.print("��������Ҫ�޸ĵĿγ̱��");
        Scanner in = new Scanner(System.in);
        Scanner in1 = new Scanner(System.in);
        x = in.nextLine();
        for (i = 0; i < C; i++) {
            if (x.equals(c[i].couNo)) {
                k = 1;
                break;
            }
        }
        if (k == 1) {
            System.out.println("��ѡ����Ҫ�޸ĵĿγ���Ϣ");
            System.out.println("0��ȫ���޸�" + "\t" + "1���γ̱�ţ�" + c[i].couNo + "\t" + "2���γ����ƣ�" + c[i].couName + "\t" + "3����ʱ��:" + c[i].counumber + "\t" + "4���γ�����:" + c[i].couxz + "\t" + "5���γ�ѧ�֣�" + c[i].couxf + "\t" + "6���ڿ���ʦ��" + c[i].couteacher);
            int choice = in1.nextInt();
            while (choice < 0 || choice > 6) {
                System.out.println("���ѡ�������������ȷ�ı�ţ�");
                choice = in1.nextInt();
            }
            switch (choice) {
                case 0: {
                    System.out.println("�������µĿγ���Ϣ");
                    System.out.print("�γ̱��:");
                    c[i].couNo = in.nextLine();
                    System.out.print("�γ�����:");
                    String mc = in.nextLine();
                    for (int j = 0; j < C; j++) {
                        if (x.equals(c[j].couName)) {
                            System.out.println("���иÿγ̵Ŀγ���Ϣ");
                            return;
                        }
                    }
                    c[i].couName = mc;
                    System.out.print("��ʱ��:");
                    c[i].counumber = in.nextLine();
                    System.out.print("�γ�����:");
                    String xz = in.nextLine();
                    while (!xz.equals("ѡ��") && !xz.equals("����")) {
                        System.out.print("��������ȷ�Ŀγ����ʣ�");
                        xz = in.nextLine();
                    }
                    c[i].couxz = xz;
                    System.out.print("�γ�ѧ��:");
                    c[i].couxf = in.nextLine();
                    System.out.print("�ڿ���ʦ:");
                    c[i].couteacher = in.nextLine();
                    System.out.print("�γ���Ϣ�޸ĳɹ�");
                    break;
                }
                case 1: {
                    System.out.print("�γ̱��:");
                    c[i].couNo = in.nextLine();
                    System.out.print("�γ���Ϣ�޸ĳɹ�");
                    break;
                }
                case 2: {
                    System.out.print("�γ�����:");
                    String mc1 = in.nextLine();
                    for (int m = 0; m < C; m++) {
                        if (x.equals(c[m].couName)) {
                            System.out.println("���иÿγ̵Ŀγ���Ϣ");
                            return;
                        }
                    }
                    c[i].couName = mc1;
                    System.out.print("�γ���Ϣ�޸ĳɹ�");
                    break;
                }
                case 3: {
                    System.out.print("��ʱ��:");
                    c[i].counumber = in.nextLine();
                    System.out.print("�γ���Ϣ�޸ĳɹ�");
                    break;
                }
                case 4: {
                    System.out.print("�γ�����:");
                    String xz = in.nextLine();
                    while (!xz.equals("ѡ��") && !xz.equals("����")) {
                        System.out.print("��������ȷ�Ŀγ����ʣ�");
                        xz = in.nextLine();
                    }
                    c[i].couxz = xz;
                    System.out.print("�γ���Ϣ�޸ĳɹ�");
                    break;
                }
                case 5: {
                    System.out.print("�γ�ѧ��:");
                    c[i].couxf = in.nextLine();
                    System.out.print("�γ���Ϣ�޸ĳɹ�");
                    break;
                }
                case 6: {
                    System.out.print("�ڿ���ʦ:");
                    c[i].couteacher = in.nextLine();
                    System.out.print("�γ���Ϣ�޸ĳɹ�");
                    break;
                }
            }
        } else {
            System.out.print("û���ҵ���Ҫ�޸ĵĿγ���Ϣ");
        }
    }

    public void showallcou(Student stu, Grade gra) {//����γ���Ϣ
        if (C == 0) {
            System.out.println("û�пγ���Ϣ");
        }
        for (int i = 0; i < C; i++) {
            System.out.println("�γ̱�ţ�" + c[i].couNo + "\t" + "�γ����ƣ�" + c[i].couName + "\t" + "��ʱ��:" + c[i].counumber + "\t" + "�γ�����:" + c[i].couxz + "\t" + "�γ�ѧ�֣�" + c[i].couxf + "\t" + "�ڿ���ʦ��" + c[i].couteacher);
            for (int j = 0; j < stu.S; j++) {
                System.out.println("ѧ��:" + stu.s[j].stuNo + "�ɼ���" + gra.grade[i][j]);
            }
        }
    }
}