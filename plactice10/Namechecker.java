package plactice10;

public class Namechecker {

	private String name;

	public void setName(String name){
		if(name == null){
			throw new IllegalArgumentException("名前がnull。処理を中段");
		}
		if(name.length() <= 1){
			throw new IllegalArgumentException("名前が短すぎる。");
		}
		if(name.length() >= 8){
			throw new IllegalArgumentException("名前が長すぎる。");
		}

		this.name = name;
		System.out.println("あなたの名前は、" + this.name + "です。");
	}
}
