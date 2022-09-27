package healthcheck;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		///////////////////////////////////////////////////
		// �W�����͏���
		///////////////////////////////////////////////////

		//�@���͂��󂯕t��
		Scanner sc = new Scanner(System.in);
		System.out.print("�N�����́F");
		int age = sc.nextInt();
		System.out.print("�g�������(cm)�F");
		double height = sc.nextDouble();
		System.out.print("�̏d�����(kg)�F");
		double weight = sc.nextDouble();

		///////////////////////////////////////////////////
		// �N��ɂ��A�쐬����C���X�^���X�𔻒�
		///////////////////////////////////////////////////
		if (age >= 20) {

			///////////////////
			//�@20�Έȏ�
			///////////////////

			//Adult�̃C���X�^���X
			Person adult = new Adult();
			// �쐬�����C���X�^���X�ɕW�����͂̐g���E�̏d���Z�b�g
			adult.height = height;
			adult.weight = weight;
			// �o�͏���
			adult.printData();

		} else {

			///////////////////
			//�@20�Ζ���
			///////////////////

			//Child�̃C���X�^���X
			Person child = new Child();
			// �쐬�����C���X�^���X�ɕW�����͂̐g���E�̏d���Z�b�g
			child.height = height;
			child.weight = weight;
			// �o�͏���
			child.printData();
		}

		///////////////////////////////////////////////////
		// �N���[�Y����
		///////////////////////////////////////////////////
		System.out.println("=========== END ===========");
		sc.close();
	}

}
