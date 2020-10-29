package com.pumpkin.business;

import javax.persistence.*;

@Entity

public class Pumpkin {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // jpa will generate the id in a table of DB
	private int id;
	private String color;
	private double weight;
	private double height;
	private double width;
	private boolean decorated;

	public Pumpkin() {
		super();
	}

	public Pumpkin(int id, String color, double weight, double height, double width, boolean decorated) {
		super();
		this.id = id;
		this.color = color;
		this.weight = weight;
		this.height = height;
		this.width = width;
		this.decorated = decorated;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public boolean isDecorated() {
		return decorated;
	}

	public void setDecorated(boolean decorated) {
		this.decorated = decorated;
	}

}
