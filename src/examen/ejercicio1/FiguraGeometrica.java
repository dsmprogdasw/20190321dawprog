package examen.ejercicio1;

import java.awt.Color;

public class FiguraGeometrica {
	
	private Color color = Color.BLUE;
	private int x;
	private int y;
	private boolean relleno = true;
	double area;
	double perimetro;
	
	public FiguraGeometrica(Color color, int x, int y, boolean relleno) {
		this.color = color;
		this.x = x;
		this.y = y;
		this.relleno = relleno;

	}
	
	
	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public boolean isRelleno() {
		return relleno;
	}

	public void setRelleno(boolean relleno) {
		this.relleno = relleno;
	}
	
	@Override
	public String toString() {
		return "FiguraGeometrica [color=" + color + ", x=" + x + ", y=" + y + ", relleno=" + relleno + ", area=" + area
				+ ", perimetro=" + perimetro + "]";
	}
	
	
	

	
	
}
