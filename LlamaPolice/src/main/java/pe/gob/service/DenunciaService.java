package pe.gob.service;

import java.util.List;

import pe.gob.entity.Denuncia;

public interface DenunciaService {

	public void insert(Denuncia denuncia);

	public List<Denuncia> list();

	public void delete(int idDenuncia);
}