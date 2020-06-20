package com.wipo.ClassesAndObjects;
import java.util.*;
public class Box {
	int length,width,depth;
	Box(int length,int width,int depth)
	{
		this.length=length;
		this.width=width;
		this.depth=depth;
	}
	double volume;
	double volume()
	{
		volume=length*width*depth;
		return volume;
	}
	public static void main(String[] args) {
		Box b=new Box(1,2,3);
		System.out.println(b.volume());
	}
}
