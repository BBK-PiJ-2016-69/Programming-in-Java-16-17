int i, j = 2
boolean prime

while (i <= 1000){
 prime = true

	while (j < i){
		//println "j % i = ?"
		// println j + "%" + i + " = " + j % i
 		if (i % j == 0){
 		prime = false
 		}

 		j++


 	}

 	if(prime == true){ println i}

 	j=2
 	i++;

}
	
