package aula2;

public class TestaFinally {

	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		}catch (Exception e)  {
			System.out.println(2);
		}finally {
			System.out.println(3);
		}
	}

}
