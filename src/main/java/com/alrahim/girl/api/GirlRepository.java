package com.alrahim.girl.api;

import com.alrahim.girl.databse.Girl;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GirlRepository extends JpaRepository<Girl, Integer> {

    // query by age function relative
    public List<Girl> findByAge(Integer age);
//    public List<Girl> findOne(Integer id);
//    public void delete(Integer id);


}
