import java.util.*;
class taxCal{
	public static void main(String[] args){
		Scanner salary = new Scanner(System.in);
		double tax;
		System.out.print("Input Your Salary: ");
		double sal = salary.nextDouble();
		//System.out.println();
		
		if(sal<=100000){
			System.out.println("You're Tax Free.");
			}
		else if(sal<=151000){
			sal-=100000;
			tax = sal*0.06;
			System.out.println("You have to pay "+tax+" amount of income tax.");
			}
		else if(sal<=201000){
			sal-=151000;
			double tax1 = 51000*0.06;
			double tax2 = sal*0.12;
			tax = tax1+tax2;
			System.out.println("You have to pay "+tax+" amount of income tax.");
			}
		else if(sal<=251000){
			sal-=201000;
			double tax1 = 51000*0.06;
			double tax2 = 50000*0.12;
			double tax3 = sal*0.18;
			tax = tax1+tax2+tax3;
			System.out.println("You have to pay "+tax+" amount of income tax.");
			}
		else if(sal<=301000){
			sal-=251000;
			double tax1 = 51000*0.06;
			double tax2 = 50000*0.12;
			double tax3 = 50000*0.18;
			double tax4 = sal*0.24;
			tax = tax1+tax2+tax3+tax4;
			System.out.println("You have to pay "+tax+" amount of income tax.");
			}
		else if(sal<=351000){
			sal-=301000;
			double tax1 = 51000*0.06;
			double tax2 = 50000*0.12;
			double tax3 = 50000*0.18;
			double tax4 = 50000*0.24;
			double tax5 = sal*0.3;
			tax = tax1+tax2+tax3+tax4+tax5;
			System.out.println("You have to pay "+tax+" amount of income tax.");
			}
		else if(sal<=1000000){
			sal-=351000;
			double tax1 = 51000*0.06;
			double tax2 = 50000*0.12;
			double tax3 = 50000*0.18;
			double tax4 = 50000*0.24;
			double tax5 = 50000*0.3;
			double tax6 = sal*0.36;
			tax = tax1+tax2+tax3+tax4+tax5+tax6;
			System.out.println("You have to pay "+tax+" amount of income tax.");
			}
		else{
			sal-=1000000;
			double tax7 = sal*0.5;
			double tax1 = 51000*0.06;
			double tax2 = 50000*0.12;
			double tax3 = 50000*0.18;
			double tax4 = 50000*0.24;
			double tax5 = 50000*0.3;
			double tax6 = sal*0.36;
			tax = tax1+tax2+tax3+tax4+tax5+tax6+tax7;
			System.out.println("You have to pay "+tax+" amount of income tax.");
			}
		}
	}
