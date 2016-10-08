int i, j = 2, primeCount = 0
boolean prime

while (primeCount < 1000){
 prime = true

	while (j < i){
		//println "j % i = ?"
		// println j + "%" + i + " = " + j % i
 		if (i % j == 0){
 		prime = false
 		}

 		j++


 	}

 	if(prime == true){ 
 		println i
 		primeCount++

 	}

 	j=2
 	i++

}
	
