/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

/**
 *
 * @author Matheus
 */
public class Seguro {
    
    private int CD_SEGURO;
    private int CD_VEICULO_SEGURO;
    private float VALOR_SEGURO;
    
      public int getCd_seguro(){
		return CD_SEGURO;
	}

	public void setCd_seguro(int CD_SEGURO){
		this.CD_SEGURO=CD_SEGURO;
	}
        
        public int getCd_veiculo_seguro(){
		return CD_VEICULO_SEGURO;
	}

	public void setCd_veiculo_seguro(int CD_VEICULO_SEGURO){
		this.CD_VEICULO_SEGURO=CD_VEICULO_SEGURO;
	}
        public float getValor_seguro(){
		return VALOR_SEGURO;
	}

	public void setValor_seguro(float VALOR_SEGURO){
		this.VALOR_SEGURO=VALOR_SEGURO;
	}
}
