package healthcheck;

//Person �N���X���p��
class Child extends Person {
	//�C���X�^���X Child �̌ŗL�̒l���Z�b�g
	Child() {
		super("�����N","���[�����w��");
	}

	/************************************
	 * ���[�����w���v�Z
	 ************************************/
	//���[�����w��( (�̏d���g��(��))�̂R��~10 )�v�Z���\�b�h
	public double indexCalculation() {
		double height_m = this.height / 100;
		double ri = this.weight / Math.pow(height_m, 3) * 10;
		return ((double)Math.round(ri * 10))/10;
	}

	public String healthCheck(){
		if(indexCalculation() < 100) {
			return "�₹�`";
		}else if(indexCalculation() < 115) {
			return "�₹�C��";
		}else if(indexCalculation() < 145) {
			return "����";
		}else if(indexCalculation() < 160) {
			return "�얞�C��";
		}else {
			return "�얞";
		}	
	}
}
