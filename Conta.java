package banco;
	public class Conta{
		protected String titular;
		protected int numero;
		protected double saldo;
		
		
		public Conta(String titular, int numero) {
			super();
			this.titular = titular;
			this.numero = numero;
		}


		public String getTitular() {
			return titular;
		}


		public void setTitular(String titular) {
			this.titular = titular;
		}


		public int getNumero() {
			return numero;
		}


		public void setNumero(int numero) {
			this.numero = numero;
		}


		public double getSaldo() {
			return saldo;
		}


		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}

		public void depositar(double valor){
			saldo +=valor;
		}
		
		public void sacar(double valor){
			if(saldo <= valor){
				saldo= saldo- valor;
			}else{
				System.out.println("saldo insuficiente");
			}
		}

		public String verSaldo() {
			return "Conta [titular=" + titular + ", numero=" + numero
					+ ", saldo=" + saldo + "]";
		}
	}