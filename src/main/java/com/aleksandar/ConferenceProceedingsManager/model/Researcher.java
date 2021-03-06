package com.aleksandar.ConferenceProceedingsManager.model;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name="researcher")
public class Researcher implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(unique=true, nullable=false)
    private Long id;

    @Column(nullable=false, length=100)
    private String firstName;

    @Column(nullable=false, length=100)
    private String lastName;

    @Column(length=100)
    private String title;

    @Column(length=200)
    private String institution;

    @Column(length=100)
    private String country;

    @Column(length=40)
    private String email;

    @Column(length = 20)
    private String ORCID;

    @OneToMany(mappedBy ="researcher", fetch = FetchType.LAZY)
    private Set<BoardMember> boardMembers;

    @OneToMany(mappedBy ="researcher", fetch = FetchType.LAZY)
    private Set<Editor> editors;

    @OneToMany(mappedBy ="researcher", fetch = FetchType.LAZY)
    private Set<Author> authors;
}
