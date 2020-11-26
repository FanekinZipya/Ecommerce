package com.ecommerce.data.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Customer {
    @Id
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private String phoneNo;
}
