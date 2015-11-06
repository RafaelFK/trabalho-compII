public class principal {

	public static void main(String[] args) {

		// Cria um novo objeto meuVetor
		meuVetor arranjo = new meuVetor(10);

		// Designa valores para o vetor
		try {
			/*arranjo.setValue(0, 1);
			arranjo.setValue(1, 1);
			arranjo.setValue(2, 2);
			arranjo.setValue(3, 3);
			arranjo.setValue(4, 5);
			arranjo.setValue(5, 8);
			arranjo.setValue(6, 13);
			arranjo.setValue(7, 21);
			arranjo.setValue(8, 34);
			arranjo.setValue(9, 55);*/
			//----------------------
			arranjo.setValue(0, 10);
			arranjo.setValue(1, null);
			arranjo.setValue(2, 8);
			arranjo.setValue(3, null);
			arranjo.setValue(4, 6);
			arranjo.setValue(5, null);
			arranjo.setValue(6, 4);
			arranjo.setValue(7, null);
			arranjo.setValue(8, 2);
			arranjo.setValue(9, null);
		} catch (VetorIndexOutOfBoundsException e) {
			System.err.println("VetorIndexOutOfBoundsException :"
					+ e.getMessage());
		} catch (VetorNullPointerException e) {
			System.err.println("VetorNullPointerException :" + e.getMessage());
		}

		// Imprime o vetor
		for (int i = 0; i < arranjo.getLength(); i++)
			try {
				System.out.println(arranjo.getValue(i));
			} catch (VetorIndexOutOfBoundsException e) {
				System.err.println("VetorIndexOutOfBoundsException :"
						+ e.getMessage());
			} catch (VetorNullPointerException e) {
				System.err.println("VetorNullPointerException :"
						+ e.getMessage());
			}

		System.out.println("--------------------");
		// Busca os valores 10 e 8 no vetor
		//System.out.println(arranjo.find(8));
		//System.out.println(arranjo.find(8));

		System.out.println("--------------------");
		// Ordena o vetor e o imprime
		arranjo.bsort();
		for (int i = 0; i < arranjo.getLength(); i++)
			try {
				System.out.println(arranjo.getValue(i));
			} catch (VetorIndexOutOfBoundsException e) {
				System.err.println("VetorIndexOutOfBoundsException :"
						+ e.getMessage());
			} catch (VetorNullPointerException e) {
				System.err.println("VetorNullPointerException :"
						+ e.getMessage());
			}

		System.out.println("--------------------");
		// Produz a interseção de dois vetores
	}

}
