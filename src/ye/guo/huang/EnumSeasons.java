package ye.guo.huang;

public enum EnumSeasons {
	SPRING("春天"),SUMMER("夏天"),FALL("秋天"),WINTER("冬天");
	
	private final String name;
	private EnumSeasons(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
}
