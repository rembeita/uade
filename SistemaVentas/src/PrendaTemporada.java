
public class PrendaTemporada extends Prenda
{
	private String estacion;
	private float porcentaje_incremento;

	public PrendaTemporada(int codigo, String nombre, String estacion, float porcentaje_incremento) 
	{
		super(codigo, nombre);
		this.estacion = estacion;
		this.porcentaje_incremento = porcentaje_incremento;
	}

	public String getEstacion() {
		return estacion;
	}

	public void setEstacion(String estacion) {
		this.estacion = estacion;
	}

	public float getPorcentaje_incremento() {
		return porcentaje_incremento;
	}

	public void setPorcentaje_incremento(float porcentaje_incremento) {
		this.porcentaje_incremento = porcentaje_incremento;
	}
	
	public float precioDeVenta(float porcentaje_incremento)
	{
		
	}
	}
	
	
}
