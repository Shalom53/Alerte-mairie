/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.defictech.AlertCommune.dao;

import com.defictech.AlertCommune.model.Incident;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Serge
 */
@Repository
public interface IncidentRepository extends JpaRepository<Incident, Integer> {
    
}
