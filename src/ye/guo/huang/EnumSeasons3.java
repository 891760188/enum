package ye.guo.huang;

public enum EnumSeasons3 {
	SPRING("ct","春天"),SUMMER("xt","夏天"),FALL("qt","秋天"),WINTER("dt","冬天");
	
	private final String code;
	private final String name;
	//构造方法
	private EnumSeasons3(String code,String name){
		this.code = code;
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	public String getCode(){
		return this.code;
	}
}
