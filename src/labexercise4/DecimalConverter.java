package labexercise4;

import java.util.Scanner;

public class DecimalConverter {

	public static void main(String[] args) {

		Scanner var1 = new Scanner(System.in);
		System.out.println("Enter a positive decimal value: ");
		int var2 = var1.nextInt();
		System.out.println("value to which number system: ");
		System.out.println("1 - Deciaml to Binary");
		System.out.println("2 - Decimal to Octal");
		System.out.println("3 - Decimal to Hexadecimal");
		System.out.println("Enter choice: ");
		int var3 = var1.nextInt();
//		boolean var4 = false;
		String var5 = "";
		byte var10;

		switch (var3) {
		case 1:
			var10 = 2;
			var5 = "binary";
			break;
		case 2:
			var10 = 8;
			var5 = "octal";
			break;
		case 3:
			var10 = 16;
			var5 = "hexadecimal";
			break;
		default:
			System.out.println("Invalid choice. ");
			var1.close();
			return;
		}

		char[] var6 = new char[32];
		int var7 = 0;
		int var8 = var2;
		int var9;

		if (var2 == 0)
			var6[var7++] = '0';
		else
			while (var8 > 0) {
				var9 = var8 % var10;
				if (var9 < 10)
					var6[var7++] = (char) (var9 + 48);
				else
					var6[var7++] = (char) (var9 - 10 + 65);

				var8 /= var10;
				++var7;
			}

		System.out.print("Equivalent of " + var2 + " in " + var5 + " is ");

		for (var9 = var7 - 1; var9 >= 0; --var9) {
			System.out.print(var6[var9]);
		}

		System.out.println();
		var1.close();

	}

}
