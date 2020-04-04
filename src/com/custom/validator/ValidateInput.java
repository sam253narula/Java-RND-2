package com.custom.validator;

public class ValidateInput {
	
public static boolean validateFirstName(String firstName) {
	return firstName.matches("[A-Z][a-zA-Z]*");
}

public static boolean validateLastName(String lastName) {
	return lastName.matches("[a-zA-Z]+(['-][a-zA-Z]+)*");
}

public static boolean validateAddress(String address) {
	return address.matches("\\d+\\s+([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z])+");
}

public static boolean validateZip(String zip) {
	return zip.matches("\\d{6}");
}

public static boolean validatIndianMobileNumber(String zip) {
	return zip.matches("\\d{10}");
}

}
