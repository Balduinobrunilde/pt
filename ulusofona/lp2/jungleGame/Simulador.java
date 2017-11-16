
package pt.ulusofona.lp2.jungleGame;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Simulador {
    List<Animal> atletas=new ArrayList<>();
    private String nomeFicheiro;
    
    
    
    public boolean iniciaJogo(File ficheiroInicial, int compimentoPista){
            Animal tarzan = new Animal ("tarzan", 1, 1, 3,2);
            Animal tigre  = new Animal ("tigre", 2, 2, 4,3);
            Animal girafa = new Animal ("girafa", 3, 3, 5,3);
            Animal ddd = new Animal ("girafa", 3, 7, 5,3);
            atletas.add(tarzan); 
            atletas.add(girafa); 
            atletas.add(tigre); 
            atletas.add(ddd); 
            return true;
    
    }
    public List<Animal> getAnimais(){
           
        
        return atletas;
    }

      public boolean processaTurno(){
          for(Animal a:atletas){
              a.posicao = a.posicao +1;
          }
          
          return true;
      }
      
      /*public class List<String> getClassificacaoGeral(){
          return 
          
      }*/
              
}
