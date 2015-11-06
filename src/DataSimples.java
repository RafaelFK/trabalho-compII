
public class DataSimples {

		int day,
			month,
			year;
		
		//Methods
		public void setDate(int d, int m, int y) {
			if(dataValida(d, m, y)) {
				this.day = d;
				this.month = m;
				this.year = y;
			}
			//relse
				//Create exception
		}
		public String toString() {
			return this.day + "/" + this.month + "/" + this.year;
		}
		public static boolean dataValida(int dia, int mes, int ano) {
			
			int diasFevereiro = 28;
			
			if(ano < 1)
				return false;
			if(mes < 1 || mes > 12)
				return false;
			//Dia: verifica se o ano é bissexto
			if((((ano % 4) == 0 && (ano % 100) != 0) || (ano % 400) == 0)) {
				//Bissexto
				diasFevereiro = 29;
			}
			//else
				//diasFevereiro = 28;
			if(mes == 2)
				if(dia < 1 || dia > diasFevereiro)
					return false;
			if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 
															|| mes == 10 || mes == 12)
				if(dia < 1 || dia > 31)
					return false;
			if(dia < 1 || dia > 30)
				return false;
			
			return true;
		}
		
}
