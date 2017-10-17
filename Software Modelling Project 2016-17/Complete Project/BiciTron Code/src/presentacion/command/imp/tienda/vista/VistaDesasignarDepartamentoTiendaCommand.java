package presentacion.command.imp.tienda.vista;

import presentacion.ListaComandos;
import presentacion.command.Command;
import presentacion.controlador.Contexto;

public class VistaDesasignarDepartamentoTiendaCommand implements Command
{
	@Override
	public Contexto execute(Object datos) 
	{
		return new Contexto(ListaComandos.VENTANADESASIGNARDEPARTAMENTOTIENDA, datos);
	}
}
