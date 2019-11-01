/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author matheusikenaga
 */
public class Executavel {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]){
        TomadaTresPinos t1 = new TomadaTresPinos();
        Adaptador ad = new Adaptador(t1);
        ad.ligarDoisPinos();
    }
    
}
