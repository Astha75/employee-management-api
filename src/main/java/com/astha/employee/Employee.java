package com.astha.employee;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.math.BigDecimal;
@Entity public class Employee {
  @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
  @NotBlank @Size(max=80) private String name;
  @Email @NotBlank private String email;
  @NotBlank @Size(max=60) private String department;
  @NotNull @PositiveOrZero private BigDecimal salary;
  public Long getId(){return id;} public String getName(){return name;} public void setName(String v){name=v;} public String getEmail(){return email;} public void setEmail(String v){email=v;} public String getDepartment(){return department;} public void setDepartment(String v){department=v;} public BigDecimal getSalary(){return salary;} public void setSalary(BigDecimal v){salary=v;}
}
