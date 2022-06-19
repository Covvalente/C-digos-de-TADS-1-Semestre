package ado8;

public class exe8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        double cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0, cont5 = 0, cont6 = 0;
        double porc1 = 0, porc2, porc3, porc4, porc5, porc6;

        for (int i = 0; i < 1000000; i++) {

            double random = Math.random();
            int m = (int) (1 + random * (7 - 1));
            System.out.println(m);

            if (m == 1) {
                cont1++;

            } else if (m == 2) {
                cont2++;

            } else if (m == 3) {
                cont3++;

            } else if (m == 4) {
                cont4++;

            } else if (m == 5) {
                cont5++;

            } else if (m == 6) {
                cont6++;

            }
        }
        porc1 = (cont1 / 1000000) * 100;
        porc2 = (cont2 / 1000000) * 100;
        porc3 = (cont3 / 1000000) * 100;
        porc4 = (cont4 / 1000000) * 100;
        porc5 = (cont5 / 1000000) * 100;
        porc6 = (cont6 / 1000000) * 100;

        System.out.println( "A porcentagem de vezes que 1 apareceu foi " + porc1  + "%" + " e o tanto de vezes que apareceu foi " + cont1 );
        System.out.println( "A porcentagem de vezes que 2 apareceu foi " + porc2  + "%" + " e o tanto de vezes que apareceu foi " + cont2 );
        System.out.println( "A porcentagem de vezes que 3 apareceu foi " + porc3  + "%" + " e o tanto de vezes que apareceu foi " + cont3 );
        System.out.println( "A porcentagem de vezes que 4 apareceu foi " + porc4  + "%" + " e o tanto de vezes que apareceu foi " + cont4 );
        System.out.println( "A porcentagem de vezes que 5 apareceu foi " + porc5  + "%" + " e o tanto de vezes que apareceu foi " + cont5 );
        System.out.println( "A porcentagem de vezes que 6 apareceu foi " + porc6  + "%" + " e o tanto de vezes que apareceu foi " + cont6 );
    


	}

}
