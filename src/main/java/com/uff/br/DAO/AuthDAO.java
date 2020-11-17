package com.uff.br.DAO;

import com.uff.br.entities.Auth;
import org.springframework.data.repository.CrudRepository;

public interface AuthDAO extends CrudRepository<Auth, Integer> {

}