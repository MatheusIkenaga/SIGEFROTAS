/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

import java.sql.Date;

/**
 *
 * @author Matheus
 */
public class Compras {
        
        private int CD_COMPRA;
        //private Date DT_COMPRA;
        private int NF_COMPRA; 
    	private int CHAVE_ACESSO_COMPRA;
        private float VALOR_COMPRA;
	private int CD_PECA_COMPRA;
        

        
        public int getCd_compra(){
		return CD_COMPRA;
	}

	public void setCd_compra(int CD_COMPRA){
		this.CD_COMPRA=CD_COMPRA;
	}
        
        /*public Date getDT_COMPRA (){
            return DT_COMPRA;
        }
        
        public void setDT_COMPRA (Date DT_COMPRA){
            this.DT_COMPRA = DT_COMPRA;
        }*/
        
        public int getNf_compra(){
		return NF_COMPRA;
	}

	public void setNf_compra(int NF_COMPRA){
		this.NF_COMPRA=NF_COMPRA;
	}
        
	public int getChave_acesso_compra(){
		return CHAVE_ACESSO_COMPRA;
	}

	public void setChave_acesso_compra(int CHAVE_ACESSO_COMPRA){
		this.CHAVE_ACESSO_COMPRA=CHAVE_ACESSO_COMPRA;
	}
        
         public float getValor_compra(){
		return VALOR_COMPRA;
	}

	public void setValor_compra(float VALOR_COMPRA){
		this.VALOR_COMPRA=VALOR_COMPRA;
	}

	public int getCd_peca_compra(){
		return CD_PECA_COMPRA;
	}

	public void setCd_peca_compra(int CD_PECA_COMPRA){
		this.CD_PECA_COMPRA=CD_PECA_COMPRA;
	}
}
