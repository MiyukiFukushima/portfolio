package healthcheck;

//Person クラスを継承
class Adult extends Person {
	//インスタンス Adult の固有の値をセット
	Adult() {
		super("成人","BMI");
	}

	/************************************
	 * BMI(ボディマス指数)計算
	 ************************************/
	
	public double indexCalculation(){
		double height_m = this.height / 100;
		double bmi = this.weight / Math.pow(height_m, 2);
		return ((double)Math.round(bmi * 10))/10;

	}
	//WHOでの評価にて判定
	public String healthCheck(){
		if(indexCalculation() < 16) {
			return "痩せすぎ";
		}else if(indexCalculation() < 17) {
			return "痩せ";
		}else if(indexCalculation() < 18.5) {
			return "痩せぎみ";
		}else if(indexCalculation() < 25) {
			return "普通体重";
		}else if(indexCalculation() < 30) {
			return "過体重";
		}else if(indexCalculation() < 35) {
			return "肥満（１度）";
		}else if(indexCalculation() < 40) {
			return "肥満（２度）";
		}else {
			return "肥満（３度）";
		}	
	}
}