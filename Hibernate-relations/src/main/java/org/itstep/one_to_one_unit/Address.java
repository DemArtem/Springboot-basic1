package org.itstep.one_to_one_unit;

import lombok.Data;
import org.springframework.data.annotation.Id;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Entity;
import javax.persistence.*;
@Data
@Entity
@Table(name="address")
public class Address {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    
    private String city;
    private String street;
} 