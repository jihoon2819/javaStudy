package chapter6_5;

import java.util.Arrays;
import java.util.Collections;

class People implements Comparable<People>{
	private String name;
	private int age;
	
	public People (String name,int age){
		this.name=name;
		this.age=age;
	}
	public void print(){
		System.out.println("�̸� :"+name+"���� "+age);
	}
	
	
	//���ϰ��� -�̸� ��밪�� �� ũ�� ��� ��
	//���ϰ��� +�̸� ��밪�� �� �۴� ��� ��
	//���ϰ��� 0�̸� ���ΰ���.
	@Override
	public int compareTo(People o) {
		return this.age-o.age;
	}
	
}

public class SortEx {

	public static void main(String[] args) {
		Integer[] arr = { 4,23,44,34,27,17,19};
		Arrays.sort(arr);
		for(int i : arr) {
			System.out.println(i);
		}
		Arrays.sort(arr, Collections.reverseOrder());
		for(int i : arr) {
			System.out.println(i);
		}
		People[] p = new People[5];
		
		for(int i= 0 ; i<p.length;i++) {
			p[i]= new People("������"+ i , 20+i);
		}
		
		for(People pe : p) {
			pe.print();
		}
		
		Arrays.sort(p,Collections.reverseOrder());
		
	
	
	for(People pe : p) {
		pe.print();
	}
	}
}
