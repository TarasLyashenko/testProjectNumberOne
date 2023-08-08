package com.example.testProjectNumberOne.dao;

import com.example.testProjectNumberOne.entity.Car;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarDao extends CrudRepository<Car, Long>
{
    Car findByModel(String model);
}
