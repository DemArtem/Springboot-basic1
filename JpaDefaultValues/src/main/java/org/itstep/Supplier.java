package org.itstep;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import javax.persistence.*;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
class Supplier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "varchar(25) default 'Jane'")
    private String firstName;

    @Column(columnDefinition = "varchar(25) default 'Doe'")
    private String lastName;

    private String email="js@gmail.com";
    private String phoneNumber;
} 