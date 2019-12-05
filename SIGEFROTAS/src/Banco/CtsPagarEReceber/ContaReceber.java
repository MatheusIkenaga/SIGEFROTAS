/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco.CtsPagarEReceber;

import java.sql.Date;
import java.util.List;

/**
 *
 * @author matheusikenaga
 */
public class ContaReceber
{
	private int CD_CONTA;
        private float TOTAL_CONTA;
        private float TOTAL_RECEBIDO;
        private String STATUS_CONTA;
        private String DT_RECEBIDO;
        private String CATEGORIA;
        private int CD_VEIC_CONTA;
        private String OBS_CONTA;
        
        
	public int getCD_CONTA()
	{
		return this.CD_CONTA;
	}
	public void setCD_CONTA(int value)
	{
		this.CD_CONTA = value;
	}

	
	public float getTOTAL_CONTA()
	{
		return this.TOTAL_CONTA;
	}
	public void setTOTAL_CONTA(float value)
	{
		this.TOTAL_CONTA = value;
	}

	
	public float getTOTAL_RECEBIDO()
	{
		return this.TOTAL_RECEBIDO;
	}
	public void setTOTAL_RECEBIDO(float value)
	{
		this.TOTAL_RECEBIDO = value;
	}

	
	public String getSTATUS_CONTA()
	{
		return this.STATUS_CONTA;
	}
	public void setSTATUS_CONTA(String value)
	{
		this.STATUS_CONTA = value;
	}
        
        
        public String getDT_RECEBIDO()
	{
		return this.DT_RECEBIDO;
	}
	public void setDT_RECEBIDO(String value)
	{
		this.DT_RECEBIDO = value;
	}
	
        
	public String getCATEGORIA()
	{
		return this.CATEGORIA;
	}
	public void setCATEGORIA(String value)
	{
		this.CATEGORIA = value;
	}

	
	public int getCD_VEIC_CONTA()
	{
		return this.CD_VEIC_CONTA;
	}
	public void setCD_VEIC_CONTA(int value)
	{
		this.CD_VEIC_CONTA = value;
	}

	
	public String getOBS_CONTA()
	{
		return this.OBS_CONTA;
	}
	public void setOBS_CONTA(String value)
	{
		this.OBS_CONTA = value;
	}
        
    void add(List<ContaReceber> contasReceber) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
