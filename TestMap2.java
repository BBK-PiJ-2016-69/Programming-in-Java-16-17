class TestMap2 {
	
	public static void main(String[] args){
		int i;

		SimpleMap2 map = new multiMapImplementation();

		map.put(1,"Matt");
		map.put(1,"Charlotte");
		map.put(2,"Olwyn");
		map.put(2,"Barry");
		map.put(3,"Pat");
		map.put(3,"Brian");

		String[] firstKey = map.get(1);
		String[] secondKey = map.get(2);
		String[] thirdKey = map.get(3);

		for(i = 0; i < firstKey.length; i++){
			System.out.println("1 - "+firstKey[i]);
		}

		for(i = 0; i < secondKey.length; i++){
			System.out.println("2 - "+secondKey[i]);
		}

		for(i = 0; i < thirdKey.length; i++){
			System.out.println("3 - "+thirdKey[i]);
		}



	}
}