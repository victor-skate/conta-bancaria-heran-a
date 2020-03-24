package banco;
		
	public class Principal {
		static Conta[]contas= new Conta[10];
	
	public static void cadastrar(){
		String titular = Teclado.lerString("titular:");
		int numero = Teclado.lerInt("numero:");
		Conta conta = null;
		int op = Teclado.lerInt("(1)conta premium (2)conta universitaria");
			
			switch (op){
			case 1:
				conta= new ContaPremium(titular,numero);
				break;
			
			case 2:
				conta = new ContaUniversitaria(titular,numero);
				break;
			}
			for (int i = 0; i < contas.length; i++){
				if(contas[i]==null){
					contas[i]=conta;
					break;
						}
					}
				System.out.println("cadastrado com sucesso");
				menu();
			}
	
		public static void depositar(){
			int numero = Teclado.lerInt("numero:");
			double valor = Teclado.lerDouble("valor:");
			for (int i =0; i< contas.length;i++){
				if(contas[i]!=null && contas[i].getNumero()==numero){
					contas[i].depositar(valor);
					break;
				}
			}
		System.out.println("depositado com sucesso");
		menu();
		}
			
			
		public static void sacar(){
			int numero = Teclado.lerInt("numero:");
			double valor = Teclado.lerDouble("valor:");
			for (int i = 0; i < contas.length; i++){
				if(contas[i]!=null && contas[i].getNumero()==numero){
					contas[i].sacar(valor);
				break;
				}
			}
		System.out.println("sacado com sucesso");
		menu();
		}
		
		
		public static void verSaldo(){
			for(int i = 0; i < contas.length; i++){
				if(contas[i]!=null){
					System.out.println(contas[i].verSaldo());
					
				}
			}
		}
		
		public static void main(String[]args){
			menu();
			
		}

		private static void menu() {
			int op = Teclado.lerInt("(1)cadastrar (2)alterar (3)excluir (4)depositar (5)sacar (6)ver saldo (7)sair");
			switch (op){
			case 1:
				cadastrar();
				break;
			
			case 4:
				depositar();
				break;
				
			case 5:
				sacar();
				break;
			
			case 6:
				verSaldo();
				break;
				
			case 7:
				System.exit(0);
				break;
			}
		
		}
	
	
	}
	