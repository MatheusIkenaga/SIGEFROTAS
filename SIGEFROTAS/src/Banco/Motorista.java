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
public class Motorista {
    
    
        private int CD_MOTORISTA;
	private String NM_MOTORISTA;
	private String CPF_MOTORISTA;
	private String RG_MOTORISTA;
	private String CNH_MOTORISTA;
	private String OBS_MOTORISTA;
        
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

	public String getObs_motorista(){
		return OBS_MOTORISTA;
	}

	public void setObs_motorista(String OBS_MOTORISTA){
		this.OBS_MOTORISTA=OBS_MOTORISTA;
	}
}
}
