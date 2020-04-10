
//Java 14 feature, in order to run this file set java 14 as a temporary environment variable(follow instrutions from readme file)
import java.util.Scanner;

public class SwitchExpressionDemo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a grade 0-100: ");
		int grade = input.nextInt();

		/*
		 * 1. Expression format shown here may not contain return. 2. Can also use this
		 * format as a standalone statement. 3. Cases with -> cannot fall through to the
		 * next case. 4. Can still use cases with :, which do allow fallthrough. 5.
		 * Cases may contain a block of code, in which case you use yield to specify the
		 * case's value. 6. Cases support individual values or comma-separated lists of
		 * values of integer types, enum types or Strings. 7. Eventually, there will be
		 * pattern matching support. See
		 * http://cr.openjdk.java.net/~briangoetz/amber/pattern-match.html 8. More
		 * future language enhancements: https://openjdk.java.net/projects/amber/
		 */
		@SuppressWarnings("preview")
		String letterGrade = switch (grade / 10) {
		case 9, 10 -> "A";
		case 8 -> "B";
		case 7 -> "C";
		case 6 -> "D";
		default -> {
			System.out.printf("Failing grade: %d%n", grade);
			yield "F";
		}
		};

		System.out.printf("Letter grade: %s%n", letterGrade);

	}
}

/**************************************************************************
 * (C) Copyright 2020 samarth narula.
 *************************************************************************/