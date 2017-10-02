package pe.edu.aprender.listener;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

import org.apache.log4j.Logger;

/*
 * Con esta clase vamos a comprender el Ciclo de Vida de un face o
 * monitorear ejecuci�n de fases de JSF
 */

public class JSFListener implements PhaseListener {

	private static final long serialVersionUID = 1L;

	static Logger logger = Logger.getLogger(JSFListener.class.getName());

	/*
	 * Los m�todos beforePhase() y afterPhase() se ejecutan para todas las fases
	 * del ciclo de procesamiento de un request, por tanto, si se desea ejecutar
	 * alguna l�gica especial en determinada fase, se deber� obtener el ID de la
	 * fase y en base a condiciones, controlar el flujo del c�digo
	 */
	@Override
	public void beforePhase(PhaseEvent arg0) {
		logger.info("Antes de fase: " + arg0.getPhaseId());

	}

	@Override
	public void afterPhase(PhaseEvent arg0) {
		logger.info("Despues de fase: " + arg0.getPhaseId());
	}

	/*
	 * El m�todo getPhaseId() sirve para determinar a que fase est� asociado el
	 * listener. Cuando se usa para cualquier fase retorna el valor ANY_PHASE:
	 */
	@Override
	public PhaseId getPhaseId() {
		return PhaseId.ANY_PHASE;
	}

}