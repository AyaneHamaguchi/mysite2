
public class Java_BMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="橋本環奈";
		System.out.println("名前:"+name);
		System.out.println("性別：女");
		int number1= 152;
		System.out.println("身長："+number1+"cm");
		int number2= 47;
		System.out.println("体重："+number2+"kg");
		double weight= 47.0;
		double height=1.52;
		double bmi=weight/(height*height);
		System.out.println("BMI:"+bmi);
		
		//平均値
		int number3=1235;
		int number4=1218;
		int number5=(number3+number4)/2;
		System.out.println(number5);
		
		double x=bmi;
		if(x>25) {
			System.out.println("肥満");
		}else if(x>=18.5 && x<=25) {
			System.out.println("標準");
		}else if(x<18.5) {
			System.out.println("低体重");
		}
		
				
		
		
	}

}
