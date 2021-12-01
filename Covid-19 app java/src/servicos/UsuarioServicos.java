/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos;

import dao.DaoFactory;
import dao.PacienteDao;
import dao.UsuarioDao;
import java.sql.SQLException;
import modelo.Usuario;

/**
 *
 * @author Legnus
 */
public class UsuarioServicos {
    public void cadastrarUsuario(Usuario u) throws SQLException {
        UsuarioDao uDao = DaoFactory.getUsuarioDAO();
        uDao.cadastrarUsuario(u);
    }
public void deletarUsuario(int codUsuario) throws SQLException{
        UsuarioDao uDao = DaoFactory.getUsuarioDAO();
        uDao.deletarUsuario(codUsuario);    
    }
}

