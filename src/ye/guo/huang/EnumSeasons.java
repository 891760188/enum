package ye.guo.huang;

public enum EnumSeasons {
	SPRING("����"),SUMMER("����"),FALL("����"),WINTER("����");
	
	private final String name;
	private EnumSeasons(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
}
