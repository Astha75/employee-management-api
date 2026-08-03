package com.astha.employee;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;
@Service public class EmployeeService {
 private final EmployeeRepository repository; public EmployeeService(EmployeeRepository repository){this.repository=repository;}
 public Page<Employee> findAll(String department,int page,int size,String sortBy){Pageable pageable=PageRequest.of(page,size,Sort.by(sortBy).ascending()); return department==null?repository.findAll(pageable):repository.findByDepartmentIgnoreCase(department,pageable);}
 public Employee findOne(Long id){return repository.findById(id).orElseThrow(()->new ResourceNotFoundException("Employee",id));}
 public Employee create(Employee employee){return repository.save(employee);}
 public Employee update(Long id,Employee input){Employee e=findOne(id);e.setName(input.getName());e.setEmail(input.getEmail());e.setDepartment(input.getDepartment());e.setSalary(input.getSalary());return repository.save(e);}
 public void delete(Long id){repository.delete(findOne(id));}
}
