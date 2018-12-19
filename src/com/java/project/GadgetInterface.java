package com.java.project;

public interface GadgetInterface {
	public enum Color {UNPAINTED, PAINTED, GOLD, SILVER, BRONZE };
	public void paint(GadgetInterface.Color color);
	public float getPrice();
}
