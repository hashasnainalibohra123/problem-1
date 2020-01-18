package problem1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProblemOne {
	public static void main(String[] args){
		int givenNo = 123;
		int tempVar = givenNo;
		int noOfDigits = 1;
		StringBuilder hashString=new StringBuilder();
		StringBuilder secondHashString=new StringBuilder();
		List<StringBuilder> listOfStr = new ArrayList<StringBuilder>();
		while(tempVar/10!=0){
			noOfDigits +=1;
			tempVar  = tempVar/10;
		}
		System.out.println("No. of digits is "+noOfDigits);
		int[] digits = new int[noOfDigits];
		int counterForDigits = noOfDigits-1;
		while(givenNo/10!=0){
			digits[counterForDigits] = givenNo%10;
			counterForDigits--;
			givenNo  = givenNo/10;
		}
		digits[0] = givenNo%10;
		System.out.println("Digits are "+Arrays.toString(digits));
		for(counterForDigits=0; counterForDigits<noOfDigits; counterForDigits++) {
			hashString.append(getChar(digits[counterForDigits]));
		}
		for(counterForDigits=0; counterForDigits<noOfDigits; counterForDigits++) {
			if((digits[counterForDigits]>0 && digits[counterForDigits]<3) && digits[counterForDigits+1]<7) {
				secondHashString.append(getChar(digits[counterForDigits]*10+digits[counterForDigits+1]));
				System.out.println(digits[counterForDigits]+ " "+ digits[counterForDigits+1]);
			}
			//secondHashString.append(getChar(digits[counterForDigits]));
		}
		listOfStr.add(hashString);
		listOfStr.add(secondHashString);
		System.out.println(listOfStr);
		
	}
	public static StringBuilder getChar(int digit) {
		StringBuilder characterForDigit=new StringBuilder();
		switch(digit) {
		case 1:
			characterForDigit.append("A");
			break;
		case 2:
			characterForDigit.append("B");
			break;
		case 3:
			characterForDigit.append("C");
			break;
		case 4:
			characterForDigit.append("D");
			break;	
		case 5:
			characterForDigit.append("E");
			break;
		case 6:
			characterForDigit.append("F");
			break;
		case 7:
			characterForDigit.append("H");
			break;
		case 9:
			characterForDigit.append("I");
			break;
		case 10:
			characterForDigit.append("J");
			break;
		case 11:
			characterForDigit.append("K");
			break;
		case 12:
			characterForDigit.append("L");
			break;
		case 13:
			characterForDigit.append("M");
			break;
		case 14:
			characterForDigit.append("N");
			break;
		case 15:
			characterForDigit.append("O");
			break;
		case 16:
			characterForDigit.append("P");
			break;
		case 17:
			characterForDigit.append("Q");
			break;
		case 18:
			characterForDigit.append("R");
			break;
		case 19:
			characterForDigit.append("S");
			break;
		case 20:
			characterForDigit.append("T");
			break;
		case 21:
			characterForDigit.append("U");
			break;
		case 22:
			characterForDigit.append("V");
			break;
		case 23:
			characterForDigit.append("W");
			break;
		case 24:
			characterForDigit.append("X");
			break;
		case 25:
			characterForDigit.append("Y");
			break;
		case 26:
			characterForDigit.append("Z");
			break;
		}
		return characterForDigit;
	}
	
}
