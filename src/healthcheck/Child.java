package healthcheck;

//Person クラスを継承
class Child extends Person {
	//インスタンス Child の固有の値をセット
	Child() {
		super("未成年","ローレル指数");
	}

	/************************************
	 * ローレル指数計算
	 ************************************/
	//ローレル指数( (体重÷身長(ｍ))の３乗×10 )計算メソッド
	public double indexCalculation() {
		double height_m = this.height / 100;
		double ri = this.weight / Math.pow(height_m, 3) * 10;
		return ((double)Math.round(ri * 10))/10;
	}

	public String healthCheck(){
		if(indexCalculation() < 100) {
			return "やせ形";
		}else if(indexCalculation() < 115) {
			return "やせ気味";
		}else if(indexCalculation() < 145) {
			return "正常";
		}else if(indexCalculation() < 160) {
			return "肥満気味";
		}else {
			return "肥満";
		}	
	}
}
