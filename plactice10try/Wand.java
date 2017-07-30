package plactice10try;

public class Wand {
	private String name;
	private double power;

	public double getPower(){
		return this.power;
	}
	public void setPower(Double power){
		if(power < 0.5){
			throw new IllegalArgumentException("この杖には魔力が宿っていないようだ。");
		}
		if(power > 100){
			throw new IllegalArgumentException("この杖は危険だ…");
		}
		this.power = power;
	}
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		if(name.length() <= 2 || name == null){
			throw new IllegalArgumentException("名前が短すぎる。");
		}
		this.name = name;
	}

	public Wand(String name) {
		// TODO 自動生成されたコンストラクター・スタブ
		this.power = 3.0;
		this.name = name;
	}
}
