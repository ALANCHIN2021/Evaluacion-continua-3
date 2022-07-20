package pe.idat.edu.alan.service;

import java.util.List;

import pe.idat.edu.alan.model.Cliente;

public interface ClienteService {
	void guardarCliente(Cliente cliente);
	void actualizarCliente(Cliente cliente);
	void eliminarCliente(Integer id);
	List<Cliente> listarCliente();
	Cliente obtenerClienteId(Integer id);
}
