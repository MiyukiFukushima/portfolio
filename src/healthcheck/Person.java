package healthcheck;
//Adult Child のスーパークラス
abstract class Person {

	public String ageType;
	public String health1Type;

	public int age;
	public double height;
	public double weight;

	// 親クラス コンストラクタ
	Person(String ageType, String health1Type) {

		this.ageType = ageType;
		this.health1Type = health1Type;
	}

	/************************************
	 * 出力処理
	 ************************************/
	public void printData() {

		System.out.println("");
		System.out.println(ageType + "です");
		System.out.println("=====" + health1Type + "を計算します=====");
		System.out.println("身長：" + this.height + "cm");
		System.out.println("体重：" + this.weight + "kg");
		System.out.println(this.health1Type + "は" + indexCalculation() + "です");
		System.out.println("判定：" + healthCheck());

	}

	/************************************
	 * 指数計算処理
	 ************************************/
	// 計算処理が異なる(BMIとローレル指数を子クラスが継承するように抽象メソッドを定義)
	abstract public double indexCalculation();
	abstract public String healthCheck();

}
