import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) throws IOException {
		File file = new File("CalculationsHistory.txt");
		PrintWriter outputfile = new PrintWriter(file);
		Scanner sc = new Scanner(System.in);
		double firstval;
		double secondval;
		double num1;
		int start = 1;
		System.out.println("***choose 0 to exit***\r\n" + "1. + - plus or addition\r\n"
				+ "2. - - minus or subtraction\r\n" + "3. * - multiply by\r\n" + "4. / - divided by\r\n"
				+ "5. ^ - raised to the power of\r\n" + "6. Sqrt - square root\r\n" + "7. Nrt - nth root\r\n"
				+ "8. log - Logarithmic value\r\n" + "9. logn - Natural log\r\n" + "10. sin - Sine\r\n"
				+ "11. isin -Inverse sine\r\n" + "12. cos - Cosine\r\n" + "13. icos - Inverse cosine\r\n"
				+ "14. tan - Tangent\r\n" + "15. itan - Inverse tan\r\n"
				+ "16. stor - place a number in memory for later use\r\n"
				+ "17. recall - recover the number from memory for immediate use\r\n"
				+ "18. d2b - Decimal to Binary number\r\n" + "19. b2d - Binary to Decimal number\r\n"
				+ "20. sip - Calculations of monthly, quarterly and yearly SIP calculations for compounding investments.\r\n"
				+ "21. Show Hystory of Opertions");
		while (start == 1) {
			System.out.println("======================");
			System.out.println("choose an operation..!");
			int choice = sc.nextInt();
			switch (choice) {
			case 1: {
				System.out.println("Enter the first value.");
				firstval = sc.nextDouble();
				System.out.println("Enter the second value.");
				secondval = sc.nextDouble();
				System.out.println("Addition: " + firstval + " + " + secondval + " = " + (firstval + secondval));
				outputfile.println("Addition: " + firstval + " + " + secondval + " = " + (firstval + secondval));
				outputfile.println(" ");
				break;
			}
			case 2: {
				System.out.println("Enter the first value.");
				firstval = sc.nextDouble();
				System.out.println("Enter the second value.");
				secondval = sc.nextDouble();
				System.out.println("Subtraction: " + firstval + " - " + secondval + " = " + (firstval - secondval));
				outputfile.println("Subtraction: " + firstval + " - " + secondval + " = " + (firstval - secondval));
				outputfile.println(" ");
				break;
			}
			case 3: {
				System.out.println("Enter the first value.");
				firstval = sc.nextDouble();
				System.out.println("Enter the second value.");
				secondval = sc.nextDouble();
				System.out.println("Multiplication: " + firstval + " * " + secondval + " = " + (firstval * secondval));
				outputfile.println("Multiplication: " + firstval + " * " + secondval + " = " + (firstval * secondval));
				outputfile.println(" ");
				break;
			}
			case 4: {
				System.out.println("Enter the first value.");
				firstval = sc.nextDouble();
				System.out.println("Enter the second value.");
				secondval = sc.nextDouble();
				System.out.println("Division: " + firstval + "/" + secondval + " = " + (firstval / secondval));
				outputfile.println("Division: " + firstval + "/" + secondval + " = " + (firstval / secondval));
				outputfile.println(" ");
				break;
			}
			case 5: {
				System.out.println("Enter the base value.");
				firstval = sc.nextDouble();
				System.out.println("Enter the power value.");
				secondval = sc.nextDouble();
				System.out.println("Power: " + firstval + "^" + secondval + " = " + Math.pow(firstval, secondval));
				outputfile.println("Power: " + firstval + "^" + secondval + " = " + Math.pow(firstval, secondval));
				outputfile.println(" ");
				break;
			}
			case 6: {
				System.out.println("Enter the value.");
				firstval = sc.nextDouble();
				System.out.println("Square root of " + firstval + " = " + Math.sqrt(firstval));
				outputfile.println("Square root of " + firstval + " = " + Math.sqrt(firstval));
				outputfile.println(" ");
				break;
			}
			case 7: {
				System.out.println("Enter the base value.");
				firstval = sc.nextDouble();
				System.out.println("Enter the n value.");
				secondval = sc.nextDouble();
				System.out.println(
						+secondval + "th root of " + firstval + " = " + Math.round(Math.pow(firstval, 1 / secondval)));
				outputfile.println(
						+secondval + "th root of " + firstval + " = " + Math.round(Math.pow(firstval, 1 / secondval)));
				outputfile.println(" ");
				break;
			}
			case 8: {
				System.out.println("Enter the value.");
				firstval = sc.nextDouble();
				System.out.println("Log(" + firstval + ") = " + Math.log10(firstval));
				outputfile.println("Log(" + firstval + ") = " + Math.log10(firstval));
				outputfile.println(" ");
				break;
			}
			case 9: {
				System.out.println("Enter the value.");
				firstval = sc.nextDouble();
				System.out.println("Natural Log(" + firstval + ") = " + Math.log(firstval));
				outputfile.println("Natural Log(" + firstval + ") = " + Math.log(firstval));
				outputfile.println(" ");
				break;
			}
			case 10: {
				System.out.println("Enter the value(in radients).");
				firstval = sc.nextDouble();
				System.out.println("sin(" + firstval + ") = " + (Math.sin(firstval)));
				outputfile.println("sin(" + firstval + ") = " + (Math.sin(firstval)));
				outputfile.println(" ");
				break;
			}
			case 11: {
				System.out.println("Enter the value (sould be less than 1).");
				firstval = sc.nextDouble();
				System.out.println("Inverse sine(" + firstval + ") = " + Math.asin(firstval));
				outputfile.println("Inverse sine(" + firstval + ") = " + Math.asin(firstval));
				outputfile.println(" ");
				break;
			}
			case 12: {
				System.out.println("Enter the value(in radients).");
				firstval = sc.nextDouble();
				System.out.println("cos(" + firstval + ") = " + (Math.cos(firstval)));
				outputfile.println("cos(" + firstval + ") = " + (Math.cos(firstval)));
				outputfile.println(" ");
				break;
			}
			case 13: {
				System.out.println("Enter the value (sould be less than 1).");
				firstval = sc.nextDouble();
				System.out.println("Inverse cos(" + firstval + ") = " + Math.acos(firstval));
				outputfile.println("Inverse cos(" + firstval + ") = " + Math.acos(firstval));
				outputfile.println(" ");
				break;
			}
			case 14: {
				System.out.println("Enter the value(in radients).");
				firstval = sc.nextDouble();
				System.out.println("tan(" + firstval + ") = " + (Math.tan(firstval)));
				outputfile.println("tan(" + firstval + ") = " + (Math.tan(firstval)));
				outputfile.println(" ");
				break;
			}
			case 15: {
				System.out.println("Enter the value (sould be less than 1).");
				firstval = sc.nextDouble();
				System.out.println("Inverse tan(" + firstval + ") = " + Math.atan(firstval));
				outputfile.println("Inverse tan(" + firstval + ") = " + Math.atan(firstval));
				outputfile.println(" ");
				break;
			}
			case 16: {
				System.out.println("Enter the number");
				num1 = sc.nextInt();
				try {
					BufferedWriter write = new BufferedWriter(new FileWriter("StoreRecall.txt"));
					write.write((int)num1);
					write.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("The number is stored");
				break;
			}
			case 17: {
				try {
					BufferedReader read = new BufferedReader(new FileReader("StoreRecall.txt"));
					try {
						int f = read.read();
						System.out.println("Stored number is: " + (double)f);
						read.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					System.out.println("There is no saved number");
					e.printStackTrace();
				}
				break;
			}
			case 18: {
				System.out.println("Enter the  Integer.");
				firstval = sc.nextDouble();
				System.out.println(Integer.toBinaryString((int) firstval));
				outputfile.println("Decimal to Binary: " + firstval + " = " + Integer.toBinaryString((int) firstval));
				outputfile.println(" ");
				break;
			}
			case 19: {
				System.out.println("Enter the binary value.");
				String binary = sc.next();
				try {
					int decimal = Integer.parseInt(binary, 2);
					System.out.println("Decimal: " + decimal);
					outputfile.println("Binary to Decimal : " + binary + " = " + decimal);
					outputfile.println(" ");
				} catch (Exception e) {
					System.out.println("value should be in Binary form(zeros and ones)");
				}

				break;
			}
			case 20: {
				System.out.println("Yearly SIP calculation.");
				System.out.print("Enter present value: ");
				double p = sc.nextDouble();
				System.out.print("Enter rate of interest: ");
				double r = sc.nextDouble();
				System.out.print("Enter time period in years: ");
				double y = sc.nextDouble();
				double f = p * Math.pow((1 + r / 100), y);
				double po = Math.pow((1 + r / 100), y);
				System.out.println("Value is: " + f);
				outputfile.println("Calculation: " + p + "*(1+" + r + "/" + "100)^" + y);
				outputfile.println("SIP: " + f);
				outputfile.println(" ");
				break;
			}
			case 21: {
				outputfile.close();
				System.out.println("=====================");
				System.out.println("   *** History ***"   );
				System.out.println("=====================");
				BufferedReader in = new BufferedReader(new FileReader("CalculationsHistory.txt"));
				String line;
				while ((line = in.readLine()) != null) {
					System.out.println(line);
				}
				in.close();
				System.out.println("====================");
				break;
			}
			default: {
				start = 0;
			}
			}
		}
		outputfile.close();
		sc.close();
	}
}
