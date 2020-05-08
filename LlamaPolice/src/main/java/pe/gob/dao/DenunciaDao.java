package pe.gob.dao;

import java.util.List;

import pe.gob.entity.Denuncia;

public interface DenunciaDao {

	public void insert(Denuncia denuncia);

	public List<Denuncia> list();

	public void delete(int idDenuncia);
}