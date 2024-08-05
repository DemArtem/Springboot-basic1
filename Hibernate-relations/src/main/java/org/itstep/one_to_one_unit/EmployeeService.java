package org.itstep.one_to_one_unit;

import org.itstep.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    Employee.EmployeeRepository employeeRepository;

    @Autowired
    AddressRepository addressRepository;
}
