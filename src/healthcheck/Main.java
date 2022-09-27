package healthcheck;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		///////////////////////////////////////////////////
		// 標準入力処理
		///////////////////////////////////////////////////

		//　入力を受け付け
		Scanner sc = new Scanner(System.in);
		System.out.print("年齢を入力：");
		int age = sc.nextInt();
		System.out.print("身長を入力(cm)：");
		double height = sc.nextDouble();
		System.out.print("体重を入力(kg)：");
		double weight = sc.nextDouble();

		///////////////////////////////////////////////////
		// 年齢により、作成するインスタンスを判定
		///////////////////////////////////////////////////
		if (age >= 20) {

			///////////////////
			//　20歳以上
			///////////////////

			//Adultのインスタンス
			Person adult = new Adult();
			// 作成したインスタンスに標準入力の身長・体重をセット
			adult.height = height;
			adult.weight = weight;
			// 出力処理
			adult.printData();

		} else {

			///////////////////
			//　20歳未満
			///////////////////

			//Childのインスタンス
			Person child = new Child();
			// 作成したインスタンスに標準入力の身長・体重をセット
			child.height = height;
			child.weight = weight;
			// 出力処理
			child.printData();
		}

		///////////////////////////////////////////////////
		// クローズ処理
		///////////////////////////////////////////////////
		System.out.println("=========== END ===========");
		sc.close();
	}

}
