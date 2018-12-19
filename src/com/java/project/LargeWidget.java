package com.java.project;

public abstract class LargeWidget extends AbstractWidget {
	public LargeWidget(SurfaceColor color) {
		super(color);
	}
	
	public String getGears() {
		return "4 Gears";
	}
	
	public String getLevers() {
		return "3 Levers";
	}
	
	public String getSprings() {
		return "5 Springs";
	}

}
