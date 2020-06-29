package com.wipro.Interface.music.live;

import com.wipro.Interface.music.string.Venna;
import com.wipro.Interface.music.wind.Saxophone;
import com.wipro.Interfaces.music.playable;

public class Test {
public static void main(String[] args) {
	Venna v=new Venna();
	v.play();
	Saxophone s= new Saxophone();
	s.play();
	playable p= new Venna();
	p.play();
}
}
