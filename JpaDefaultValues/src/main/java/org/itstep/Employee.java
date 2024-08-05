package org.itstep;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.GenerationTime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import javax.persistence.Column;
import javax.persistence.Entity;
import org.hibernate.annotations.Generated;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Employee {

    @Repository
    public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    }
    @Column(length = 25)
    @ColumnDefault("'David'")
    @Generated(GenerationTime.INSERT) //Значение по умолчанию добавляется при вставке
    // alternately @Column(columnDefinition = "VARCHAR(25) DEFAULT 'David'")
    private String firstName;

    @Column(length = 25)
    @ColumnDefault("'Smith'")
    private String lastName;

    @Column(unique = true, nullable = false)
    private String email;

    private String phoneNumber;


}
