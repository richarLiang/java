package com.richar.datastructure.recursion;

public class HanNoTower {
	private int floor;
	
	public HanNoTower(int floor) {
		// TODO Auto-generated constructor stub
		this.floor = floor;
	}
	/**
	 * 
	 * @param n the HanNoTower floor
	 * @param A the origin post
	 * @param B the middle post
	 * @param C the dest post
	 */
	private void hanoi(int n, char A, char B, char C){
		if(n == 1){
			move(A, C);
			return;
		}
		hanoi(n-1, A, C, B);
		move(A, C);
		hanoi(n-1, B, A, C);
	}
	public void dump(){
		hanoi(floor, 'A', 'B', 'C');
	}
	
	private void  move(char from, char to) {
		System.out.println(from +" -> " + to);
	}
}
