// ドアを作るクラス

import java.awt.Color;

public class Door {
	int size;
	String material;
	Color color;

	public Door(int s, String m, Color c) {
		this.size = s;
		this.material = m;
		this.color = c;
	}

	public double area() {
		double b = 0.2; // if(size == 1)

		if (size == 2)
			b = 0.5;
		if (size == 3)
			b = 8;

		double l = b + b / 2;
		return l * b;
	}

	public double unitMaterialCost() {
		double cost = 0;
		if (material.equalsIgnoreCase("paper"))
			cost = 50;
		if (material.equalsIgnoreCase("plastic"))
			cost = 200;
		if (material.equalsIgnoreCase("metal"))
			cost = 450;
		return cost;
	}

	public double unitColorCost() {
		return 25;
	}

}
