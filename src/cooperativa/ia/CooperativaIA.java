
package cooperativa.ia;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Irmãos Amapá
 */
public class CooperativaIA {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
        
       
        ArrayList<contabanc> listaContas = new ArrayList<>();
        
        int escolha = 0;
        int proximoNumeroConta = 1; 
           
        while (escolha != 5) {
            System.out.println("-----Cooperativa Irmãos Amapá----- ");
            System.out.println("1) Criar Conta ");
            System.out.println("2) Depositar ");
            System.out.println("3) Sacar ");
            System.out.println("4) Consultar conta ");
            System.out.println("5) Sair ");
            System.out.print("Digite o número correspondente ao que deseja: ");
            
            escolha = teclado.nextInt();
            teclado.nextLine(); 
            
            if (escolha == 1) {
                System.out.println("----Criar Conta----");
                System.out.print("Informe seu Nome completo: ");
                String titular = teclado.nextLine();
                
                
                contabanc novaConta = new contabanc(titular, proximoNumeroConta, 0.0);
                
                listaContas.add(novaConta);
                
                System.out.println("--Conta criada com sucesso--");
                System.out.println("Titular: " + titular);
                System.out.println("Número da conta: " + proximoNumeroConta);
                System.out.println("Saldo R$: 0.0");
                
                proximoNumeroConta++; 
                
            } else if (escolha == 2) {
                System.out.println("----Depositar----");
                System.out.print("Digite o número da conta: ");
                int numConta = teclado.nextInt();
                
                
                contabanc contaEncontrada = buscarConta(listaContas, numConta);
                
                if (contaEncontrada != null) {
                    System.out.print("Digite o valor do depósito R$: ");
                    double valor = teclado.nextDouble();
                    
                    
                    contaEncontrada.depositarSaldo(valor); 
                    System.out.println("Depósito realizado com sucesso!");
                } else {
                    System.out.println("Conta não encontrada!");
                }
                
            } else if (escolha == 3) {
                System.out.println("----Sacar----");
                System.out.print("Digite o número da conta: ");
                int numConta = teclado.nextInt();
                
                contabanc contaEncontrada = buscarConta(listaContas, numConta);
                
                if (contaEncontrada != null) {
                    System.out.print("Digite o valor do saque R$: ");
                    double valor = teclado.nextDouble();
                    
                   
                    contaEncontrada.sacarSaldo(valor);
                } else {
                    System.out.println("Conta não encontrada!\n");
                }
                
            } else if (escolha == 4) {
                System.out.println("----Consultar Conta----");
                System.out.print("Digite o número da conta: ");
                int numConta = teclado.nextInt();
                
                contabanc contaEncontrada = buscarConta(listaContas, numConta);
                
                if (contaEncontrada != null) {
                    System.out.println("-- Dados da Conta --");
                    System.out.println("Titular: " + contaEncontrada.getTitular());
                    System.out.println("Número: " + contaEncontrada.getNumero());
                    System.out.println("Saldo R$: " + contaEncontrada.getSaldo());
                } else {
                    System.out.println("Conta não encontrada!");
                }
            }
        }
        System.out.println("Tchau!");
    }
    
    
    private static contabanc buscarConta(ArrayList<contabanc> contas, int numero) {
        for (contabanc c : contas) {
            if (c.getNumero() == numero) {
                return c;
            }
        }
        return null;
    }
}
    

