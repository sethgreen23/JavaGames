package com.dridichaith.src.objects;

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
