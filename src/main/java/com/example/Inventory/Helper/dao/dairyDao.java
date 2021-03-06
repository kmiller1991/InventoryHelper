package com.example.Inventory.Helper.dao;

import com.example.Inventory.Helper.models.Dairy;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public interface dairyDao extends CrudRepository<Dairy, Integer> {
    List<Dairy> findAll();
}
