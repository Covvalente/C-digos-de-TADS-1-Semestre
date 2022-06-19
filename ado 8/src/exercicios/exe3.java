package exercicios;

public class exe3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] meses = {"jan","fev","mar","abr","mai","jun","jul","ago","set","out","nov","dez"};
		String [] dias = {"31","28","31","30","31","30","31","30","31","31","30","31"};
		String [] meses_e_dias = new String [meses.length+dias.length];
		
			for(int i=0 , j=0;i<meses_e_dias.length; i +=2,j++) {
		System.out.println(meses_e_dias [i] = meses [j] );
		System.out.println("");
		System.out.println(meses_e_dias [i+1] = dias [j] );
		System.out.println("");
	}

}
}