public class RomanNums
{
	public static void main(String args[])
	{
		//int x = 852;
		int x = Integer.parseInt(args[0]);
		System.out.println("\nNumber:" + x);
		System.out.println("Roman Numerals:");
		
		int thou = x / 1000;
		int temp = x % 1000;
		int hun = temp / 100;
		int temp1 = x % 100;
		int tens = temp1 / 10;
		int ones = temp1 % 10;
		
		switch(thou)
		{
			case 1: System.out.print("M");
				break;
			case 2: System.out.print("MM");
				break;
			case 3: System.out.print("MMM");
				break;
			case 4: System.out.print("MMMM");
				break;
			case 5: System.out.print("MMMMM");
				break;
			case 6: System.out.print("MMMMMM");
				break;
			case 7: System.out.print("MMMMMMM");
				break;
			case 8: System.out.print("MMMMMMMM");
				break;
			case 9: System.out.print("MMMMMMMMM");
		}
		switch(hun)
		{
			case 1: System.out.print("C");
				break;
			case 2: System.out.print("CC");
				break;
			case 3: System.out.print("CCC");
				break;
			case 4: System.out.print("CD");
				break;
			case 5: System.out.print("D");
				break;
			case 6: System.out.print("DC");
				break;
			case 7: System.out.print("DCC");
				break;
			case 8: System.out.print("DCCC");
				break;
			case 9: System.out.print("CM");
		}
		switch(tens)
		{
			case 1: System.out.print("X");
				break;
			case 2: System.out.print("XX");
				break;
			case 3: System.out.print("XXX");
				break;
			case 4: System.out.print("XL");
				break;
			case 5: System.out.print("L");
				break;
			case 6: System.out.print("LX");
				break;
			case 7: System.out.print("LXX");
				break;
			case 8: System.out.print("LXXX");
				break;
			case 9: System.out.print("XC");
		}
		switch(ones)
		{
			case 1: System.out.print("I");
				break;
			case 2: System.out.print("II");
				break;
			case 3: System.out.print("III");
				break;
			case 4: System.out.print("IV");
				break;
			case 5: System.out.print("V");
				break;
			case 6: System.out.print("VI");
				break;
			case 7: System.out.print("VII");
				break;
			case 8: System.out.print("VIII");
				break;
			case 9: System.out.print("IX");
		}
		System.out.println("\n");
	}
}