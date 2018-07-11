package ye.guo.huang;

public class Test01 {
	public static void main(String[] args) {
		System.out.println(EnumSeasons2.FALL);
		System.out.println(EnumSeasons.FALL);
		System.out.println(EnumSeasons.FALL.getName());
		System.out.println(EnumSeasons3.FALL.getName());
		System.out.println(EnumSeasons3.FALL.getCode());
		System.out.println(EnumSeasons3.FALL);
		
		methodTest(EnumSeasons3.FALL);
	}
	
	private static void methodTest(EnumSeasons3 enums){
		System.out.println("-------------------------------------------");
		System.out.println(enums);
		System.out.println(enums.getCode());
		System.out.println(enums.getName());
	}
	
	
}
