package com.JavaGuides.springBootBackEnd.model;

import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Employees")
public class Employee {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
@Column(name="firstName")
    private String firstName;
@Column(name = "lastName")
    private String lastName;
@Column(name = "emailID")
    private String emailId;

}
