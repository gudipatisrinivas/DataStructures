package com.datastructure.List;

public class Node<T> {
	
	T obj;
	Node next;
	
	public Node(T o) {
		// TODO Auto-generated constructor stub
		this.obj=o;
		this.next=null;
	}
	public String getObj() {
		return obj.toString();
	}
	public void setObj(T obj) {
		this.obj = obj;
	}
	@Override
	public String toString() {
		return "Node [obj=" + obj.toString() + ", next=" + next + "]";
	}

}
