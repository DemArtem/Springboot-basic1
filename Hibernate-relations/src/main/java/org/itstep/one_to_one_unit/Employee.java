package org.itstep.one_to_one_unit;

import lombok.Data;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToOne;
import javax.persistence.Entity;
import javax.persistence.*;
@Data
@Entity
@Table(name="employee")

public class Employee {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    private int age;

    @OneToOne(cascade = CascadeType.ALL)
    //@JoinColumn(name="address_id")
    private Address address;
} 