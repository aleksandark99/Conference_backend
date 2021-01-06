package com.aleksandar.ConferenceProceedingsManager.model;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name="proceedings")
public class Proceedings implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(unique=true, nullable=false)
    private Long id;

    @Column(nullable=false, length=100)
    private String title;

    @Column(nullable=false)
    private int year;

    @Column(length=100)
    private String publisher;

    @Column(length=20)
    private String isbn;

    private int volume;

    @Column(nullable=false)
    private boolean published;

    @Column(nullable=false)
    @ManyToOne
    private Conference conference;

    @OneToMany(mappedBy ="proceedings" ,fetch = FetchType.LAZY)
    private Set<Paper> papers;

    @OneToMany(mappedBy ="proceedings" ,fetch = FetchType.LAZY)
    private Set<Editor> editors;

    // Fali veza ka file


}
