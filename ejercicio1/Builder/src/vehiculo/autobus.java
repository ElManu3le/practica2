package vehiculo;

public class autobus {

    public int pasajeros;
    public String compayia;
    public String tipo_bus;

    public autobus(int pasajeros, String compayia, String tipo_bus) {
        this.pasajeros = pasajeros;
        this.compayia = compayia;
        this.tipo_bus = tipo_bus;
    }

	public int getPasajeros() {
		return pasajeros;
	}

	public void setPasajeros(int pasajeros) {
		this.pasajeros = pasajeros;
	}

	public String getCompayia() {
		return compayia;
	}

	public void setCompayia(String compayia) {
		this.compayia = compayia;
	}

	public String getTipo_bus() {
		return tipo_bus;
	}

	public void setTipo_bus(String tipo_bus) {
		this.tipo_bus = tipo_bus;
	}

	@Override
	public String toString() {
		return "autobus [pasajeros=" + pasajeros + ", compayia=" + compayia + ", tipo_bus=" + tipo_bus + "]";
	}
    

   

    

    
    
}
