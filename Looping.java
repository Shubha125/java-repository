public class  Looping{
	public static void main(String[] args) {
		for(int number =3; number>=1; number--)
		{
			System.out.print(" "+number);
			//nested loop
			for( int p = 1; p<=number; p++){
				System.out.print(" "+number);
			}
			System.out.println("");
		}
	}
}

