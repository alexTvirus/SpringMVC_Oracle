package repository;

import java.io.Serializable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import entity.Userentity;
import java.util.List;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
@Repository
public interface UserRepository extends CrudRepository<Userentity, Integer>{
   
   Userentity findByNameContaining(String name);
   
}
