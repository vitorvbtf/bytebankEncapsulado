
public class TestaValores {
	public static void main(String[] args) {
		Conta conta = new Conta(12645, 5647);
		
		
		System.out.println(conta.getAgencia());
		System.out.println(conta.getNumero());
		
		Conta conta2 = new Conta(0, 98546);
		Conta conta3 = new Conta(45684, 32561);
		
		System.out.println(conta2.getAgencia());
		System.out.println(Conta.getTotal());
	}
}
