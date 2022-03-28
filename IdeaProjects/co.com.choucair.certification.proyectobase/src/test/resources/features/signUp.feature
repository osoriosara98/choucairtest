#autor: Sara
@stories
Feature: Sign up form
@regression
Scenario Outline: sign up on utest page
Given than Sara wants to sign in on Utest.com page.
When Sara fills out about you from fields <firstName>, <lastName>, <email>, <birthMonth>, <birthDay>, <birthYear>, <language>.
And Sara fills out location form fields <city>, <zipCode>, <country>.
And Sara fills out devices form fields <yourComputers>, <version>, <languages>, <mobileDevices>, <model>, <operatingSystem>.
And Sara fills out last step form fields <password>, <confirmPassword>.
Then Sara had sign in succesfully.
Examples:
|firstName|lastName|email|birthMonth|birthDay|birthYear|language|city|zipCode|country|yourComputers|version|languages|mobileDevices|model|operatingSystem|password|confirmPassword|
|Sara|Osorio|osoriosara98@gmail.com|June|29|1998|Spanish|Medellin|12345|Colombia|Windows|10|Spanish|Apple|iPhone3G|iOS 4.0|2090780S*password|2090780S*password|

