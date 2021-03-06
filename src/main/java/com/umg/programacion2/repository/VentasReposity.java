package com.umg.programacion2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.umg.programacion2.model.Cliente;
import com.umg.programacion2.model.Ventas;
@Repository
public interface VentasReposity extends CrudRepository<Ventas, Long>{
	List<Ventas> findAll();
//	entityManagerFactory
	List<Ventas> findByCliente(Cliente cliente);
	
	@Query("SELECT v from Ventas  v WHERE v.cliente.idCliente =?1")
	List<Ventas> findByCliente2(Long id);

}
