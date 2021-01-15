package com.aleksandar.ConferenceProceedingsManager.model;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="editor")
public class Editor implements Serializable {

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

    @ManyToOne(fetch = FetchType.LAZY,optional=false)
    private Researcher researcher;

    @ManyToOne
    private ResearcherRole researcherRole;

    @ManyToOne(optional=false)
    private Proceedings proceedings;
}
