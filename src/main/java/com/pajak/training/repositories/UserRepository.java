package com.pajak.training.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;



import java.util.List;


@Repository
public interface UserRepository  {


    int countByAge(Integer age);

    boolean existsById(Long id);

    @Query(value = "select sum(age) from training_user", nativeQuery = true)
    Integer sumAgeForAllUser();

    @Query(value = "select sum(age) from User u")
    Integer sumAgeForAllUserv2();
}
