package com.dridichaith.src.objects;
// this class represent the position object in an 
//euclidean space
public abstract class GlobalPosition {
	private int x;
	private int y;
	
	public GlobalPosition(int x, int y) {
		this.x=x;
		this.y=y;
	}

	public int getX() {
		return x;
	}
	//here we set the x position depending oon the 
	//flag if the flag is true we add speed otherwise
	//we subtract speed
	public void setX(int speed,boolean flag) {
		if(flag) {
			this.x+=speed;
		}else {
			this.x-=speed;
		}
	}
	public void setX(int x) {
		this.x=x;
	}

	public int getY() {
		return y;
	}

	public void setY(int speed,boolean flag) {
		if(flag) {
			this.y+=speed;
		}else {
			this.y-=speed;
		}
	}
	
	public void setY(int y) {
		this.y=y;
	}
	
}
