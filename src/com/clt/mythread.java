package com.clt;

import java.io.IOException;
public class mythread implements Runnable {
	public void run() {
		while(true) {
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
				e.printStackTrace();
				}
			if(MainMenu.up){
				try {
					new file().write();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					System.out.println("�ļ�д��ʧ�ܣ�");
				}
				System.out.println("�ļ�д��ɹ�");
				MainMenu.up=false;
		}
		}
	}
}