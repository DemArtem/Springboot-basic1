package org.itstep;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.GenerationTime;
import org.junit.Test;
import org.springframework.data.annotation.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import org.hibernate.annotations.Generated;
import sun.security.krb5.KrbException;
import sun.security.krb5.internal.ccache.MemoryCredentialsCache;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private MemoryCredentialsCache employeeRepository;

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

    @Test
    public void createEmployee() throws KrbException, IOException {
        Employee employee = new Employee();
        System.out.println(employee);
        employee.setEmail("d@gmail.com");
        employeeRepository.save();
        System.out.println(employee);

        assertEquals(employee.getFirstName(),"David");
        assertNull(employee.getPhoneNumber());
    }

}
