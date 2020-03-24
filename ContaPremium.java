package banco;
	public class ContaPremium extends Conta{
		private double limite=1000;
		public ContaPremium(String titular, int numero) {
			super(titular, numero);
			
		}
		
		public void sacar (double valor){
			if(valor<=saldo+limite){
				saldo=saldo-valor;
			}else{
				System.out.println("saldo insuficiente");
			}
		}
	}