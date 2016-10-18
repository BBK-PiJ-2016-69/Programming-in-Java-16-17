String userInput
int loopTimes = 0, i = 0, stringLength
boolean isPalindrome = false

println "Please enter your palindrome: "
userInput = System.console().readLine()

stringLength = userInput.length()

loopTimes = stringLength

if(loopTimes % 2 != 0){
	loopTimes = loopTimes - 1
}

loopTimes = loopTimes / 2

while (i < loopTimes){
	if(userInput.charAt(i) == userInput.charAt(stringLength-i-1))
	{
		palindrome = true
	}
	else
	{
		palindrome =  false
	}

	i++;
}

if(palindrome == true){
	println "This is a palindrome."
}
else
{
	println "This is not a palindrome."
}