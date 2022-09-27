package healthcheck;

//Person �N���X���p��
class Adult extends Person {
	//�C���X�^���X Adult �̌ŗL�̒l���Z�b�g
	Adult() {
		super("���l","BMI");
	}

	/************************************
	 * BMI(�{�f�B�}�X�w��)�v�Z
	 ************************************/
	
	public double indexCalculation(){
		double height_m = this.height / 100;
		double bmi = this.weight / Math.pow(height_m, 2);
		return ((double)Math.round(bmi * 10))/10;

	}
	//WHO�ł̕]���ɂĔ���
	public String healthCheck(){
		if(indexCalculation() < 16) {
			return "��������";
		}else if(indexCalculation() < 17) {
			return "����";
		}else if(indexCalculation() < 18.5) {
			return "��������";
		}else if(indexCalculation() < 25) {
			return "���ʑ̏d";
		}else if(indexCalculation() < 30) {
			return "�ߑ̏d";
		}else if(indexCalculation() < 35) {
			return "�얞�i�P�x�j";
		}else if(indexCalculation() < 40) {
			return "�얞�i�Q�x�j";
		}else {
			return "�얞�i�R�x�j";
		}	
	}
}