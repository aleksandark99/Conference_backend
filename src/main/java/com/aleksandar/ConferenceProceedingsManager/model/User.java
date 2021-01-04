package com.aleksandar.ConferenceProceedingsManager.model;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="user")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(unique=true, nullable=false)
    private Long id;

    @Column(nullable=false, length=100)
    private String firstName;

    @Column(nullable=false, length=100)
    private String lastName;

    @Column(nullable=false, length=20)
    private String password;

    @Column(nullable=false, length=5)
    private String role;

    @Column(nullable=false, length=20)
    private String username;


}
