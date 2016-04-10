import java.util.Vector;

public abstract class Prenda 
{
	protected int codigo;
	protected String nombre;
	protected Vector<Material> materiales;
	
	public Prenda(int codigo, String nombre) 
	{
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		materiales = new Vector<Material>();
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Vector<Material> getMateriales() {
		return materiales;
	}

	public void setMateriales(Vector<Material> materiales) {
		this.materiales = materiales;
	}
	
	
	
	
}
