package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Problem1 {
	public static final int START_ASCII = 64;

	public static void test(int hashcode) {
		Set<Integer> possibleIntegers = new HashSet<>();
		Integer intger = new Integer(hashcode);
		String str = intger.toString();
		int len = str.length();
		String result = "";
		for (int i = 0; i < len - 1; i++) {
			result = result + getChar(i);
			for (int j = i; j < i+2; j++) {
				try {
					possibleIntegers.add(Integer.valueOf(str.substring(i, j+1)));
				} catch (NumberFormatException e) {

				}
			}
		}
		System.out.println(possibleIntegers);
	}

	private static String getChar(int i) {
		if (i > 26) {
			return "";
		}
		char ch = (char) (START_ASCII + i);
		return new StringBuilder(ch).toString();
	}

	public List<String> getAllPossibleStrings(int hashCode) {
		if (hashCode == 0) {
			return Collections.EMPTY_LIST;
		}
		List<String> result = new ArrayList<String>();
		int temp = hashCode;
		int rem = 0;
		StringBuilder builder = new StringBuilder();
		while (temp != 0) {
			rem = temp % 10;
			result.add(getString(rem, ""));
			temp = temp / 10;
		}
		temp = hashCode;
		while (temp != 0) {
			rem = temp % 100;
			if (rem / 10 != 0) {
				result.add(getString(rem, ""));
			}
			temp = temp / 10;
		}
		return result;
	}

	private String getString(int rem, String initialString) {
		String str = initialString;
		int result = 0;
		if (rem / 10 != 0 && rem > 26) {
			int rem1 = rem % 10;
			int rem2 = rem / 10;
			str = getString(rem1, getString(rem2, ""));
		} else {
			result = START_ASCII + rem;
			char ch = (char) result;
			str = ch + initialString;
		}
		return str;
	}

	public static void main(String[] args) {
		int result = 67;
		test(123);
		char ch = (char) result;
		System.out.println(ch);
		Problem1 pr = new Problem1();
		System.out.println(pr.getAllPossibleStrings(123));
	}
}
