package com.gbt.ems.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Employee {

  private long id;

  private String lastName;

  private String firstName;

  private String email;
}
