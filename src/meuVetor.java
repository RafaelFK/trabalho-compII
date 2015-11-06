import java.util.Arrays;

public class meuVetor {
	Integer[] vector;

	public meuVetor(int size) {
		this.vector = new Integer[size];

	}

	public void resize(int newSize) {
		// Aloca memória para o novo vetor
		Integer[] newVector = new Integer[newSize];

		// Trasfere os dados para o novo vetor
		int smaller = this.getLength() < newSize ? this.getLength() : newSize;
		for (int i = 0; i < smaller; i++)
			newVector[i] = this.vector[i];

		// Passa o novo vetor para o objeto
		this.vector = newVector;
	}

	public int getLength() {
		return this.vector.length;
	}

	public void setValue(int index, Integer value)
			throws VetorIndexOutOfBoundsException, VetorNullPointerException {
		// Verifica se index está dentro do intervalo permitido
		if (index < 0 || index >= this.getLength())
			// Lançar exceção
			throw new VetorIndexOutOfBoundsException("Indice: " + index);
		else
			this.vector[index] = value;
	}

	public Integer getValue(int index) throws VetorIndexOutOfBoundsException,
			VetorNullPointerException {
		// Verifica se index está dentro do intervalo permitido
		if (index < 0 || index >= this.getLength())
			// Lançar exceção
			throw new VetorIndexOutOfBoundsException("Indice " + index);

		else if (this.vector[index] == null) {
			throw new VetorNullPointerException("indice " + index);
		} else
			return this.vector[index];
	}

	public int bsearch(int value) {
		// A busca binária exige que o vetor esteja ordenado
		this.bsort();

		int bot = 0, top = this.getLength() - 1, mid;
		while (bot <= top) {
			mid = (bot + top) / 2;
			if (mid == value)
				return mid;
			if (mid > value)
				top = mid - 1;
			else
				bot = mid + 1;
		}
		return -1;

	}

	public void bsort() {
		boolean swap = true;
		int len = this.getLength();
		while (swap) {
			swap = false;
			for (int i = 0; i < (len - 1); i++) {
				if ((this.vector[i] == null && this.vector[i + 1] == null)
						|| this.vector[i] != null && this.vector[i + 1] == null)
					;
				else if ((this.vector[i] == null && this.vector[i + 1] != null)
						|| (this.vector[i] > this.vector[i + 1])) {
					swap = true;
					Integer temp = this.vector[i];
					this.vector[i] = this.vector[i + 1];
					this.vector[i + 1] = temp;
				}
			}
			len--;
		}
	}

	/*
	 * public int find(int value) { int len = this.getLength(); Integer
	 * currentValue; for (int i = 0; i < len; i++) { currentValue =
	 * this.getValue(i); if (currentValue == value) return i; } return -1; }
	 */

	public void sort() {
		Arrays.sort(this.vector);
	}
}
