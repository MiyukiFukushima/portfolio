package healthcheck;
//Adult Child �̃X�[�p�[�N���X
abstract class Person {

	public String ageType;
	public String health1Type;

	public int age;
	public double height;
	public double weight;

	// �e�N���X �R���X�g���N�^
	Person(String ageType, String health1Type) {

		this.ageType = ageType;
		this.health1Type = health1Type;
	}

	/************************************
	 * �o�͏���
	 ************************************/
	public void printData() {

		System.out.println("");
		System.out.println(ageType + "�ł�");
		System.out.println("=====" + health1Type + "���v�Z���܂�=====");
		System.out.println("�g���F" + this.height + "cm");
		System.out.println("�̏d�F" + this.weight + "kg");
		System.out.println(this.health1Type + "��" + indexCalculation() + "�ł�");
		System.out.println("����F" + healthCheck());

	}

	/************************************
	 * �w���v�Z����
	 ************************************/
	// �v�Z�������قȂ�(BMI�ƃ��[�����w�����q�N���X���p������悤�ɒ��ۃ��\�b�h���`)
	abstract public double indexCalculation();
	abstract public String healthCheck();

}
