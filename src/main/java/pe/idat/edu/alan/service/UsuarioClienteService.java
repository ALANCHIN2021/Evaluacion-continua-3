package pe.idat.edu.alan.service;

import java.util.List;

import pe.idat.edu.alan.model.UsuarioCliente;

public interface UsuarioClienteService {
	
	void guardarUsuarioCliente(UsuarioCliente usuario);
	void actualizarUsuarioCliente(UsuarioCliente usuario);
	void eliminarUsuarioCliente(Integer id);
	List<UsuarioCliente> listarUsuario();
	UsuarioCliente obtenerUsuarioId(Integer id);

}
