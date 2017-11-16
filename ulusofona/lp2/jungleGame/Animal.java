
package pt.ulusofona.lp2.jungleGame;
public class Animal {
    String nome;
    int idPersonagem;
    int idEspecie;
    int velocidadeBase;
    int energiaInicial;
    int posicao;

    public Animal(String nome, int idPersonagem, int idEspecie, int velocidadeBase, int energiaInicial) {
        this.nome = nome;
        this.idPersonagem = idPersonagem;
        this.idEspecie = idEspecie;
        this.velocidadeBase = velocidadeBase;
        this.energiaInicial = energiaInicial;
    }
    
    public   int   getPosicao(){
        
       return posicao; 
    }
    
    public   String   getImagePNG(){
        
        return null;
    }
    
}
