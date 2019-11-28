/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco.Aluguel;

/**
 *
 * @author matheusikenaga
 */
public class Aluguel 
{
	private int CD_VIAGEM;
        private String ORIGEM_VIAGEM;
        private String EST_ORIGEM_VIAGEM;
        private String DEST_VIAGEM;
        private String EST_DEST_VIAGEM;
        private Float KM_VIAGEM;
        private String TIPO_VIAGEM;
        private String MOTIVO_VIAGEM;
        private Float VALOR_VIAGEM;
        private String OBS_VIAGEM;
        private int CD_MOTORISTA_VIAGEM;
        private int CD_VEICULO_VIAGEM;
        
        
	public int getCD_VIAGEM()
	{
		return this.CD_VIAGEM;
	}
	public void setCD_VIAGEM(int value)
	{
		this.CD_VIAGEM = value;
	}

	
	public String getORIGEM_VIAGEM()
	{
		return this.ORIGEM_VIAGEM;
	}
	public void setORIGEM_VIAGEM(String value)
	{
		this.ORIGEM_VIAGEM = value;
	}

	
	public String getEST_ORIGEM_VIAGEM()
	{
		return this.EST_ORIGEM_VIAGEM;
	}
	public void setEST_ORIGEM_VIAGEM(String value)
	{
		this.EST_ORIGEM_VIAGEM = value;
	}

	
	public String getDEST_VIAGEM()
	{
		return this.DEST_VIAGEM;
	}
	public void setDEST_VIAGEM(String value)
	{
		this.DEST_VIAGEM = value;
	}

	
	public String getEST_DEST_VIAGEM()
	{
		return this.EST_DEST_VIAGEM;
	}
	public void setEST_DEST_VIAGEM(String value)
	{
		this.EST_DEST_VIAGEM = value;
	}

        
        public Float getKM_VIAGEM()
	{
		return this.KM_VIAGEM;
	}
	public void setKM_VIAGEM(Float value)
	{
		this.KM_VIAGEM = value;
	}
	
        
	public String getTIPO_VIAGEM()
	{
		return this.TIPO_VIAGEM;
	}
	public void setTIPO_VIAGEM(String value)
	{
		this.TIPO_VIAGEM = value;
	}

	
	public String getMOTIVO_VIAGEM()
	{
		return this.MOTIVO_VIAGEM;
	}
	public void setMOTIVO_VIAGEM(String value)
	{
		this.MOTIVO_VIAGEM = value;
	}

	
        public Float getVALOR_VIAGEM()
	{
		return this.VALOR_VIAGEM;
	}
	public void setVALOR_VIAGEM(Float value)
	{
		this.VALOR_VIAGEM = value;
	}
        
        
	public String getOBS_VIAGEM()
	{
		return this.OBS_VIAGEM;
	}
	public void setOBS_VIAGEM(String value)
	{
		this.OBS_VIAGEM = value;
	}

	
	public int getCD_MOTORISTA_VIAGEM()
	{
		return this.CD_MOTORISTA_VIAGEM;
	}
	public void setCD_MOTORISTA_VIAGEM(int value)
	{
		this.CD_MOTORISTA_VIAGEM = value;
	}

	
	public int getCD_VEICULO_VIAGEM()
	{
		return this.CD_VEICULO_VIAGEM;
	}
	public void setCD_VEICULO_VIAGEM(int value)
	{
		this.CD_VEICULO_VIAGEM = value;
	}

}

