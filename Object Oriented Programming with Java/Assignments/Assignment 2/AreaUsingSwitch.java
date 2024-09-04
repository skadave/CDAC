import java.util.*;
class AreaUsingSwitch{
		public static void main(String... args){
			System.out.println("Select a shape: \n1. Circle \n2. Square \n3. Rectangle\n4. Triangle");
			Scanner sc = new Scanner(System.in);
			int shape = sc.nextInt();
			double area = 0;
			
			switch(shape){
				case 1:
					System.out.print("Enter radius: ");
					double r = sc.nextInt();
					area = 3.14 *Math.pow(r,2);
					System.out.print("Area of circle is: "+area);
					break;
				case 2:
					System.out.print("Enter side: ");
					double side = sc.nextInt();
					area = side*side;
					System.out.print("Area of square is: "+area);
					break;
				case 3:
					System.out.print("Enter length: ");
					double l = sc.nextInt();
					System.out.print("Enter breadth: ");
					double b = sc.nextInt();
					area = l*b;
					System.out.print("Area of rectangle is: "+area);
					break;
				case 4:
					System.out.print("Enter base: ");
					double base = sc.nextInt();
					System.out.print("Enter height: ");
					double h = sc.nextInt();
					area = (0.5)*base*h;
					System.out.print("Area of triangle is: "+area);
					break;
			}
	}
}