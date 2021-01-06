package com.aleksandar.ConferenceProceedingsManager.model;
import com.aleksandar.ConferenceProceedingsManager.model.enums.ERole;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

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

    @Enumerated(EnumType.STRING)
    @Column(nullable=false, length=5)
    private ERole role;

    @Column(nullable=false, length=20)
    private String username;

    @OneToMany(mappedBy ="user" ,fetch = FetchType.LAZY)
    private Set<Conference> conferences;


}
