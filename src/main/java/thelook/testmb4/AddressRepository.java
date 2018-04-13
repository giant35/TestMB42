/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thelook.testmb4;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author tangfanghua
 */
@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {
    
}
