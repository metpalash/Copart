# Copart Coding Exercise

# 1.LicenseKey.Java

# Problem
We are given a string S consisting of N characters and an integer K. The string represents software license key which we would like to format. The string is composed of alphanumeric characters and dashes. The dashes split the string into groups (i.e if there are M dashes, the string is split into M+1 groups). The dashes in the string are possibly misplaced.

We want each group of characters to be of the length K (except for possibly the first group which could be shorter). All lowercase letters must be converted to uppercase.

# Class
java.util.Scanner

# Compile Instruction
Compile Licensekey.java

# Input
String S
Integer K

# Output
Formatted License Key according to Rules


# 2.StringToNumber.java

# Problem
Without using any Integer functions like parseInt/valueOf convert the String to Integer. e.g. String input = “1234” - > Integer output=1234.

# Compile Instruction
Compile StringToNumber.java

# Input
String

# Output
Integer

# 3.Phone Component - Address Component Problem

# Problem
Phone Component: validation and auto format. a). As you enter numbers, the phone field should auto format. Format should look like (123) 456-7890. b). As you delete/backspace numbers from right to left, the format should auto adjust. After removing last 4 digits, the hyphen should go away and rest of the numbers format remain same: (123) 456 but should display error message:Invalid phone number, if user leaves field incomplete and goes to another field:

Address Component:

a). Build component to fetch full address as user enters street address, using Google API.

b). Address fields should be editable after populating address from google api.

Address:______ Street name 1: ______ Street Name 2:_____ City:_____ State:______ Zipcode:_____

# Compile Instruction
#To run code you should have node installed. Extract Address_Phone.zip.
#Type npm install in current directory to download required packages.
#To start the program type npm start.
#For more details read package.json.
