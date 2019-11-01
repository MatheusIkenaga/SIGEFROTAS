/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author matheusikenaga
 */
public class Adaptador extends TomadaDoisPinos{
    private TomadaTresPinos tomada;
    public Adaptador(TomadaTresPinos tomada){
        this.tomada = tomada;
    }
    public void ligarDoisPinos(){
        tomada.ligarTresPinos();
    }
}
