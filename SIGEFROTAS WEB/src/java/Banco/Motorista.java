/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author Matheus
 */
public class Motorista {
    
    
        private int CD_MOTORISTA;
	private String NM_MOTORISTA;
        private String TELEFONE_MOTORISTA;
        private String CPF_MOTORISTA;
	private String RG_MOTORISTA;
        private String DT_NASC_MOTORISTA;
	private String SX_MOTORISTA; //get set
	private String CNH_MOTORISTA;
        private String VAL_CNH_MOTORISTA;
	private String OBS_MOTORISTA;
        
        /*
        public Cliente(String nome, String cpf, String dataNasc, String endereco, String telefone) throws ParseException {
		
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
		this.dataNasc = formato.parse(dataNasc);
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.telefone = telefone;
	}
        
        
        public Motorista (int CD_MOTORISTA, String NM_MOTORISTA, String DT_NASC_MOTORISTA, String CPF_MOTORISTA, String RG_MOTORISTA, String CNH_MOTORISTA, String VAL_CNH_MOTORISTA, String OBS_MOTORISTA, String SOBRENOME_MOTORISTA, int SEXO_MOTORISTA) throws ParseException {
        
            SimpleDateFormat formato = new SimpleDateFormat ("dd/MM/yyyy");
            this.DT_NASC_MOTORISTA = (Date) formato.parse(DT_NASC_MOTORISTA);
            this.VAL_CNH_MOTORISTA = (Date) formato.parse (VAL_CNH_MOTORISTA);
            this.CD_MOTORISTA = CD_MOTORISTA;
            this.CPF_MOTORISTA = CPF_MOTORISTA;
            this.CNH_MOTORISTA = CNH_MOTORISTA;
            this.NM_MOTORISTA = NM_MOTORISTA;
            this.OBS_MOTORISTA = OBS_MOTORISTA;
            this.RG_MOTORISTA = RG_MOTORISTA;
            this.SOBRENOME_MOTORISTA = SOBRENOME_MOTORISTA;
            this.SEXO_MOTORISTA = SEXO_MOTORISTA;
        }

    public Motorista() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
        */
        
        public int getCD_MOTORISTA(){
		return CD_MOTORISTA;
	}
        
        public void setCD_MOTORISTA(int CD_MOTORISTA){
		this.CD_MOTORISTA=CD_MOTORISTA;
	}

	public String getNm_motorista(){
		return NM_MOTORISTA;
	}

	public void setNm_motorista(String NM_MOTORISTA){
		this.NM_MOTORISTA=NM_MOTORISTA;
	}
        
        public String getDT_NASC_MOTORISTA (){
            return DT_NASC_MOTORISTA;
        }
        
        public void setDT_NASC_MOTORISTA (String DT_NASC_MOTORISTA){
            this.DT_NASC_MOTORISTA = DT_NASC_MOTORISTA;
        }
                
                /*public Date getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;*/

	public String getCpf_motorista(){
		return CPF_MOTORISTA;
	}

	public void setCpf_motorista(String CPF_MOTORISTA){
		this.CPF_MOTORISTA=CPF_MOTORISTA;
	}

	public String getRg_motorista(){
		return RG_MOTORISTA;
	}

	public void setRg_motorista(String RG_MOTORISTA){
		this.RG_MOTORISTA=RG_MOTORISTA;
	}

	public String getCnh_motorista(){
		return CNH_MOTORISTA;
	}

	public void setCnh_motorista(String CNH_MOTORISTA){
		this.CNH_MOTORISTA=CNH_MOTORISTA;
	}
        
         public String getVAL_CNH_MOTORISTA (){
            return VAL_CNH_MOTORISTA;
        }
        
        public void setVAL_CNH_MOTORISTA (String VAL_CNH_MOTORISTA){
            this.VAL_CNH_MOTORISTA = VAL_CNH_MOTORISTA;
        }

	public String getObs_motorista(){
		return OBS_MOTORISTA;
	}

	public void setObs_motorista(String OBS_MOTORISTA){
		this.OBS_MOTORISTA=OBS_MOTORISTA;
	}
        
        public String getTELEFONE_motorista(){
		return TELEFONE_MOTORISTA;
	}

	public void setTELEFONE_motorista(String TELEFONE_MOTORISTA){
		this.TELEFONE_MOTORISTA=TELEFONE_MOTORISTA;
	}
        
        
        public String getSX_MOTORISTA(){
		return SX_MOTORISTA;
	}

	public void setSX_MOTORISTA(String SX_MOTORISTA){
		this.SX_MOTORISTA=SX_MOTORISTA;
	}
        //SX_MOTORISTA
}

