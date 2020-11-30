package ar.edu.unq.po2.tp3;

public class Rectangulo {
	private Integer alto;
	private Integer base;
	private Point origen;
	private Point esquinaSuperiorDerecha;
	private Point esquinaSuperiorIzquierda;
	private Point esquinaInferiorDerecha;
	
	public Rectangulo(Point origen1, Integer base1, Integer alto1) {
		origen = origen1;
		esquinaSuperiorDerecha = new Point(origen.getX(),alto);
		esquinaInferiorDerecha = new Point(base,origen.getY());
		esquinaSuperiorIzquierda= new Point(base,alto);
		base = base1;
		alto = alto1;
		
	}
	
	
	
	public Integer getAlto() {
		return alto;
	}

	public Integer getBase() {
		return base;
	}

	public Point getOrigen() {
		return origen;
	}
	
	public Point getEsquinaSuperiorDerecha() {
		return esquinaSuperiorDerecha;
	}
	

	public Point getEsquinaSuperiorIzquierda() {
		return esquinaSuperiorIzquierda;
	}

	public Point getEsquinaInferiorDerecha() {
		return esquinaInferiorDerecha;
	}

    public void validateMedidas(Integer base, Integer alto) throws Exception {
    	if (base <=0) { throw new Exception("la base no puede ser negativa ni cero");}
    	if (alto <=0) { throw new Exception("la altura no puede ser negativa ni cero");}
    	
    	
    }

	public Integer area(){
		
		return getAlto() * getBase();
		
	}
	
	public Integer perimetro() {
		
		return 2*(getAlto()) + 2*(getBase());
		
	}
	
	public Boolean esHorizontal() {
		return getBase()>=getAlto();
	}
	
	public Boolean esVertical() {
		return getBase()<=getAlto();
	}
		

}
