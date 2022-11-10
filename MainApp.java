package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		 double a, b, c, x1, x2, delta;
	        String ketQua = "";
	        Scanner scanner = new Scanner(System.in);
	        do {
	            System.out.print("Nhập a (a # 0): ");
	            a = scanner.nextDouble();
	        } while (a == 0);
	        System.out.print("Nhập b: ");
	        b = scanner.nextDouble();
	        System.out.print("Nhập c: ");
	        c = scanner.nextDouble();
	        System.out.println("Phương trình bậc hai bạn vừa nhập có dạng: "+a+"x^2 + "+b+"x + "+c+" = 0");
	        // tính delta = b * b - 4 * a * c;
	        delta = Math.pow(b, 2) - 4 * a * c;
	        // kiểm tra nếu delta < 0 thì phương trình vô nghiệm
	        // delta = 0 thì phương trình có nghiệm kép
	        // delta > 0 thì phương trình có 2 nghiệm phân biệt
	        if (delta < 0) {
	            ketQua = "Phương trình vô nghiệm!";
	        } else if (delta == 0) {
	            x1 = x2 = -b/ (2*a);
	            System.out.println("Phương trinh có nghiệm kép là x1 = x2 = "+x1);
	        } else {
	            x1 = (-b + Math.sqrt(delta)) / (2 * a);
	            x2 = (-b - Math.sqrt(delta)) / (2 * a);
	            ketQua = "Phương trình có 2 nghiệm x1 = " + x1 + " và x2 = " + x2;
	        }
	        System.out.println(ketQua);
	        System.out.println("-------------------------");
	    }
	}

		

	


