package _AJP_;
//method  with parameters
public class Rectangle {
	int length,breadth;
	
	  int area(int l, int b) {
		length=l;
		breadth=b;
		int a=length*breadth;
		return a;
		//return length*breadth;
		
	}
	int perimeter(int l,int b) {
		length=l;
		breadth=b;
		int p=2*length*breadth;
		return p;
		
	}

public static void main(String args[]) {
	Rectangle rec = new Rectangle();
	int area=rec.area(20, 30);
	System.out.println("Area="+area);
	//int perimeter=rec.perimeter(20, 30);
	//System.out.println("Perimeter ="+perimeter);
	System.out.println("perimeter="+rec.perimeter(20,30));
	
}

}

