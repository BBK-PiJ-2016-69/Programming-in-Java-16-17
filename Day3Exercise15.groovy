String userInput, cleanInput = ""
int i, stringLength, loopTimes
boolean palindrome

println "Please enter your palindrome: "
userInput = System.console().readLine()


for (i = 0; i < userInput.length() ; i++){

	if(Character.isLetter(userInput.charAt(i))==true){
		cleanInput = cleanInput + Character.toLowerCase(userInput.charAt(i))
	}

}


stringLength = cleanInput.length()
loopTimes = stringLength

if(loopTimes % 2 != 0){
	loopTimes = loopTimes - 1
}

loopTimes = loopTimes / 2

i = 0;

while (i < loopTimes){

	if(cleanInput.charAt(i) == cleanInput.charAt(stringLength-i-1))
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