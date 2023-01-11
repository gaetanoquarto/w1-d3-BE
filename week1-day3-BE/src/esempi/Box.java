package esempi;

public class Box {
	
	int w, h;
	
	public Box(int w, int h) {
		this.w = w;
		this.h = h;
	}
	
	public double getArea() {
		return this.h * this.w;
	}
	public double getPerimeter() {
		return (this.h + this.w)*2;
	}

}
