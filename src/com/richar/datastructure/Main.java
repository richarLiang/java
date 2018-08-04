package com.richar.datastructure;

import com.richar.datastructure.recursion.HanNoTower;

public class Main {

	/**
	 * @param args
	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main main = new Main();
		main.sayHello();
		
		main.dumpHanNoTower(5);
	}
	
	private void sayHello(){
		HelloWorld hw = new HelloWorld();
		hw.sayHello();
	}
	
	private void dumpHanNoTower(int floor){
		HanNoTower hnt = new HanNoTower(floor);
		hnt.dump();
	}

}
