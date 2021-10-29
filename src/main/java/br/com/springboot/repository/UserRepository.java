package br.com.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.springboot.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

    //Buscar por um valor maior que tal código
    public List<User> findByIdGreaterThan(Long id);

    //Buscar por um nome
    public List<User> findByNameIgnoreCase(String name);

}