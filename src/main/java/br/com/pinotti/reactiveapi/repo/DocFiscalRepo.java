package br.com.pinotti.reactiveapi.repo;

import java.util.Optional;

import org.springframework.data.repository.ListCrudRepository;

import br.com.pinotti.reactiveapi.model.DocFiscal;

public interface DocFiscalRepo extends ListCrudRepository<DocFiscal, Integer>{
	public Optional<DocFiscal> findByProtocolo(String protocolo);
}
