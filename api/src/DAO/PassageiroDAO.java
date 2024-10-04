package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import conexao.Conexao;
import entity.Passageiro;

public class PassageiroDAO {
    
    public void cadastrarPassageiro(Passageiro passageiro){

        String sql = "insert into passageiro (nome, cpf, id_cidade, sexo, telefone, email, senha) values (?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement ps = null;

        try {
            ps = Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, passageiro.getNome());
            ps.setString(2, passageiro.getCpf());
            ps.setInt(3, passageiro.getId_cidade());
            ps.setString(4, String.valueOf(passageiro.getSexo()));
            ps.setString(5, passageiro.getTelefone());
            ps.setString(6, passageiro.getEmail());
            ps.setString(7, passageiro.getSenha());

            ps.execute();
            ps.close();

        } catch (SQLException e) {
            // TO DO Auto-generated catch block
            e.printStackTrace();
        }
        
    }

}
