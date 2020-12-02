/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

/**
 *
 * @author JOSE
 */
public class Principal {
    public static void main(String[] args) {// se crea el metodo main para la ejecucion del programa
        dados lanzardado=new dados(0);// se crea un objeto de tipo de dato abstracto llamado dados
        dados lanzardado1=new dados(0);// de aqui se empieza a manipular datos con el fin deseado
        lanzardado.setCantidad_de_lado(6);// de aqui se empieza a manipular datos con el fin deseado
        lanzardado1.setCantidad_de_lado(10);//de aqui se empieza a manipular datos con el fin deseado/
        lanzardado.setLadoactual(4);// de aqui se empieza a manipular datos con el fin deseado
        System.out.println("primer lanzamiento: " +lanzardado.getCantidad_de_lado());// se imprime el mensaje de lo que se solicita
        System.out.println("lado actual : "+lanzardado.getLadoactual());// se imprime el mensaje de lo que se solicita
        System.out.println("segundo lanzamiento: " +lanzardado1.getCantidad_de_lado());// se imprime el mensaje de lo que se solicita
      
    }
}
