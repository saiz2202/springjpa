package com.sathish.springjpa.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="users")
@SequenceGenerator(
        name="user_sequence",
        sequenceName ="user_sequence",
        allocationSize = 1,
        initialValue = 1
)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "user_sequence")
    private Long id;
    private String firstname;
    private String lastname;
    private String email;
    private Integer phoneno;

}
