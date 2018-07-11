package ye.guo.huang;

public enum EnumSeasons3 {
	SPRING("ct","����"),SUMMER("xt","����"),FALL("qt","����"),WINTER("dt","����");
	
	private final String code;
	private final String name;
	//���췽��
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
