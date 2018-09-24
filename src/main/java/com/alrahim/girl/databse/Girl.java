package com.alrahim.girl.databse;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
/**
 * @Entity means table in data base
 */
public class Girl {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private Integer age;
    private Integer tel;
}
