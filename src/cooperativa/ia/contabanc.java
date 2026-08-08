
package cooperativa.ia;

/**
 *
 * @author Irmãos IA
 */
public class contabanc {
    
    private String titular;
    private int numero;
    private double saldo;
    
    
    public contabanc(String titular, int numero , double saldo){
    
    this.titular=titular;
    this.numero= numero;
    this.saldo= saldo;
    
    
    }
   
    public double ExibirSaldo(double saldo){
    
    return saldo;
    
    }
     
     public double DepositarSaldo(double valor){
    
    return valor+saldo;
    
    }
     
     public double SacarSaldo(double valor){
    
    return valor-saldo;
    
    }
     
     public String getTitular(){
    
    return titular;
    
    }
     
     public int getNumero(){
    
    return numero;
    
    }
    
     public double getSaldo(){
    
    return saldo;
    
    }
    
     public void depositarSaldo(double valor){
     
      this.saldo=this.saldo+valor;
     
     }
     
     public void sacarSaldo(double valor){
     
      this.saldo=this.saldo-valor;
     
     }
     
}

