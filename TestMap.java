public class TestMap{
	
	public static void main(String[] args){
		SimpleMap map = new mapImplementation();

		System.out.println(map.isEmpty());

		map.put(1,"Hello, ");
		map.put(2,"world");
		map.put(3,"!");


		System.out.println(map.isEmpty());

		System.out.println(map.get(1));
		System.out.println(map.get(2));
		System.out.println(map.get(3));

		map.remove(1);
		map.remove(2);

		System.out.println(map.isEmpty());

		map.remove(3);

		System.out.println(map.isEmpty());
	}
}