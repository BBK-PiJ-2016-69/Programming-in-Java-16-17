int i, j
boolean prime

while (i <= 1000){
 prime = true
	while (j < i){
 		if (j % i == 0 && j! = 1){
 		prime = false
 		}
 		j++

 	}
 	if(prime == true){
 		println i
 	}

 	i++;

}
	
