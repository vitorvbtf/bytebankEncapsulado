
public class TestaGetESet {

	public static void main(String[] args) {
	
	Conta conta = new Conta(123456, 654321);
	
	
	System.out.println(conta.getNumero());
	
	Cliente vitor = new Cliente();
	conta.setTitular(vitor);
    vitor.setNome("Vitor Bruno");
	System.out.println(conta.getTitular().getNome());
	
	
	//Primeira forma de alterar os atributos do cliente
	conta.getTitular().setNome("Lucas");
	System.out.println(conta.getTitular().getNome());
	//Segunda forma de alterar os atributos do cliente
	vitor.setNome("Vitor bruno");
	System.out.println(conta.getTitular().getNome());
	
	
	vitor.setProfissao("programador");
	conta.deposita(100);
	System.out.println(conta.getSaldo()); 
	conta.saca(150);
	System.out.println(conta.getSaldo()); 
	}
	
}
  