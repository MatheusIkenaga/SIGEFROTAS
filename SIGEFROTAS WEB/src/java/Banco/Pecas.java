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
public class Pecas {
        
        private int CD_PECA;
	private String NOME_PECA;
	private int QTD_PECA;
        private float VALOR_PECA;
	private int CD_FORNEC_PECA;

        
        
        public int getCd_peca(){
		return CD_PECA;
	}

	public void setCd_peca(int CD_PECA){
		this.CD_PECA=CD_PECA;
	}
        
	public String getNome_peca(){
		return NOME_PECA;
	}

	public void setNome_peca(String NOME_PECA){
		this.NOME_PECA=NOME_PECA;
	}

	public int getQtd_peca(){
		return QTD_PECA;
	}

	public void setQtd_peca(int QTD_PECA){
		this.QTD_PECA=QTD_PECA;
	}
        
        public float getValor_peca(){
		return VALOR_PECA;
	}

	public void setValor_peca(float VALOR_PECA){
		this.VALOR_PECA=VALOR_PECA;
	}

	public int getCd_fornec_peca(){
		return CD_FORNEC_PECA;
	}

	public void setCd_fornec_peca(int CD_FORNEC_PECA){
		this.CD_FORNEC_PECA=CD_FORNEC_PECA;
	}
}

