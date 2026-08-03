package com.astha.employee;
import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
@RestController @RequestMapping("/api/employees") public class EmployeeController {
 private final EmployeeService service; public EmployeeController(EmployeeService service){this.service=service;}
 @GetMapping public Page<Employee> list(@RequestParam(required=false) String department,@RequestParam(defaultValue="0") int page,@RequestParam(defaultValue="10") int size,@RequestParam(defaultValue="name") String sortBy){return service.findAll(department,page,size,sortBy);}
 @GetMapping("/{id}") public Employee one(@PathVariable Long id){return service.findOne(id);}
 @PostMapping @ResponseStatus(HttpStatus.CREATED) public Employee create(@Valid @RequestBody Employee employee){return service.create(employee);}
 @PutMapping("/{id}") public Employee update(@PathVariable Long id,@Valid @RequestBody Employee employee){return service.update(id,employee);}
 @DeleteMapping("/{id}") @ResponseStatus(HttpStatus.NO_CONTENT) public void delete(@PathVariable Long id){service.delete(id);}
}
