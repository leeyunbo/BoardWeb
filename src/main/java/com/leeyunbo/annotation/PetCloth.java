package com.leeyunbo.annotation;

import org.springframework.stereotype.Component;

@Component("cloth")
public class PetCloth {
	public PetCloth() {
		System.out.println("===> PetCloth ��ü ����");
	}
	
	public void dressCloth() {
		System.out.println("== ���� �������ϴ�.");
	}
	
	public void undressCloth() {
		System.out.println("== ���� ������ϴ�.");
	}
}
