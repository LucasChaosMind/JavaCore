package javacore.polimorfismo.classes;

public class RelatorioPagamento {
    public void relatorioPagamentoGenerico(Funcionario funcionario){
      System.out.println("----------------------");
      System.out.println("Gerando Relatorio de Pagamento...");
      funcionario.calculaPagamento();
      System.out.println(funcionario);
      if(funcionario instanceof Gerente){
          Gerente aux = (Gerente) funcionario;
          System.out.println("Participacao nos lucros: "+aux.getPnl());
      }
      if(funcionario instanceof  Vendedor){
          System.out.println("Vendas: "+((Vendedor) funcionario).getVenda());
      }
    }
}
