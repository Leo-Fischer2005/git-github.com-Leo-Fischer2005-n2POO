import java.util.HashMap;

public class GerenciadorDeContatos {
  public HashMap<String, String> Contatos= new HashMap<String, String>();  

  public void AdicionarContato(String nome, String tele){
    this.Contatos.put(nome, tele);
  }
  public void RemoverContato(String nome){
    this.Contatos.remove(nome);
  }
  public void BuscarContato(String nome){
    System.out.println(this.Contatos.get(nome));
  }
  public void ListarContatos(){
    Contatos.forEach((nome, tele)->{
        System.out.print(nome);
        System.out.print("  ");
        System.out.println(tele);
    });
  }
}