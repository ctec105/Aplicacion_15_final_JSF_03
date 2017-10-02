package pe.edu.aprender.managed;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import pe.edu.aprender.entity.Empleado;

@ManagedBean(name = "formulario")
public class FormularioBean {

	/*
	 * En el ManagedBean �FormularioBean� crearemos una variable de instancia de
	 * tipo �Empleado� con sus respectivos getter/setter
	 */
	private Empleado empleado = new Empleado();

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	// A�adimos un Action Method
	public String procesar() {
		// Invocar capa de negocio
		FacesMessage facesMessage = new FacesMessage("Registro completo ");
		FacesContext.getCurrentInstance().addMessage(null, facesMessage);
		return "resultado";
	}
}