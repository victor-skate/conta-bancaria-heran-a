package banco;
	public class ContaUniversitaria extends Conta{
		private double taxa = 0.10;
		public ContaUniversitaria(String titular, int numero) {
			super(titular, numero);
			
		}
		public void sacar(double valor){
			if(valor+taxa<=saldo){
				saldo=saldo-(valor+taxa);
			}else{
				System.out.println("saldo insuficiente");
			}
		}
	}