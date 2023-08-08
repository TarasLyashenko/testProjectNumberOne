package com.example.testProjectNumberOne;

import com.example.testProjectNumberOne.dao.CarDao;
import com.example.testProjectNumberOne.entity.Car;
import jakarta.annotation.Resource;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class testProjectNumberOneApplication implements CommandLineRunner
{
    @Resource
    private CarDao carDao;
    public static void main(String[] args)
    {
        SpringApplication.run(testProjectNumberOneApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception
    {
        Car car =  new Car();
        car.setNumber(1810);
        car.setModel("Yamaha");

        Car car1 = new Car();
        car.setNumber(2210);
        car.setModel("BMV");

        carDao.save(car1);
        carDao.save(car);

    }
}
