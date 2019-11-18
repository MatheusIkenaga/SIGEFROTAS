/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

/**
 *
 * @author matheusikenaga
 */
public class Veiculo{
	private int CD_VEICULO;
	private String MARCA_VEICULO;
	private String MODELO_VEICULO;
	private String COR_VEICULO;
        private String PLACA_VEICULO;
        private int HODOM_VEICULO;
	private int ANO_VEICULO;
	private int ANO_MOD_VEICULO;
	private String TIPO_VEICULO;
        private String DISPO_VEICULO;
        private String SEGURO_VEICULO;
	private String NUM_APOLICE_VEICULO;	
	private String OBS_VEICULO;

        /*
    public Veiculo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
*/

	public int getCD_VEICULO(){
		return CD_VEICULO;
	}
        
        public void setCD_VEICULO(int CD_VEICULO){
		this.CD_VEICULO=CD_VEICULO;
	}

	public String getMarca_veiculo(){
		return MARCA_VEICULO;
	}

	public void setMarca_veiculo(String MARCA_VEICULO){
		this.MARCA_VEICULO=MARCA_VEICULO;
	}

	public String getModelo_veiculo(){
		return MODELO_VEICULO;
	}

	public void setModelo_veiculo(String MODELO_VEICULO){
		this.MODELO_VEICULO=MODELO_VEICULO;
	}

	public String getCor_veiculo(){
		return COR_VEICULO;
	}

	public void setCor_veiculo(String COR_VEICULO){
		this.COR_VEICULO=COR_VEICULO;
	}

	public int getAno_veiculo(){
		return ANO_VEICULO;
	}

	public void setAno_veiculo(int ANO_VEICULO){
		this.ANO_VEICULO=ANO_VEICULO;
	}

	public int getAno_modelo_veiculo(){
		return ANO_MOD_VEICULO;
	}

	public void setAno_modelo_veiculo(int ANO_MODELO_VEICULO){
		this.ANO_MOD_VEICULO=ANO_MODELO_VEICULO;
	}

	public String getTipo_veiculo(){
		return TIPO_VEICULO;
	}

	public void setTipo_veiculo(String TIPO_VEICULO){
		this.TIPO_VEICULO=TIPO_VEICULO;
	}
        
        public String getDISPO_VEICULO(){
		return DISPO_VEICULO;
	}

	public void setDISPO_VEICULO(String DISPO_VEICULO){
		this.DISPO_VEICULO=DISPO_VEICULO;
	}
        
        public int getHODOM_VEICULO(){
		return HODOM_VEICULO;
	}

	public void setHODOM_VEICULO(int HODOM_VEICULO){
		this.HODOM_VEICULO=HODOM_VEICULO;
	}

	public String getPlaca_veiculo(){
		return PLACA_VEICULO;
	}

	public void setPlaca_veiculo(String PLACA_VEICULO){
		this.PLACA_VEICULO=PLACA_VEICULO;
	}

	public String getObs_veiculo(){
		return OBS_VEICULO;
	}

	public void setObs_veiculo(String OBS_VEICULO){
		this.OBS_VEICULO=OBS_VEICULO;
	}

	public String getSeguro_veiculo(){
		return SEGURO_VEICULO;
	}

	public void setSeguro_veiculo(String SEGURO_VEICULO){
		this.SEGURO_VEICULO=SEGURO_VEICULO;
	}
        
        public String getNUM_APOLICE_VEICULO(){
		return NUM_APOLICE_VEICULO;
	}

	public void setNUM_APOLICE_VEICULO(String NUM_APOLICE_VEICULO){
		this.NUM_APOLICE_VEICULO=NUM_APOLICE_VEICULO;
	}
        
        /*
        
        public Veiculo(int CD_VEICULO, String MARCA_VEICULO, String MODELO_VEICULO, String COR_VEICULO, String PLACA_VEICULO, int HODOM_VEICULO, int ANO_VEICULO, int ANO_MOD_VEICULO, String TIPO_VEICULO, String DISPO_VEICULO, String SEGURO_VEICULO, String NUM_APOLICE_VEICULO, String OBS_VEICULO){
            this.CD_VEICULO = CD_VEICULO;
            this.MARCA_VEICULO = MARCA_VEICULO;
            this.MODELO_VEICULO = MODELO_VEICULO;
            this.COR_VEICULO =COR_VEICULO ;
            this.PLACA_VEICULO = PLACA_VEICULO;
            this.HODOM_VEICULO = HODOM_VEICULO;
            this.ANO_VEICULO = ANO_VEICULO;
            this.ANO_MOD_VEICULO = ANO_MOD_VEICULO;
            this.TIPO_VEICULO = TIPO_VEICULO;
            this.DISPO_VEICULO = DISPO_VEICULO;
            this.SEGURO_VEICULO = SEGURO_VEICULO;
            this.NUM_APOLICE_VEICULO = NUM_APOLICE_VEICULO;
            this.OBS_VEICULO = OBS_VEICULO;
        
        }
*/
}