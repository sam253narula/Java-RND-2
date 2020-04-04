package com.custom.validator;

public class ValidateInputTest {
	
	public static void main(String[] args) {
		String vallidfirstName ="Sam";
		String inVallidfirstName ="Sam";
		//First Name is valid, only if the first letter is uppercase
		System.out.println(ValidateInput.validateFirstName(vallidfirstName));
		System.out.println(ValidateInput.validateFirstName(inVallidfirstName));
		
		String vallidLastName ="Narula's";
		String inVallidLastName = "3434sfsds";
		System.out.println(ValidateInput.validateLastName(vallidLastName));
		System.out.println(ValidateInput.validateLastName(inVallidLastName));
		
		//address has to be one digit space then 1 or more words
		String validAddress = "88 tilak";
		String inValidAddress = "88 tilak ";
		System.out.println("Address "+ ValidateInput.validateAddress(validAddress));
		System.out.println(ValidateInput.validateLastName(inValidAddress));
		
		// Zip coe with 6 digits is accepted
		String validZip = "400809";
		String inValidZip = "40080";
		System.out.println(ValidateInput.validateZip(validZip));
		System.out.println(ValidateInput.validateZip(inValidZip));
		String indianNumber = "9840552401";
		//ten digit valid else false
		System.out.println(ValidateInput.validatIndianMobileNumber(indianNumber));
		
	}

}
